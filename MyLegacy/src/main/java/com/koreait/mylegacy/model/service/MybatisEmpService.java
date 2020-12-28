package com.koreait.mylegacy.model.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koreait.mylegacy.model.dao.JdbcDeptDAO;
import com.koreait.mylegacy.model.dao.JdbcEmpDAO;
import com.koreait.mylegacy.model.dao.MybatisDeptDAO;
import com.koreait.mylegacy.model.dao.MybatisEmpDAO;
import com.koreait.mylegacy.model.domain.Dept;
import com.koreait.mylegacy.model.domain.Emp;
import com.koreait.mylegacy.model.pool.PoolManager;
import com.koreait.mylegacy.mybatis.config.MybatisConfigManager;

/* DAO에서 일시키는 목록 
 * MVC에서  Model 영역의 서비스를 정의한다. 
 * 서비스는 직접 로직을 수행하지는 않으며, 모델영역의 각 업무를 수행하는 객체를 
 * 제어하는 역할, 만일 Service의 존재가 없다면, 컨트롤러가 모델 영역의 복잡한 처리를
 * 직접 해야하므로, 어플리케이션 설계상 영역 구분이 약해지게 된다.. */
@Service
public class MybatisEmpService {
	@Autowired
	private MybatisConfigManager manager;
	@Autowired
	private MybatisEmpDAO mybatisEmpDAO;
	@Autowired
	private MybatisDeptDAO mybatisDeptDAO;
	//모든 사원 레코드 가져오기 
	public List selectAll() {
		List list =null;
		SqlSession sqlSession = manager.getSqlSession();
		mybatisEmpDAO.setSqlSession(sqlSession);
		list=mybatisEmpDAO.selectAll();
		manager.close(sqlSession);
		return list;	
	}
	
	//부서등록+사원등록 = 2개의 업무로 구성된 트랜잭션 
	public int regist(Emp emp) {
		int result=0;
		//일 시키기 전에 sqlsession 배분 
		SqlSession sqlSession =manager.getSqlSession();//default false
	
		mybatisEmpDAO.setSqlSession(sqlSession);
		mybatisDeptDAO.setSqlSession(sqlSession);
		
		//아래 두코드가 트랜잭션 대상이다.
		mybatisEmpDAO.insert(emp);
		mybatisDeptDAO.insert(emp.getDept());
		
		manager.close(sqlSession);
		return result;
	}
}
	
package com.koreait.mylegacy.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.koreait.mylegacy.model.domain.Emp;

@Repository
public class MybatisEmpDAO {
	SqlSession SqlSession=null;
	public void setSqlSession(SqlSession sqlSession) {
		this.SqlSession=sqlSession;
	}
	
	//목록가져오기
	public List selectAll() {
		List list =null;
		list=SqlSession.selectList("Emp.selectAll");
		return list;
	}
	//1건등록
	public int insert(Emp emp) {
		int result=0;
		SqlSession.insert("Emp.insert",emp); //emp안에 dept포함 
		return result;
	}
}

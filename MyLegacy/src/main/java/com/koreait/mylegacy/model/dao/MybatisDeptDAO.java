package com.koreait.mylegacy.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.koreait.mylegacy.exception.RegistException;
import com.koreait.mylegacy.model.domain.Dept;
import com.koreait.mylegacy.model.domain.Emp;

@Repository
public class MybatisDeptDAO {
	SqlSession SqlSession=null;
	public void setSqlSession(SqlSession sqlSession) {
		this.SqlSession=sqlSession;
	}
	
	//1건등록
	public int insert(Dept dept) throws RegistException{
		int result=0;
		result=SqlSession.insert("Dept.insert",dept); //emp안에 dept포함 
		//만일, 부서등록이 실패하면 여기서 억지로 예외를 발생시켜버리자
		if(result==0) {
			//자바에서는 에러를 억지로 발생시켜주는 기능이 지원 
			throw new RegistException("부서 등록에 실패하였습니다. ");//내가 만든예외 / 에러를 만나면 비정상 종료됨으로 서비스한테 전달해야됨
		}
		return result;
	}
}

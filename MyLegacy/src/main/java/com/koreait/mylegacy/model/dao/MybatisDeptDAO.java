package com.koreait.mylegacy.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.koreait.mylegacy.model.domain.Dept;
import com.koreait.mylegacy.model.domain.Emp;

@Repository
public class MybatisDeptDAO {
	SqlSession SqlSession=null;
	public void setSqlSession(SqlSession sqlSession) {
		this.SqlSession=sqlSession;
	}
	
	//1건등록
	public int insert(Dept dept) {
		int result=0;
		result=SqlSession.insert("Dept.insert",dept); //emp안에 dept포함 
		return result;
	}
}

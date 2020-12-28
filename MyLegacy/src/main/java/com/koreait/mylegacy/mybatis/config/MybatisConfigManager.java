/*�� Ŭ������ ����:
 * ������ ���࿡ �ʿ��� SqlSession�� ���� ���� �� �� �ֵ��� ���뼺�� ����Ͽ� 
 * ������ ��ü, Ư�� �� ��ü�� �ν��Ͻ��� ���ø����̼ǳ����� 1���� �־� �ϹǷ� SingleTon 
 * �������� �����Ѵ�!!
 * */ 
package com.koreait.mylegacy.mybatis.config;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Component;

@Component
public class MybatisConfigManager {
	//2) �����ڸ� �������Ƿ�, ���� Ŭ�������� �ν��Ͻ��� �������� ������ ����� ����� ����.
	//���� ���� Ŭ�������� getter�� ����������!!
	private static MybatisConfigManager instance;
	InputStream inputStream;
	SqlSessionFactory sqlSessionFactory;
	
	//1) �����ڸ� ���, �ƹ��� new ���ϰ� ������!!
	private MybatisConfigManager() {
		String resource = "com.koreait.mylegacy.mybatis.config/config.xml";
		try {
			inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	//3)  getter�� ����������, ���� �ν��Ͻ� �޼����̹Ƿ� new�� �������� ȣ���Ҽ��ֱ� ������
	//�� � ��ü�� �� �޼��带 ȣ���� �� ����..(new�� ���Ƴ�������...)
	//�ذ�å?  new ���� �ʰ� �Ʒ��� �޼��带 ȣ���� �� �ֵ���  static �޼���� ��������!
	public static MybatisConfigManager getInstance() {
		//4) �� �޼��� ȣ��� instance ������ null�̶��, ���⼭ �ν��Ͻ��� �����ؼ� 
		//    null�� �ƴ� ���� ���������� ó������!!
		if(instance == null) {
			instance = new MybatisConfigManager();
		}
		return instance;
	}
	
	//SqlSession ���, �ݱ� 
	public SqlSession getSqlSession() {
		SqlSession sqlSession = null;
		sqlSession = sqlSessionFactory.openSession();
		return sqlSession;
	}
	
	public void close(SqlSession sqlSession){
		if(sqlSession !=null) {
			sqlSession.close();
		}
	}
	
}
















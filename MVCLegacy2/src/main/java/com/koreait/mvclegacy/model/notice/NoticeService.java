package com.koreait.mvclegacy.model.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.koreait.mvclegacy.exception.DMLException;
import com.koreait.mvclegacy.model.domain.Notice;

@Service
public class NoticeService {
	//주입시키려 하는 자료형이 2개이상일경우 , 개발자는 원하는 객체를 명시해야한다 
	
	@Autowired
	@Qualifier("jdbcNoticeDAO") //해당클래스의 소문자로 간주! root-context에 따로 명시하지 않으면 id를 모르기때문에.. 알아보게 내가 앞글자 소문자로 바꿔서 설정 
	private NoticeDAO noticeDAO; //DI로 주입받기 위해서 상위 객체를 보유한다
	
	//mybatis 전용 , 그냥 팬이 아니라 프라이팬
	//jdbcNoticeDAO MybatisNoticeDAO ---->NoticeDAO(인터페이스로)
	
	//CRUD method 
	public List selectAll() {
		List list = noticeDAO.selectAll();
		return list;
	}
	
	public Notice select(int notice_id) {
		Notice notice = noticeDAO.select(notice_id);
		return notice;
	}
	
	public void insert(Notice notice)throws DMLException{
		noticeDAO.insert(notice);
	}
	public void update(Notice notice)throws DMLException{
		noticeDAO.update(notice);
	}
	public void delete(int notice_id)throws DMLException{
		noticeDAO.delete(notice_id);
	}	
	
}

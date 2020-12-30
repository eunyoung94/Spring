package com.koreait.mvclegacy.controller.client;
/*
 관리자 기능과 관련된 모든 요청을 처리하는 컨트롤러
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.koreait.mvclegacy.model.memeber.MemberService;

@Controller
public class ClientController {
	//ALL<DEBUG<INFO<WARN<ERROR<FATAL<OFF
	private static final Logger logger=LoggerFactory.getLogger(ClientController.class);//adminController와 관련된 로그를 logger에 담았기 때문에 쓸수 있다. 
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public String test() {
		logger.debug("test()메서드 호출!"); // 개발이 끝나면 src/main/resources log4.xml에 들어가서 info로 바꿔주면 된다 
		logger.debug("client에서 사용중인 memberService의 주소값 "+memberService);
		memberService.regist();
		
		return null;
	}
	
	
}

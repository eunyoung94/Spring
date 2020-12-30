package com.koreait.mvclegacy.controller.client;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.koreait.mvclegacy.exception.DMLException;
import com.koreait.mvclegacy.model.domain.Notice;
import com.koreait.mvclegacy.model.notice.NoticeService;

@Controller
public class NoticeController {
	private static final Logger logger=LoggerFactory.getLogger(NoticeController.class);

	@Autowired
	private NoticeService noticeService;
	
	//글쓰기 폼 요청 
	@RequestMapping("/notice/registform")
	public String getRegistForm() {
		return "notice/regist_form";
	}
	//글 등록처리 
	public String regist(Notice notice) {
		noticeService.insert(notice);
		return "redirect:/client/notice/list";
	}
	
	//모든글 가져오기 
	@RequestMapping(value="/notice/list",method=RequestMethod.GET)
	public ModelAndView selectAll() {
		logger.debug("글목록 메서드 호출");
		ModelAndView mav= new ModelAndView();
		List noticelist = noticeService.selectAll();
		mav.addObject("noticeList", noticelist);
		mav.setViewName("notice/list");
		return mav;
	}
	
	//한건 가져오기 
	@RequestMapping(value="/notice/detail",method=RequestMethod.POST)
	public ModelAndView select(int notice_id) {
		Notice notice=noticeService.select(notice_id);
		ModelAndView mav=new ModelAndView("notice/detail");
		mav.addObject("notice", notice);
		return mav;
	}
	
	
	//수정 요청 처리 
	@RequestMapping(value="/notice/edit", method=RequestMethod.POST)
	public ModelAndView update(Notice notice) {
		ModelAndView mav = new ModelAndView();
		try {
			noticeService.update(notice);
			//mav.addObject("msg", "등록성공");
			mav.setViewName("redirect:/client/notice/detail?notice_id="+notice.getNotice_id());
		} catch (DMLException e) {
			mav.addObject("msg", e.getMessage());
			mav.setViewName("message/result");
			e.printStackTrace();
		}
		return mav;
	}
	
	//삭제 요청 처리 
	@RequestMapping(value="/notice/del", method=RequestMethod.POST)
	public String delete(int notice_id) {
		noticeService.delete(notice_id);
		return "redirect:/client/notice/list";
	}
}


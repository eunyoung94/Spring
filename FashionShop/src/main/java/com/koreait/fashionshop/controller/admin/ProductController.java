package com.koreait.fashionshop.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//관리자모드에서 상품에대한 요청처리
@Controller
public class ProductController {
	//상위카테고리 가져오기
	
	//하위카테고리 가져오기
	
	//상품목록 
	@RequestMapping(value="/admin/product/list",method=RequestMethod.GET)
	public ModelAndView getProductList() {
		ModelAndView mav = new ModelAndView("admin/product/product_list");
		return mav;
	}
	//상품목록폼
	@RequestMapping(value="/admin/product/regist_form")
	public String registForm() {
		return"admin/product/regist_form";
	}
	//상품상세 
	
	//상품등록 
	
	//상품수정
	
	//상품삭제
}

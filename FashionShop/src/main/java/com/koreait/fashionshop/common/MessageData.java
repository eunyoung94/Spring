package com.koreait.fashionshop.common;

public class MessageData {
	private int resultCode;//실패, 성공 여부 판단 콛 
	private String msg; //클라이언트가 보게될 메세지 
	private String url;//새롭게 요청할 페이지가 있다면,, 그 url 
	
	public int getResultCode() {
		return resultCode;
	}
	public void setResultCode(int resultCode) {
		this.resultCode = resultCode;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
}

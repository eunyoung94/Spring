package com.koreait.fashionshop.exception;

//CRUD �۾��� �߻��Ǵ� ����
public class MemberNotFoundException extends RuntimeException{
	
	public MemberNotFoundException(String msg) {
		super(msg);
	}
	public MemberNotFoundException(String msg, Throwable e) {
		super(msg, e);
	}
}
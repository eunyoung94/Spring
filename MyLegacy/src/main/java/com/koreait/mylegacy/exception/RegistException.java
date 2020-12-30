package com.koreait.mylegacy.exception;

/*
 나만의 예외 커스터마이징
  이 예외는 컴파일 타임에 강요하지 않은 런타임 
 */
public class RegistException extends RuntimeException { //-->runtimeException 으로 해야됨 일반 Exception으로 하면 그 즉각 트라이캐치하라고 반응하기때문에 
	public RegistException(String msg) {
		super(msg);
	}
	public RegistException(String msg,Throwable e) { //메세지와 원인을 매개변수로 
		super(msg,e);
	}
}

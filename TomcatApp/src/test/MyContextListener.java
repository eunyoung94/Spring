package test;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/*
 톰켓과 같은 요청이 들어오기도 이전 시점인, 서버를 가동하는 시점의 이벤트를 감지 할 수 있는 
 ServletContextListener를 이용해서, ServletContext객체에 무언가를 작업해보자
 */
public class MyContextListener implements ServletContextListener {

	// 어플리케이션이 초기화될때 사용하는 메서드
	public void contextInitialized(ServletContextEvent sc) {
		System.out.println("application이 톰켓시작와 함께 시작됨!");
		// 어플리케이션의 전역적 정보를 가진 세션보다도 오래살아가는 servletContext에 비즈니스객체들 (Service,DAO)를 올리자
		ServletContext context=sc.getServletContext();
		context.setAttribute("msg","난오래살아");
		
		String obj=context.getInitParameter("contextConfigLocation");
		System.out.println("어플리케이션이 가동될때 메모리에 올려질 빈들은"+obj);
	}

	// 어플리케이션이 종료될때 호출되는 메서드
	public void contextDestroyed(ServletContextEvent sc) {
		System.out.println("application이 톰켓종료과 함께 종료됨!");
	}

}

package com.imooc.spring.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.imooc.spring.configuration.Store;
import com.imooc.spring.jsr.JsrService;

public class JsrTest {
	
	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/spring-config.xml");

	@Test
	public void testConfiguration() {
		JsrService jsrService = (JsrService) ctx.getBean("jsrService");
		jsrService.buyProduct(123456);
		System.out.println(jsrService.getClass().getName());
	}

}

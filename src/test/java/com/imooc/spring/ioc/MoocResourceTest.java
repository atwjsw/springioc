package com.imooc.spring.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.imooc.spring.resource.MoocResource;

public class MoocResourceTest {
	
	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/spring-resource.xml");

	@Test
	public void testMoocResource() {
		MoocResource mr = (MoocResource) ctx.getBean("moocResource");	
		mr.resource();
	}
	
}

package com.imooc.spring.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;

public class TestAware extends TestCase{
	
	//ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/spring-aware.xml");
	
	@Test
	public void testMoocApplicationContext() {
		//System.out.println(ctx.hashCode());
	}
	
	@Test
	public void testMoocBeanName() {
		
	}

}

package com.imooc.spring.ioc;

import org.junit.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import junit.framework.TestCase;

public class BeanLifecycleTest extends TestCase {

	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring/spring-beanlifecycle.xml");

	@Test
	public void testBeanLifecycle() {
		BeanLifecycle beanLifecycle = (BeanLifecycle) ctx.getBean("beanLifecycle");
		beanLifecycle.say();	
		ctx.close();		
	}	
}

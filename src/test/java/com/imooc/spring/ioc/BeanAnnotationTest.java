package com.imooc.spring.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.imooc.beanannotation.BeanAnnotation;

public class BeanAnnotationTest {
	
	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/spring-annotation.xml");

	@Test
	public void testMoocResource() {
		BeanAnnotation ba = (BeanAnnotation) ctx.getBean("BEANANNOTAION");	
		ba.say();
		BeanAnnotation ba2 = (BeanAnnotation) ctx.getBean("BEANANNOTAION");	
		ba2.say();
	}
	
}

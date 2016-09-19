package com.imooc.spring.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.imooc.beanannotation.BeanAnnotation;
import com.imooc.beanannotation.BeanCollection;

public class BeanCollectionTest {
	
	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/spring-collection.xml");

	@Test
	public void testBeanCollection() {
		BeanCollection bc = (BeanCollection) ctx.getBean("beanCollection");
		bc.listSay();		
	}
	
	@Test
	public void testBeanCollectionMap() {
		BeanCollection bc = (BeanCollection) ctx.getBean("beanCollection");
		bc.mapSay();		
	}
	
	@Test
	public void testBeanInterface() {
		BeanCollection bc = (BeanCollection) ctx.getBean("beanCollection");
		bc.iSay();		
	}

}

package com.imooc.spring.ioc;

import org.junit.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import junit.framework.TestCase;

public class BeanScopeTest extends TestCase {

	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/spring-beanscope.xml");

	@Test
	public void testBeanScope() {
		BeanScope beanScope1 = (BeanScope) ctx.getBean("beanScope");
		beanScope1.say();		
		BeanScope beanScope2 = (BeanScope) ctx.getBean("beanScope");
		beanScope2.say();		
		assertTrue(beanScope1==beanScope2);
	}
	
	@Test
	public void testBeanScopeProto() {
		BeanScopeProto beanScopeProto1 = (BeanScopeProto) ctx.getBean("beanScopeProto");
		beanScopeProto1.say();		
		BeanScopeProto beanScopeProto2 = (BeanScopeProto) ctx.getBean("beanScopeProto");
		beanScopeProto2.say();		
		assertFalse(beanScopeProto1==beanScopeProto2);
	}
	
	@Test
	public void testBeanScopeVariable() {
		BeanScopeVar beanScopeVS = (BeanScopeVar) ctx.getBean("beanScopeVS");
		beanScopeVS.say();		
		BeanScopeVar beanScopeVP = (BeanScopeVar) ctx.getBean("beanScopeVP");
		beanScopeVP.say();		
		//assertFalse(beanScopeProto1==beanScopeProto2);
	}
}


package com.imooc.spring.ioc;

import org.junit.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.imooc.spring.ioc.injection.dao.InjectionDAO;
import com.imooc.spring.ioc.injection.service.InjectionService;

import junit.framework.TestCase;

public class SpringInjectionTest extends TestCase {

	private InjectionService injectionService;

	// private InjectionDAO injectionDAO;

	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/spring-autowired.xml");

	@Test
	public void testOneInterface() {
		// injectionDAO = (InjectionDAO) ctx.getBean("injectionDAO");
		// injectionDAO.updateDB(1001);
		injectionService = (InjectionService) ctx.getBean("injectionServiceImpl");
		injectionService.buyProduct(1001);
	}
}
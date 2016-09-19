package com.imooc.spring.ioc;

import java.util.Date;
import java.util.List;

//import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import junit.framework.TestCase;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration({ "classpath:spring/spring-dao.xml" })
public class SpringUnitTest extends TestCase {

//    @Resource
	//@Autowired
	private OneInterface oneInterface;
	
	//@Autowired
	//private ApplicationContext ctx;

	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/spring-dao.xml");
	
	@Test
	public void testOneInterface() {
		oneInterface = (OneInterface)ctx.getBean("oneInterface");
		System.out.println(oneInterface.hello("Spring Framework"));
	}

	
}
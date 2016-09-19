package com.imooc.spring.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.imooc.beanannotation.BeanCollection;
import com.imooc.spring.configuration.MyDriverManager;
import com.imooc.spring.configuration.Store;
import com.imooc.spring.configuration.StringStore;

public class ConfigurationTest {
	
	ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/spring-config.xml");

	@Test
	public void testConfiguration() {
		Store store = (Store) ctx.getBean("storeVIP");
		System.out.println(store.getClass().getName());
	}
	
	@Test
	public void testDriverManager() {
		MyDriverManager manager = (MyDriverManager) ctx.getBean("myDriverManager");
		System.out.println(manager.getClass().getName());
	}

}

package com.imooc.spring.resource;

import java.io.IOException;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;

public class MoocResource implements ApplicationContextAware{
	
	private ApplicationContext ctx;

	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		this.ctx = ctx;	
		
		
	}
	
	public void resource() {
		//Resource rs = ctx.getResource("classpath:config.txt");
		//Resource rs = ctx.getResource("file:C:\\Users\\ewendia\\workspace\\ioc\\src\\main\\resources\\config.txt");
		Resource rs = ctx.getResource("url:https://spring.io/guides/gs/gradle/");
		
		System.out.println(rs.getFilename());
		try {			
			System.out.println(rs.contentLength());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

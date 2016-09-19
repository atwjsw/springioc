package com.imooc.spring.jsr;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import junit.framework.TestCase;


@Service
public class JsrService extends TestCase{
	
	@Resource
	private JsrDAO jsrDAO;

	@PostConstruct
	public void init() {
		System.out.println("initing");
		
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroying");
	}
	
	
	public void buyProduct(int productId) {
		System.out.println("Buying product from InjectionServiveImpl: " + productId);
		jsrDAO.updateDB(productId);
	}

}

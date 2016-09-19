package com.imooc.spring.jsr;

import org.springframework.stereotype.Repository;

@Repository
public class JsrDAO {
	
	public void updateDB(int productId) {
		System.out.println("Updating Database from InjectionDAOImpl. " + productId);
	}

}

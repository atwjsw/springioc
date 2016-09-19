package com.imooc.spring.ioc.injection.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.imooc.spring.ioc.injection.dao.InjectionDAO;

@Service
public class InjectionServiceImpl implements InjectionService {
	
	@Autowired
	private InjectionDAO injectionDAO;

//	public void setInjectionDAO(InjectionDAO injectionDAO) {
//		this.injectionDAO = injectionDAO;
//	}
	
//	public InjectionServiceImpl(InjectionDAO injectionDAO) {
//		this.injectionDAO = injectionDAO;
//	}

	public void buyProduct(int productId) {
		System.out.println("Buying product from InjectionServiveImpl: " + productId);
		injectionDAO.updateDB(productId);
	}
}

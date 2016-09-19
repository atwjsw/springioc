package com.imooc.spring.ioc.injection.dao;


import org.springframework.stereotype.Repository;

@Repository
public class InjectionDAOImpl implements InjectionDAO {

	public void updateDB(int productId) {
		System.out.println("Updating Database from InjectionDAOImpl. " + productId);
	}

}

package com.imooc.spring.ioc;

public class BeanLifecycle {
	
	public void defaultinit() {
		System.out.println("Bean defaultinti");
	}
	
	public void start() {
		System.out.println("Bean lifecycle starting");
	}
	
	public void say() {
		System.out.println("Bean lifecycle running");		
	}
	
	public void stop() {
		System.out.println("Bean lifecycle stopping");
	}
	
	public void defaultdestroy() {
		System.out.println("Bean defaultdestroy");
	}
}

package com.imooc.spring.ioc;

public class BeanScopeProto {
	public void say() {
		System.out.println("Bean scope prototype says: " + this.hashCode());
	}
}

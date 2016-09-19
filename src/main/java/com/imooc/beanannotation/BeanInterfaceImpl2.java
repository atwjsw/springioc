package com.imooc.beanannotation;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2)
@Component
public class BeanInterfaceImpl2 implements BeanInterface {

	@Override
	public void say() {
		System.out.println("I am " + this.getClass().getName());
	}

}

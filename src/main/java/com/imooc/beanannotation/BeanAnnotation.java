package com.imooc.beanannotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Scope("prototype")
@Component("BEANANNOTAION")
public class BeanAnnotation {
	
	public void say() {
		System.out.println("I am an annotated bean " + this.hashCode());
	}

}

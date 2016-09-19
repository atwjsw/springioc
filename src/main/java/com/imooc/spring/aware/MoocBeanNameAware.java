package com.imooc.spring.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MoocBeanNameAware implements ApplicationContextAware, BeanNameAware {

	private String beanName;
	
	@Override
	public void setBeanName(String name) {
		this.beanName = name;
		
	}	
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		MoocBeanNameAware moocBeanAware = (MoocBeanNameAware) ctx.getBean(this.beanName);
		System.out.println(moocBeanAware);
	}

}

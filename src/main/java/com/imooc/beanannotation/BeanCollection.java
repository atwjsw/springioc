package com.imooc.beanannotation;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BeanCollection {

	@Autowired
	@Qualifier("beanInterfaceImpl3")
	private List<BeanInterface> beans;
	
	@Autowired
	private Map<String, BeanInterface> beansMap;
	
	@Autowired
	@Qualifier("beanInterfaceImpl2")
	private BeanInterface beanI;

	public void listSay() {
		System.out.println("list...");
		if (beans != null && beans.size() != 0) {
			for (BeanInterface bi : beans) {
				bi.say();
			}
		} else {
			System.out.println("bean list is null");
		}
	}
	
	public void mapSay() {
		System.out.println("map...");
		if (beansMap != null && beansMap.size() != 0) {
			for (Map.Entry<String, BeanInterface> entry: beansMap.entrySet()) {
				System.out.print(entry.getKey()+ "    ");
				entry.getValue().say();
			}
		} else {
			System.out.println("bean map is null");
		}
	}
	
	public void iSay() {
		beanI.say();
	}
	
}

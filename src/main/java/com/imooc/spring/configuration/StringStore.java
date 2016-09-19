package com.imooc.spring.configuration;

public class StringStore implements Store {
	
	public String start() {
		System.out.println("starting");
		return null;
	}

	public String stop() {
		System.out.println("stopping");
		return null;
	}
}

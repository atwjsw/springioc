package com.imooc.spring.configuration;

public class MyDriverManager {
	
	public MyDriverManager(String username, String password, String url) {
		System.out.println("username: " + username);
		System.out.println("password: " + password);
		System.out.println("url: " + url);
	}

}

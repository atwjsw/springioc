package com.imooc.spring.ioc;

public class OneInterfaceTest implements OneInterface {

	@Override
	public String hello(String word) {
		// TODO Auto-generated method stub
		return "Hello " + word;
	}

	public static void main(String[] args) {
		OneInterface oneInterface = new OneInterfaceImpl();
		System.out.println("Tesing " + oneInterface.hello("Srping"));
	}

}

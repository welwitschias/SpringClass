package com.demo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.HelloWorld;

public class MainClass {

	public static void main(String[] args) {
		// beans.xml 파일을 로딩(필요한 객체들을 자동 생성)
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/demo/config/beans.xml");

		// ctx는 object type
		HelloWorld hello1 = (HelloWorld) ctx.getBean("hello"); // type 변환방법1
		callMethod(hello1);

		HelloWorld hello2 = ctx.getBean("hello", HelloWorld.class); // type 변환방법2
		callMethod(hello2);

		ctx.close();
	}

	public static void callMethod(HelloWorld hello) {
		hello.sayHello();
	}

}

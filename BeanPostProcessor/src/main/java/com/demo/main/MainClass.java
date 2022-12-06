package com.demo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.TestBean1;
import com.demo.beans.TestBean2;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/demo/config/beans.xml");

		// t1 객체를 가져옴(lazy-init, init-method)
		TestBean1 t1 = ctx.getBean("t1", TestBean1.class);
		System.out.printf("t1 = %s\n", t1);

		TestBean2 t2 = ctx.getBean("t2", TestBean2.class);
		System.out.printf("t2 = %s\n", t2);

		ctx.close();
	}

}

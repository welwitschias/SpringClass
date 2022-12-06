package com.demo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		// IoC(제어 역전) 컨테이너 : ApplicationContext
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/demo/config/beans.xml");

		TestBean t1 = ctx.getBean("tb", TestBean.class);
		System.out.printf("t1 = %s\n", t1);

		TestBean t2 = ctx.getBean("tb", TestBean.class);
		System.out.printf("t2 = %s\n", t2);

		ctx.close();
	}

}

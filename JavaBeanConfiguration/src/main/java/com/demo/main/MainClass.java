package com.demo.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.beans.TestBean1;
import com.demo.beans.TestBean2;
import com.demo.beans.TestBean3;
import com.demo.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		// Java로 bean 객체 만들기
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);

		TestBean1 java1 = ctx.getBean("java1", TestBean1.class);
		System.out.printf("java1 = %s\n", java1);
		System.out.println("====================");

		// name값을 따로 지정해 주었으므로 error 발생
//		TestBean1 java500 = ctx.getBean("java500", TestBean1.class);
//		System.out.printf("java500 = %s\n", java500);

		TestBean1 java600 = ctx.getBean("java600", TestBean1.class);
		System.out.printf("java600 = %s\n", java600);
		System.out.println("====================");

		// lazy 지정
		TestBean2 java2 = ctx.getBean("java2", TestBean2.class);
		TestBean2 java22 = ctx.getBean("java2", TestBean2.class);
		System.out.printf("java2 = %s\n", java2);
		System.out.printf("java22 = %s\n", java22);
		System.out.println("====================");

		// scope-prototype 지정
		TestBean3 java3 = ctx.getBean("java3", TestBean3.class);
		TestBean3 java33 = ctx.getBean("java3", TestBean3.class);
		System.out.printf("java3 = %s\n", java3);
		System.out.printf("java33 = %s\n", java33);

		ctx.close();
	}

}

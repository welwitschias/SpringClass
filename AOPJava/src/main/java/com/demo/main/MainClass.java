package com.demo.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.beans.TestBean;
import com.demo.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);

		TestBean java1 = ctx.getBean(TestBean.class);
		java1.method1();

		ctx.close();

	}

}

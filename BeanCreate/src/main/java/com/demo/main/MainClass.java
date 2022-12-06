package com.demo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/demo/config/beans.xml");

		// id가 없으므로 class의 type만 가지고 객체를 가져옴, 같은 type이 있을 경우 error 발생
//		TestBean t0 = ctx.getBean(TestBean.class);
		TestBean t0 = ctx.getBean("test0", TestBean.class);
		System.out.printf("t0 = %s\n", t0);

		// id가 있을 때 id로 가져옴
		TestBean t1 = ctx.getBean("test1", TestBean.class);
		System.out.printf("t1 = %s\n", t1);

		// t1과 t2는 test1의 객체를 가지므로 같은 객체임
		TestBean t2 = ctx.getBean("test1", TestBean.class);
		System.out.printf("t2 = %s\n", t2);

		// lazy-init=true는 객체를 가져올 때 생성함
		TestBean t3 = ctx.getBean("test2", TestBean.class);
		System.out.printf("t3 = %s\n", t3);

		// scope=prototype은 객체를 가져올 때마다 생성함
		TestBean t4 = ctx.getBean("test3", TestBean.class);
		TestBean t5 = ctx.getBean("test3", TestBean.class);
		System.out.printf("t4 = %s\n", t4);
		System.out.printf("t5 = %s\n", t5);

		ctx.close();
	}

}

package com.demo.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdvisorClass {

	public void beforeMethod() {
		System.out.println("beforeMethod 호출");
	}

	public void afterMethod() {
		System.out.println("afterMethod 호출");
	}

	public Object aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("aroundMethod 호출1");
		Object obj = pjp.proceed(); // 원래의 method를 호출한다.
		System.out.println("aroundMethod 호출2");

		return obj;
	}

}

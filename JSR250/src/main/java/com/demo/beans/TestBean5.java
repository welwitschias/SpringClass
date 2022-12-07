package com.demo.beans;

import javax.annotation.Resource;

public class TestBean5 {

	// 변수의 이름과 동일한 이름의 Bean이 주입된다.
	@Resource // Resource : Autowired와 Qualifier가 동시에 적용
	private DataBean1 data1;

	@Resource
	private DataBean2 data2;

	public DataBean1 getData1() {
		return data1;
	}

	public DataBean2 getData2() {
		return data2;
	}

}

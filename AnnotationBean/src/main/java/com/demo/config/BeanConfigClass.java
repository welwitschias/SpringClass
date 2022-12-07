package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.demo.beans.DataBean1;
import com.demo.beans.DataBean2;
import com.demo.beans.TestBean1;

@Configuration // beans.xml과 같은 역할
public class BeanConfigClass {

	@Bean
	public TestBean1 java1() {
		return new TestBean1();
	}

	@Bean
	public DataBean1 data_bean1() {
		return new DataBean1();
	}

	@Bean
	public DataBean2 obj1() {
		return new DataBean2();
	}

	@Bean
	public DataBean2 obj2() {
		return new DataBean2();
	}

}

package com.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TestBean1 {

	private int data1;

	private DataBean1 data2;

	// Autowired : 객체 자동 주입
	// required 속성 기본값은 true, false일 경우 bean 객체가 없어도 error는 안남
	@Autowired(required = false)
	private DataBean1 data3;

	@Autowired
	@Qualifier("obj1") // type이 같으면 error 발생하므로 이름 구분
	private DataBean2 data4;

	@Autowired
	@Qualifier("obj2")
	private DataBean2 data5;

	public int getData1() {
		return data1;
	}

	public void setData1(int data1) {
		this.data1 = data1;
	}

	public DataBean1 getData2() {
		return data2;
	}

	public void setData2(DataBean1 data2) {
		this.data2 = data2;
	}

	public DataBean1 getData3() {
		return data3;
	}

	public void setData3(DataBean1 data3) {
		this.data3 = data3;
	}

	public DataBean2 getData4() {
		return data4;
	}

	public void setData4(DataBean2 data4) {
		this.data4 = data4;
	}

	public DataBean2 getData5() {
		return data5;
	}

	public void setData5(DataBean2 data5) {
		this.data5 = data5;
	}

}

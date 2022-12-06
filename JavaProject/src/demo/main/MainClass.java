package demo.main;

import demo.beans.HelloWorld;
import demo.beans.HelloWorldEn;
import demo.beans.HelloWorldKo;

public class MainClass {

	public static void main(String[] args) {
		HelloWorld helloEn = new HelloWorldEn();
		helloEn.sayHello();
		callMethod(helloEn);

		HelloWorld helloKo = new HelloWorldKo();
		helloKo.sayHello();
		callMethod(helloKo);
	}

	public static void callMethod(HelloWorld hello) {
		hello.sayHello();
	}
	
}

package com.geminno.exercise;

public class Modifier02 {

	public void methodB1(){
		Modifier01 a=new Modifier01();
		//a.methodA1();
		//a.methodA2();methodA2是私有的
		//a.methodA3();default方法只能是同一个包中的类才能访问
		
		//a.methodA4();
		a.methodA4();
		}
			
	public static void main(String[] args) {
		Modifier02 b=new Modifier02();
		b.methodB1();
	}

}

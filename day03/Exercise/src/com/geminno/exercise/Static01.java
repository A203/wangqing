package com.geminno.exercise;

public class Static01 {

	/**
	 * @param args
	 */
	
	int age;
	
	void hello(){
		System.out.println("hello....");
	}
	
	static String name="张三";
	
	
	//静态方法，也称之为类方法
	static void hi(){
		System.out.println("hi....");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static01 s=new Static01();
		/*
		//当我们调用属性和方法的时候，一定是调用某个实例对象的属性或方法
		 s.age=10;
		 s.hello();
		 */
		System.out.println(Static01.name);
		Static01.hi();
//s.hi();
	}

}

package com.geminno.exercise;

public class ClassLoading01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Person1();

	}

}
class Person1{
	Person1(){
		System.out.println(1);
	}
	{
		System.out.println(2);
	}
}
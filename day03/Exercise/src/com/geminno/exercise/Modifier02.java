package com.geminno.exercise;

public class Modifier02 {

	public void methodB1(){
		Modifier01 a=new Modifier01();
		//a.methodA1();
		//a.methodA2();methodA2��˽�е�
		//a.methodA3();default����ֻ����ͬһ�����е�����ܷ���
		
		//a.methodA4();
		a.methodA4();
		}
			
	public static void main(String[] args) {
		Modifier02 b=new Modifier02();
		b.methodB1();
	}

}
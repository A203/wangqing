package com.geminno.exercise;

public class Static01 {

	/**
	 * @param args
	 */
	
	int age;
	
	void hello(){
		System.out.println("hello....");
	}
	
	static String name="����";
	
	
	//��̬������Ҳ��֮Ϊ�෽��
	static void hi(){
		System.out.println("hi....");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static01 s=new Static01();
		/*
		//�����ǵ������Ժͷ�����ʱ��һ���ǵ���ĳ��ʵ����������Ի򷽷�
		 s.age=10;
		 s.hello();
		 */
		System.out.println(Static01.name);
		Static01.hi();
//s.hi();
	}

}
package com.geminno.exercise;


//һ����������г��󷽷�����������ǳ�����
public abstract class Anmial{
	//abstract���η�����ʾ��������ǳ��󷽷�
	public abstract void sleep();
}

//����̳г����࣬����Ҫʵ�ָ����е����г��󷽷�����������Ҳ�ǳ����
//abstract class Tiger extends Animal
class Tiger extends Anmial{
	
	@Override
	 public void sleep(){
		 System.out.println("ſ��˯...");
	 }
}

class Monkey extends Anmial{
	public void sleep(){
		System.out.println("����˯...");
	}
}

//ĳ�����ǳ����࣬�������п���û�г��󷽷�
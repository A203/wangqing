package com.geminno.exercise;


public class This {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person=new Person("Jim",20,"USA");
		person.introduce();

	}

}
class Person{
	String name;
	int age;
	String address;
	
	public Person(){}
	public Person(String name,int age){
		this.name=name;//thisָ��ǰʵ�����󣬡��ҡ�    ���﷨�൱�ڡ��ġ�
		this.age=age;
	}
	public Person(String name,int age,String address){
		this(name,age);//���õ�ǰ������������Ĺ��췽��
		this.address=address;
	}
	
	void hello(){
		System.out.println("hello....");
	}
	
	void introduce(){
		System.out.println("name:"+this.name+"\tage:"+this.age+"\taddress:"+this.address);
		this.hello();//this.����ʡ��

	}

}

/*
 thisָ��ǰ����
 
 1.this�������ڹ��췽���ڲ�����������ͬ���ĳ�Ա�����;ֲ�����
 2.this�������ڵ��ù��췽�����������ࣨ�ڹ��췽����ͨ��this�����������췽��ʱ���������ǵ�һ�䣩
 3.this�������ڵ��ó�Ա���Ժͳ�Ա����
 */
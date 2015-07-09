package com.geminno.exercise;

public class Student {

	/**
	 * @param args
	 */
	
	String name;
	int age;
	String address;
	
	
/*	//无参默认构造方法
	Person(){
		System.out.println("Person的默认构造方法被调用。。。。");
	}
	*/
	//有参构造方法
	Student(String n,int a,String add){
		name=n;
		age=a;
		address=add;
	}
	
	//自我介绍
	void introduce(){
		System.out.println("大家好，我叫"+name+",今年"+age+"岁了，我在"+address);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        Person person=new Person();  //实例化一个person对象
//        person.name="张三";
//        person.age=20;
//        person.address="USA";
         
		Student person=new Student("Jim",30,"北京");
        person.introduce();
	}

}

//当没有构造方法时，系统会自动生成一个默认的构造方法

//构造方法是一种比较特殊的方法
//没有返回类型，方法名和类同名

//有参构造方法



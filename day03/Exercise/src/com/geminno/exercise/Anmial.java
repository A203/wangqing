package com.geminno.exercise;


//一个类中如果有抽象方法，则这个类是抽象类
public abstract class Anmial{
	//abstract修饰方法表示这个方法是抽象方法
	public abstract void sleep();
}

//子类继承抽象父类，必须要实现父类中的所有抽象方法，否则子类也是抽象的
//abstract class Tiger extends Animal
class Tiger extends Anmial{
	
	@Override
	 public void sleep(){
		 System.out.println("趴着睡...");
	 }
}

class Monkey extends Anmial{
	public void sleep(){
		System.out.println("仰着睡...");
	}
}

//某个类是抽象类，但是其中可以没有抽象方法

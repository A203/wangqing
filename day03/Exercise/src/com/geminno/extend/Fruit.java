package com.geminno.extend;

public abstract class Fruit {
      
}

class  Apple extends Fruit{
	public String toString(){
		return "苹果";
	}
}

class  Mango extends Fruit{
	public String toString(){
		return "芒果";
	}
}

class  Juicer{
	public void juice(Fruit fruit){
		System.out.println("榨"+fruit+"汁");
	}
	public static void main(String[] args){
		Juicer j=new Juicer();
		
		Fruit fruit=new Mango();//new Apple();
		
		j.juice(fruit);
		
	}
}

//多态，父类的某一种类型在不同的子类中有不同的形态
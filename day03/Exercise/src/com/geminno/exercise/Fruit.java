package com.geminno.exercise;

public class Fruit {

	private static final String String = null;
	/**
	 * @param args
	 */
	
	String name;
	int price;
	String addr;
	
	Fruit(){}
		Fruit(String n,int p,String a){
			name=n;
			price=p;
			addr=a;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fruit f=new Fruit("ƻ��",5,"ɽ��");
		System.out.println(f.name);

	}

}
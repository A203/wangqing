package com.geminno.homework;

public class Demo06 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Army a=new Army(4);
		a.addWeapon(new Tank());
		a.addWeapon(new Flighter());
		a.addWeapon(new Warship());
		a.addWeapon(new Warship());
		a.moveAll();
		a.attackAll();

	}

}

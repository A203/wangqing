package com.geminno.homework;

	class Tank extends Weapon{	
		public void move(){
			System.out.println("移动坦克！！！");
		}

		public void attack() {
			// TODO 自动生成的方法存根
			System.out.println("坦克攻击！！！");
		}
	}

	class Flighter extends Weapon{
		public void attack(){
			System.out.println("战斗机攻击！！！");
		}
		
		public void move(){
			System.out.println("战斗机移动！！！");
		}
	}

	class Warship extends Weapon{
		public void attack(){
			System.out.println("战船攻击！！！");
		}
		
		public void move(){
			System.out.println("战船移动！！！");
		}
	}

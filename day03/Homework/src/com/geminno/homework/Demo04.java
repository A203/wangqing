package com.geminno.homework;

	class Tank extends Weapon{	
		public void move(){
			System.out.println("�ƶ�̹�ˣ�����");
		}

		public void attack() {
			// TODO �Զ����ɵķ������
			System.out.println("̹�˹���������");
		}
	}

	class Flighter extends Weapon{
		public void attack(){
			System.out.println("ս��������������");
		}
		
		public void move(){
			System.out.println("ս�����ƶ�������");
		}
	}

	class Warship extends Weapon{
		public void attack(){
			System.out.println("ս������������");
		}
		
		public void move(){
			System.out.println("ս���ƶ�������");
		}
	}

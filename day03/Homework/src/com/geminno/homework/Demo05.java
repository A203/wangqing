package com.geminno.homework;

	class Army{
		Weapon[] w;
		int max;
		int j=0;
		
		public int getMax(){
			return max;
		}
		
		public void setMax(int max){
			this.max=max;
		}
		
		public Army(int max){
			w=new Weapon[max];
			this.max=max;
			System.out.println("�����ӵ��"+max+"������������");
		}
		
		public void addWeapon(Weapon wa){
			if(j<getMax()){
				System.out.println("�������㹻��"+"������"+(j+1)+"������");
				w[j]=wa;
				j++;
			}
			else{
				System.out.println("���棺����������������������������������");
			}
		}
		
		public void attackAll(){
			System.out.println();
			System.out.println("��������׼��ս��������");
			for(int i=0;i<w.length;i++){
				System.out.println((i+1)+"��");
				w[i].attack();
			}
		}
		
		public void moveAll(){
			System.out.println();
			System.out.println("��������׼���ƶ�������");
			for(int i=0;i<w.length;i++){
				System.out.println((i+1)+"��");
				w[i].move();
			}
		}
	}
	


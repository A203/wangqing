package com.geminno.demo;

public class VarDemo {

	/**
	 * @param args
	 */
	static int number;//���������
	int age;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���ʷ�ʽ��������������
        //System.out.println(VarDemo.number);
		//���ʷ�ʽ��������������
		VarDemo demo=new VarDemo();
        System.out.println("ageȡֵ"+demo.age);
        //���ʷ�ʽ������������
//        VarDemo demo1=new VarDemo();
//       demo1.show();
//        
//        VarDemo demo2=new VarDemo();
//        demo2.show();    
        
        VarDemo demo1=new VarDemo();
        demo1.min(5);
	}
	
	
	public void show()
	{
		number++;
		age++;
		System.out.println("�����number"+number);
		System.out.println("�����age"+age);
	}
	
	public void min(int i)
	{
		int age=5;
		System.out.println("����age"+age);
		System.out.println("�ֲ�����age"+this.age);
		int j=0;
		if(i>j)
		{
			int k=j;//k��ʾ����������Сֵ
		}
		System.out.println(j);
		
	}

}

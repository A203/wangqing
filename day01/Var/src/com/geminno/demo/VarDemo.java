package com.geminno.demo;

public class VarDemo {

	/**
	 * @param args
	 */
	static int number;//定义类变量
	int age;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//访问方式，类名，属性名
        //System.out.println(VarDemo.number);
		//访问方式，类名，属性名
		VarDemo demo=new VarDemo();
        System.out.println("age取值"+demo.age);
        //访问方式，对象，属性名
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
		System.out.println("类变量number"+number);
		System.out.println("类变量age"+age);
	}
	
	public void min(int i)
	{
		int age=5;
		System.out.println("变量age"+age);
		System.out.println("局部变量age"+this.age);
		int j=0;
		if(i>j)
		{
			int k=j;//k表示两个数的最小值
		}
		System.out.println(j);
		
	}

}

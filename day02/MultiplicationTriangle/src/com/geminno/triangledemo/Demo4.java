package com.geminno.triangledemo;

import java.util.Scanner;

public class Demo4 {

	/**
	 * @param args
	 */
	//请用户输入1-10之间的数字
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input=new Scanner(System.in);
	        System.out.println("请输入1-10之间的数：");
	        int num=input.nextInt();
	         for (int i=1;i<=num;i++){
	        //打印空格
	        	 for(int j=1;j<=num-i;j++){
	        		 System.out.print(" ");
	        	 }
	        	 
	        	 //打印行
	        	   for(int j=1;j<=i*2-1;j++){
	        		 System.out.print(i);
	        	 }
	        	 System.out.println();
	         }
	        
	}

}

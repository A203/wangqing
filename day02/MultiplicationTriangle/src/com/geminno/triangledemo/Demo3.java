package com.geminno.triangledemo;

import java.util.Scanner;

public class Demo3 {

	/**
	 * @param args
	 */
	//三角图案打印
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.println("请输入行号：");
        int num=input.nextInt();
        
         for (int i=1;i<=num;i++){
      /*   //打印空格
        	 for(int j=1;j<=num-i;j++){
        		 System.out.print(" ");
        	 }
        	 
        	 //打印星号
        	   for(int j=1;j<=i*2-1;j++){
        	  */
        	 for(int j=1;j<=i;j++){
        		 System.out.print("*");
        	 }
        	 System.out.println();
         }
	}

}

/*
       * 
      *** 
     *****
    ******* 
   ********* 
  *********** 
 ************* 
 总行数：7行
 行号                           空格数                           星号
 1          6          1
 2          5          3
 3          4          5
 i          7-i        2*i-1
 */

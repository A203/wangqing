package com.geminno.exercisedemo;

import java.util.Scanner;

public class Demo5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println("请输入选择（1-3）：");
		  Scanner scanner=new Scanner(System.in);
	      int number=scanner.nextInt();
	      String numString="";
	        switch(number)
	        {
	        case 1:numString="增加一个学生";break;
	        case 2:numString="显示一个学生";break;
	        case 3:numString="退出程序";break;
	        default:numString="error number";
	        }
	        System.out.println(numString);
	}

}

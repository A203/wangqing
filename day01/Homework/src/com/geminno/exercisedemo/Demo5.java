package com.geminno.exercisedemo;

import java.util.Scanner;

public class Demo5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println("������ѡ��1-3����");
		  Scanner scanner=new Scanner(System.in);
	      int number=scanner.nextInt();
	      String numString="";
	        switch(number)
	        {
	        case 1:numString="����һ��ѧ��";break;
	        case 2:numString="��ʾһ��ѧ��";break;
	        case 3:numString="�˳�����";break;
	        default:numString="error number";
	        }
	        System.out.println(numString);
	}

}

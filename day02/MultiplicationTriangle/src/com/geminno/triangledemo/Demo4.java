package com.geminno.triangledemo;

import java.util.Scanner;

public class Demo4 {

	/**
	 * @param args
	 */
	//���û�����1-10֮�������
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input=new Scanner(System.in);
	        System.out.println("������1-10֮�������");
	        int num=input.nextInt();
	         for (int i=1;i<=num;i++){
	        //��ӡ�ո�
	        	 for(int j=1;j<=num-i;j++){
	        		 System.out.print(" ");
	        	 }
	        	 
	        	 //��ӡ��
	        	   for(int j=1;j<=i*2-1;j++){
	        		 System.out.print(i);
	        	 }
	        	 System.out.println();
	         }
	        
	}

}
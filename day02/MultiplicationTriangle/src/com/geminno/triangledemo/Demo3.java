package com.geminno.triangledemo;

import java.util.Scanner;

public class Demo3 {

	/**
	 * @param args
	 */
	//����ͼ����ӡ
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.println("�������кţ�");
        int num=input.nextInt();
        
         for (int i=1;i<=num;i++){
      /*   //��ӡ�ո�
        	 for(int j=1;j<=num-i;j++){
        		 System.out.print(" ");
        	 }
        	 
        	 //��ӡ�Ǻ�
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
 ��������7��
 �к�                           �ո���                           �Ǻ�
 1          6          1
 2          5          3
 3          4          5
 i          7-i        2*i-1
 */
package com.geminno.ifdemo;

import java.util.Scanner;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//根据学生的分数，输出学生的分数等级
		Scanner scanner=new Scanner(System.in);
		int score=scanner.nextInt();//输入整数
		if(score>=90)
		{
			System.out.println("等级为A");
		}
		/*if(score>=80&&score<90)
		{
			System.out.println("等级为B");
		}
		if(score>=70&&score<80)
		{
			System.out.println("等级为C");
		}
		if(score>=60&&score<70)
		{
			System.out.println("等级为D");
		}
		if(score<60)
		{
			System.out.println("等级为E");
		}*/
		else if(score>=80)
		{
			System.out.println("等级为B");
		}
		else if(score>=70)
		{
			System.out.println("等级为C");
		}
		else if(score>=60)
		{
			System.out.println("等级为D");
		}
		else
		{
			System.out.println("等级为E");
		}
	}

}

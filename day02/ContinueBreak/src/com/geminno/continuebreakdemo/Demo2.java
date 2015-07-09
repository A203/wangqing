package com.geminno.continuebreakdemo;

public class Demo2 {

	/**
	 * @param args
	 */
	//打印1-99之间能被5整除的所有整数
	//并记录不符合要求的数字的个数
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int num=0;
	       for(int i=1;i<=99;i++){
	    	   if(i%5==0){
	    		   System.out.println(i);
	    		   continue;
	    	   }
	    	   num++;
	       }
	       System.out.println("num:"+num);
	}
}

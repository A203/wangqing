package com.geminno.continuebreakdemo;

public class Demo3 {

	/**
	 * @param args
	 */
	//1-100之间的质数及其个数
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num=0;
		for(int i=2;i<=100;i++){
			boolean flag=true;
			for(int j=2;j<i;j++){
				if(i%j==0){
					flag=false;
					break;
				}	
			}
			if(flag==true){
				System.out.println(i+"\t");
				num++;
			}
		}	
		System.out.println("1-100之间质数的个数是："+num);
	}

}

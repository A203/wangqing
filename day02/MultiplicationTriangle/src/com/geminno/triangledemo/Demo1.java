package com.geminno.triangledemo;

public class Demo1 {

	/**
	 * @param args
	 */
	//2-50之间的质数
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2;i<=50;i++){
			boolean flag=true;
			for(int j=2;j<i;j++){
				if(i%j==0){
					flag=false;
					break;
				}	
			}
			if(flag==true){
				System.out.println(i+"\t");
			}
		}	
	}

}

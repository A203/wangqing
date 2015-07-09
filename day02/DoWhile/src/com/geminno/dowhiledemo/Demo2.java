package com.geminno.dowhiledemo;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
        do{
        	if(i%5==0){
        		System.out.println(i+"\t");
        	}
        	i++;
        }while(++i<=99);
	}

}

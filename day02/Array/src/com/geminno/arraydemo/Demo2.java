package com.geminno.arraydemo;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[];
        int []a1;
       // int a2[5];//��������ʱ����ָ�����鳤��
        
        
        //�����ڴ�ռ�
        a=new int[3];
        
        int size=5;
        a1=new int[size];
        
        
        //�����ʼ��
        a[0]=1;
        a[1]=2;
        a[2]=3;
        
        
        //��ʽ2
        int b[]={1,2,3,4,5};
        int b1[]=new int[]{1,2,3,4,5};
        //int b2[]=new int[5]{1,2,3,4,5}; //��������˳�ʼ����������ָ������
       /* int b3[];
        b3={1,2,3,4,5};*/
        
        //���a���������
        System.out.println("���鳤�ȣ�"+a.length);
        for(int i=0;i<a.length;i++){
        	System.out.println(a[i]);
        }
        
        
        //ð������
        int c[]={8,5,7,4};
        int temp=0;
        for(int i=c.length-1;i>0;i--){
        	for(int j=0;j<i;j++){
        		if(c[i]<c[j]){
        			temp=c[i];
        			c[i]=c[j];
        			c[j]=temp;
        		}
        	}        	
        }       
        for(int i=0;i<c.length;i++){
        	System.out.println(c[i]);
        }
        
        
	}

}

package type;

public class DataType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//byte���͵Ķ�����λ���������Сֵ
       System.out.println("�������ͣ�byte������λ��"+Byte.SIZE);
       System.out.println("�������ͣ�byte���ֵ"+Byte.MAX_VALUE);
       System.out.println("�������ͣ�byte���ֵ"+Byte.MIN_VALUE);
     //float���͵Ķ�����λ���������Сֵ
       System.out.println("�������ͣ�float������λ��"+Float.SIZE);
       System.out.println("�������ͣ�float���ֵ"+Float.MAX_VALUE);
       System.out.println("�������ͣ�float���ֵ"+Float.MIN_VALUE);
       
       //byte����������ȡֵ
       byte b=50;
       //byte b1=130;    ����byte���ͱ�ʾ��ȡֵ��Χ
       //float������ֵ
       float f=10.0f;
       
       double d=20.0;
       
       //char���͵ĸ�ֵ
       char ch1='A';
       char ch2=65;
       System.out.println(ch1+" "+ch2);
       
       char ch3='��';
       System.out.println(ch3);
	}
}
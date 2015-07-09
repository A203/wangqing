package type;

public class DataType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//byte类型的二进制位数及最大最小值
       System.out.println("基本类型：byte二进制位数"+Byte.SIZE);
       System.out.println("基本类型：byte最大值"+Byte.MAX_VALUE);
       System.out.println("基本类型：byte最大值"+Byte.MIN_VALUE);
     //float类型的二进制位数及最大最小值
       System.out.println("基本类型：float二进制位数"+Float.SIZE);
       System.out.println("基本类型：float最大值"+Float.MAX_VALUE);
       System.out.println("基本类型：float最大值"+Float.MIN_VALUE);
       
       //byte二进制数的取值
       byte b=50;
       //byte b1=130;    引出byte类型表示的取值范围
       //float变量赋值
       float f=10.0f;
       
       double d=20.0;
       
       //char类型的赋值
       char ch1='A';
       char ch2=65;
       System.out.println(ch1+" "+ch2);
       
       char ch3='中';
       System.out.println(ch3);
	}
}

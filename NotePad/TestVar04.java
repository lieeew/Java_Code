public class TestVar04{
	public static void main (String [] arges){
		int  num1 = 12;//默认情况下赋值为10进制
		System.out.println(num1);
		int num2 = 012;//前面加一个0,这个值就是8进制
		System.out.println(num2);
		int num3 = 0x15; //前面加一个0x或0X就为十六进制
		System.out.println(num3);
		int num4 = 0b1000101;//前面加0b或0B就是二进制
		System.out.println(num4);
		/*int num5 = 123456789000;
		System.out.println(num4);*/   //过大会报错
		long num5 = 12346678900L;
		System.out.println(num5);
		
		
	}
}
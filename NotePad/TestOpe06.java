import java.util.Scanner;
public class TestOpe06{
	public static void main(String[] arges){
	Scanner input = new Scanner(System.in);
	System.out.println("请输入两个数字:");
	int num1 = input.nextInt();
	int num2 = input.nextInt();
	System.out.println("变换前:"+num1+"\t"+num2);
	int t = num1;   // 用一个变量存储num1
	num1 = num2;
	num2 = t;
	System.out.println("变换后:"+num1+"\t"+num2);
	
	}
}
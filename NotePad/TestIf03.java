/*import java.util.*;
public class TestIf03{
	public static void main(String[] arges){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入三个数字:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int sum = 0;
		sum += num1;
		sum += num2;
		sum += num3;
		// if-else 双循环可以被条件运算符代替
		System.out.println(sum > 14? "中奖了":"没中奖");
		if (sum > 14){
			System.out.println("中奖了");
		}else {
			System.out.println("没中奖");
		}
	}
}*/



public class TestIf03{
	public static void main(String[] arges){
		int num1 = (int)(Math.random()*6) +1;  //随机数
		int num2 = (int)(Math.random()*6) +1;
		int num3 = (int)(Math.random()*6) +1;
		int sum = 0;
		sum += num1;
		sum += num2;
		sum += num3;
		System.out.println("和为:"+sum);
		System.out.println(sum >= 14?"中奖了":"没中奖");
		if (sum >= 14){
			System.out.println("中奖了");
		}else{
			System.out.println("没中奖");
		}
		}
	}
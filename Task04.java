import java.util.Scanner;
public class Task04 {

	//编写一个main方法
	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入3位整数(判断是否为水仙花数)");
		int number = myScanner.nextInt();//目前不会char转数,使用int
		// char num1 = number.charAt(0);
		// char num2 = number.charAt(1);
		// char num3 = number.charAt(2);
		// int number2 = Integer.parseInt(number);
		
		/*
		 判断一个整数是否为水仙花数
		 水仙花数是指一个三位数,其各个位上数字立方和等于其本身
		 例如: 153 = 1 * 1 * 1 + 5 * 5 * 5 + 3 * 3 * 3

		 思路分析
		 1. 比如 int n = 153
		 2. 先得到n的百位,十位,个位的数字,使用if判断他们的立方和是否等于n
		 3. 的百位 = n / 100
		 4. 的十位 = n % 100 / 10
		 5. 的个位 = n % 10
		 判断即可
		 */
		
		int num1 = number / 100;
		int num2 = number % 100 / 10;
		int num3 = number % 10;
		if (number == num1 * num1 * num1 + num2 * num2 *num2 
			+ num3 * num3 * num3) {
			System.out.println(number + "是水仙花数");
		} else {
			System.out.println(number + "不是水仙花数");
		}
	}
}
import java.util.Scanner;
public class Task02 {

	//编写一个main方法
	public static void main(String[] args) {

		//判断一个整数属于哪个范围:大于0,等于0,小于0
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int num = myScanner.nextInt();
		if (num > 0) {
			System.out.println("整数大于0");
		} else if (num == 0) {
			System.out.println("整数等于0");
		} else {
			System.out.println("整数小于0");
		}
	}
}
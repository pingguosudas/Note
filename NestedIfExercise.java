import java.util.Scanner;
public class NestedIfExercise {

	//编写一个main方法
	public static void main(String[] args) {

		/*
		 出票系统：根据淡旺季的月份和游客年龄，打印票价
		 4~10 旺季：
		      成人（18~60）：60
		      儿童（<18）：半价
		      老人（>60）：1/3

		      淡季：
		      成人：40
		      其他：20
		 */
		
		//思路分析
		//（1）淡旺季 使用 if-else
		//（2）旺季中 使用多分支处理三种情况
		//（3）淡季 使用双分支
		
		Scanner myScanner = new Scanner(System.in);

		System.out.println("请输入月份");

		byte month = myScanner.nextByte();

		if (month >= 4 && month <= 10) {
			System.out.println("请输入年龄");

			int age = myScanner.nextInt();

			if (age >= 18 && age <= 60) {
				System.out.println("票价=" + 60);
			} else if (age < 18) {
				System.out.println("票价=" + (60/2));
			} else {
				System.out.println("票价=" + (60/3));
			}
		} else {
			System.out.println("请输入年龄");

			int age = myScanner.nextInt();

			if (age >= 18 && age <= 60) {
				System.out.println("票价=" + 40);
			} else {
				System.out.println("票价=" + 20);
			}
		}
	}
}
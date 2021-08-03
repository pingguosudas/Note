import java.util.Scanner;
public class InputSelf {

	//编写一个main方法
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("请输入姓名");
		String name = input.next();
		System.out.println("请输入年龄");
		int age = input.nextInt();
		System.out.println("请输入薪水");
		double sal = input.nextDouble();
		System.out.println("人的信息如下");
		System.out.println("name=" + name + " age=" 
			+ age + " sal=" + sal);
	}
}
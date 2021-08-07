import java.util.Scanner;
public class Array02 {

	//编写一个main方法
	public static void main(String[] args) {

		//演示数据类型数组名[]=new 数据类型[大小]
		//循环输入5个成绩,保存到double数组,并输出
		
		//步骤
		//1.创建一个double数组,大小为5
		
		//(1) 第1种动态分配方式
		//double scores[] = new double[5];
		//(2) 第2种动态分配方式,先声明数组,再new(分配空间)
		double scores[];//声明数组,这时scores是null
		scores = new double[5];//分配内存空间,可以存放数据
		//2. 循环输入
		//   score.length 表示数组的大小(长度)
		Scanner myScanner = new Scanner(System.in);
		int i = 0;
		for (; i < scores.length; i++) {
			System.out.println("请输入第" + (i + 1) + "个元素的值");
			scores[i] = myScanner.nextDouble();
		}
		System.out.println("下面是元素的值的输出");
		//输出,遍历数组
		for (i = 0; i < scores.length; i++) {
			System.out.println("第" + (i + 1) + "个元素的值是" + scores[i]);
		}
	}
}
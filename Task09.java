
public class Task09 {

	//编写一个main方法
	public static void main(String[] args) {

		//求1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+100)的结果
		
		//思路分析
		//1. 一共有100项相加
		//2. 每一项数字增加
		//3. 双层循环
		//i表示第几项,也是该项最后一个数
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			for (int j = i; j > 0; j--) {//int j = 1; j <= i; j++
				sum += j;
			}
		}
		System.out.println("结果是" + sum);
	}
}
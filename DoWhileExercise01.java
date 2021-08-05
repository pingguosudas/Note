
public class DoWhileExercise01 {

	//编写一个main方法
	public static void main(String[] args) {

		//打印1-100
		//计算1-100的和
		int i = 1;
		int j = 0;
		do {
			System.out.println("i = " + i);
			i++;
			j += i;
		} while (i <= 100);
		System.out.println("j = " + j);

		//统计1-200之间能被5整除但不能被3整除的整数个数
		//化繁为简
		//(1) 使用do-while输出1-200
		//(2) 过滤能被5整除但不能被3整除的数
		//先死后活
		//(1) 范围的值 1-200 可以做成变量
		//(2) 能被5整除但不能被3整除,5和3可以做成变量
		int i2 = 1;
		int count = 0;
		do {
			if (i2 % 5 == 0 && i2 % 3 != 0) {
				count++;
			}
			i2++;
		} while (i2 <= 200);

		System.out.println("1-200之间能被5整除但不能被3整除的整数个数是" 
			+ count  + "个");
	}
}
//while循环的案例

public class While01 {

	//编写一个main方法
	public static void main(String[] args) {

		// System.out.println("这是for循环");

		// int i = 1;
		// for (;i <= 10; ) {
		// 	System.out.println("你好,世界" + i);
		// 	i++;
		// }

		//输出10句 hello,world

		System.out.println("下面是while循环");

		int j = 1;//循环变量初始化
		while (j <= 10) {//循环条件
			System.out.println("hello,world");//执行语句
			j++;//循环变量迭代
		}
		System.out.println("while已结束");//11
	}
}
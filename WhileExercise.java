
public class WhileExercise {

	//编写一个main方法
	public static void main(String[] args) {

		//打印1-100之间所有能被3整除的数[使用while]
		//打印4-200之间所有的偶数[使用while]
		int i = 1;
		int endNum = 100;
		int c = 3;
		while (i <= endNum) {
			if (i % c == 0) {
				System.out.println("i = " + i);	
			}

			i++;//变量自增
		}

		System.out.println("=======");

		int j = 40;//变量初始化
		int endNum2 = 200;
		int c2 = 2;
		while (j <= endNum2) {
			if (j % c2 == 0) {
				System.out.println("j = " + j);	
			}

			j++;
		}

		// System.out.println("=======");

		// int k = 40;//变量初始化
		// int endNum3 = 200;
		// int c3 = 2;
		// while (k <= endNum3) {	
		// 	System.out.println("k = " + k);	
		// 	k += c3;
		// }
	}
}
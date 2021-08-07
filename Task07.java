
public class Task07 {

	//编写一个main方法
	public static void main(String[] args) {

		//输出小写的a-z以及大写的Z-A
		//考察我们对a-z编码和for的使用
		//思路分析
		//1. 'b' = 'a' + 1; 'c' = 'a' + 2
		//2. 使用for搞定
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (char i2 = 'Z'; i2 >= 'A'; i2--) {
			System.out.print(i2 + " ");
		}
	}
}
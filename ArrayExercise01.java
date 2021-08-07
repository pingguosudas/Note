
public class ArrayExercise01 {

	//编写一个main方法
	public static void main(String[] args) {


		// char chars[] = new char[26];

		// for(char i = 'A'; i <= 'Z'; i++) {
		// 	System.out.print(i + " ");
		// }
		//这是字符组

		/*
		 创建一个char类型的26个元素的数组,分别放置'A'-'Z'
		 使用for循环访问所有元素并打印出来
		 提示:char类型数据运算 'A' + 1 -> 'B'

		 思路分析
		 1. 定义一个数组 char[] chars = new char[26]
		 2. 因为'A' + 1 == 'B'类推,使用for来赋值
		 3. 使用for循环访问所有元素
		 */
		
		char chars[] = new char[26];
		for(int i = 0; i < 26; i++) {//循环26次
			//chars是char[]
			//char[i]是char
			chars[i] = (char)('A' + i);//'A' + i是int,需要强制转换
		}
		System.out.println("下面是数组chars");
		for(int i = 0; i < 26; i++) {//循环26次
			System.out.print(chars[i] + " ");
		}
	}
}
import java.util.Scanner;
public class SeqSearch {

	//编写一个main方法
	public static void main(String[] args) {
		/*
		 有一个数列:白眉鹰王、金毛狮王、紫衫龙王、青翼蝠王 猜词:
		 从键盘中输入一个名称,判断数列中是否包含此名称[顺序查找]
		 要求:如果找到了,就提示找到,并给出下标值
		 
		 思路分析
		 1. 定义一个字符串数组
		 2. 接收用户输入遍历数组逐一比较如果有则提示信息并退出
		 */
		
		//定义一个字符串数组
		String names[] = {"白眉鹰王", "金毛狮王", "紫衫龙王", "青翼蝠王"};
		Scanner myScanner = new Scanner(System.in);
		int index = -1;
		System.out.println("请输入名字");
		String findName = myScanner.next();
		//接收用户输入遍历数组逐一比较如果有则提示信息并退出
		for(int i = 0; i < names.length; i++) {
			//字符串比较 equals
			if(findName.equals(names[i])) {
				System.out.println("恭喜你答对了");
				System.out.println("下标为 " + i);
				index = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("答错了,不是 " + findName);
		}
	}
}
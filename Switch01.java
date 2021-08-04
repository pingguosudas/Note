import java.util.Scanner;
public class Switch01 {

	//编写一个main方法
	public static void main(String[] args) {

		/*
		 1. 请编写一个程序，该程序可以接受一个字符，比如：a,b,c,d,e,f,g
		 2. a 表示星期一，b 表示星期二
		 3. 根据用户输入显示相应的信息，要求使用 switch 语句

		 思路分析
		 1. 接收字符，创建Scanner 对象
		 2. 使用 switch 来完成匹配，并输出对应信息

		 代码
		*/
		
		Scanner myScanner = new Scanner(System.in);

		System.out.println("请输入一个字符(a-g)");

		char c1 = myScanner.next().charAt(0);
		//在java中，只要是有值返回，就是一个表达式
		switch(c1) {
			case 'a' :
				System.out.println("今天星期一，猴子穿新衣");
				break;
			case 'b' :
				System.out.println("今天星期二，猴子当小二");
				break;
			case 'c' :
				System.out.println("今天星期三，猴子爬雪山");
				break;
			case 'd' :
				System.out.println("今天星期四，猴子赶集市");
				break;
			case 'e' :
				System.out.println("今天星期五，猴子去跳舞");
				break;
			case 'f' :
				System.out.println("今天星期六");
				break;
			case 'g' :
				System.out.println("今天星期天");
				break;
			default :
				System.out.println("你输入的字符不正确，无法匹配");
		}

		System.out.println("退出了switch，继续执行程序");
	}
}
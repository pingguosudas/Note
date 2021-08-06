import java.util.Scanner;
public class BreakExercise02 {

	//编写一个main方法
	public static void main(String[] args) {

		//实现登陆验证,有3次机会,如果用户名为"苹果苏打",密码"777"提示登陆成功
		//,否则提示还有几次机会,使用for + break完成
		
		//思路分析
		//1. 创建Scanner对象接收用户输入
		//2. 定义String name;String password,保存用户名和密码
		//3. 最多循环3次[登录3次],如果满足条件就提前退出
		//4. 定义一个变量int chance记录还有几次登录机会
		Scanner myScanner = new Scanner(System.in);
		String name = "";
		String password = "";
		int chance = 3;//登陆一次,减少一次
		
		for (int i = 1; i <= 3; i++) {//3次登陆机会
			System.out.println("请输入用户名");
			name = myScanner.next();
			System.out.println("请输入密码");
			password = myScanner.next();
			//比较输入的用户名和密码是否正确
			//字符串的比较使用方法 equals
			if ("苹果苏打".equals(name) && "777".equals(password)) {
				System.out.println("登陆成功");
				break;
			}
			chance--;
			System.out.println("登陆失败,还有" + chance + "次机会");	
		}
	}
}
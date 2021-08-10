// import java.util.Scanner;
public class Method01 {

	//编写一个main方法
	public static void main(String[] args) {
		//方法使用
		//1. 方法写好后,如果不去调用(使用),不会输出
		//2. 先创建一个对象,然后调用方法即可
		Person p1 = new Person();
		p1.speak();//调用方法
		p1.cal01();//调用cal01方法
		p1.cal02(7777);//调用cal02方法,同时给n = 7777
		p1.cal02(9999);//调用cal02方法,同时给n = 9999
		
		//调用getSum方法,同时给num1 = 10,num2 = 20
		//getSum,returnRes
		int returnRes = p1.getSum(10, 20);
		System.out.println("gteSum方法返回的值为 " + returnRes);
	}
}

class Person {
	String name;
	int age;
	//方法(成员方法)
	//添加speak成员方法,输出"我是一个好人"
	//解读
	//1. public: 表示方法是公开的
	//2. void: 表示方法没有返回值
	//3. apeak: 是方法名 ()形参列表
	//4. {}: 方法体写我们要执行的代码
	//5. System.out.println("我是一个好人");表示我们的方法是输出一句话
	
	public void speak() {
		System.out.println("我是一个好人");
	}

	//添加cal01成员方法,可以计算1+...+1000的结果
	public void cal01() {
		//循环完成
		int res = 0;
		for(int i = 1; i <= 1000; i++) {
			res += i;
		}
		System.out.println("从一加到1000的结果是 " + res);
	}

	//添加cal02成员方法,该方法可以接收一个数n,计算1+...+n的结果
	//解读
	//1. (int n)形参列表表示当前有一个形参可以接收用户输入
	public void cal02(int n) {
		// Scanner myScanner = new Scanner(System.in);
		int res = 0;
		// n = myScanner.nextInt();
		for(int i = 1; i <= n; i++) {
			res += i;
		}
		System.out.println("从一加到" + n + "的结果是 " + res);
	}

	//添加getSum成员方法,可以计算两数的和
	////解读
	//1. public: 表示方法是公开的
	//2. int: 表示方法执行后,返回一个int
	//3. getSum: 是方法名
	//4. (int num1, int num2)形参列表,2个形参,可以接收用户传入的两个数
	//5. {}: 方法体写我们要执行的代码
	//6. return res;表示把res的值返回
	public int getSum(int num1, int num2) {
		int res = num1 + num2;
		return res;
	}
}
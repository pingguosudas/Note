
public class ThisDetail {

	//编写一个main方法
	public static void main(String[] args) {
		// T t1 = new T();
		// t1.f2();
		T t2 = new T();
		t2.f3();
	}
}

class T {

	/*
	 细节: 访问构造器语法:this(参数列表);
	 注意只能在构造器中使用(即只能在构造器中访问另一个构造器)

	 :注意: 访问构造器语法:this(参数列表);必须放置在第一条语句
	 */
	
	String name = "jack";
	int num = 100;

	public T() {

		//这里去访问T(String name, int age)
		this("jack", 100);
 		System.out.println("T()构造器被调用");
	}

	public T(String name, int age) {
 		System.out.println("T(String name, int age)构造器被调用");
	}

	//this关键字可以用来访问本类的属性
	public void f3() {
		String name = "tom";
		//传统方式
		System.out.println("name = " + name + " num = " + num);//name = tom num = 100
		//也可以使用访问属性
		System.out.println("name = " + this.name + " num = " + this.num);//name = jack num = 100
	}

	//细节:访问成员方法的语法: this.方法名(参数列表)
	public void f1() {
		System.out.println("f1()方法被调用");
	}

	public void f2() {
		System.out.println("f2()方法被调用");
		//调用本类的f1
		//第一种方式
		f1();
		//第2种方式
		this.f1();
	}
}
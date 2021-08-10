
public class MethodParamenter02 {

	//编写一个main方法
	public static void main(String[] args) {

		//测试
		B b = new B();
		// int[] arr = {1, 2, 3};
		// b.test100(arr);
		// System.out.println("\nmain的arr数组");
		// for(int i = 0; i < arr.length; i++) {
		// 	System.out.print(arr[i] + "\t");
		// }

		//测试
		Person p = new Person();
		p.name = "jack";
		p.age = 10;
		
		b.test200(p);
		//如果test200执行的是p = null,下面的结果是10
		//如果test200执行的是p = new Person();....10
		System.out.println("main的p,age = " + p.age);
	}
}

class B {
	//B类中编写一个方法tast100,
	//可以接收一个数组,在方法中修改该数组,看看原来的数组是否变化
	public void test100(int[] arr) {
		System.out.println("修改前的arr数组");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		arr[0] = 100;
		System.out.println("\ntast100的arr数组");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}

	public void test200(Person p) {
		//p.age = 10000;//修改对象属性
		//思考
		//p = null;
		//思考
		p = new Person();
		p.name = "tom";
		p.age = 99;
	}
}

class Person {
	String name;
	int age;
}
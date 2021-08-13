
public class Task11 {

	//编写一个main方法
	public static void main(String[] args) {
		Method method = new Method();
		method.test();
	}
}

//根据System.out.println((method(method(10.0, 20.0), 100)));编一个method
class Method {

	public double method(double num1, double num2) {
		return num1 + num2;
	}

	public void test() {
		System.out.println((method(method(10.0, 20.0), 100)));
	}
}
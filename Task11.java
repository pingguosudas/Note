
public class Task11 {

	//��дһ��main����
	public static void main(String[] args) {
		Method method = new Method();
		method.test();
	}
}

//����System.out.println((method(method(10.0, 20.0), 100)));��һ��method
class Method {

	public double method(double num1, double num2) {
		return num1 + num2;
	}

	public void test() {
		System.out.println((method(method(10.0, 20.0), 100)));
	}
}

public class Recoursion01 {

	//��дһ��main����
	public static void main(String[] args) {
		T t = new T();
		t.test(4);
		int res = t.factorial(5);
		System.out.println("5�Ľ׳� = " + res);
	}
}

class T {
	public void test(int n) {
		if(n > 2) {
			test(n - 1);
		}
		System.out.println("n = " + n);//+else n = 2
	}

	public int factorial(int n) {
		if(n == 1) {
			return 1;
		} else {
			return factorial(n - 1) * n;
		}
	}
}
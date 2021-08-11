
public class Recoursion01 {

	//编写一个main方法
	public static void main(String[] args) {
		T t = new T();
		t.test(4);
		int res = t.factorial(5);
		System.out.println("5的阶乘 = " + res);
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
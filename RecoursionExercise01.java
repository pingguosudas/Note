
public class RecoursionExercise01 {

	//编写一个main方法
	public static void main(String[] args) {
		T t = new T();
		int n = 40;
		int res = t.fibonacci(n);
		if(res != -1) {
			System.out.println("当n = " + n + "对应的斐波那契数为" + res);
		}
	}
}

class T {
	/*
	 斐波那契数列1,1,2,3,5,8,13,求第n个数的值
	 */
	public int fibonacci(int n) {
		if(n >= 1) {
			if(n == 1 || n == 2) {
				return 1;
			} else {
				return fibonacci(n - 1) + fibonacci(n - 2);
			}
		} else {
			System.out.println("要求输入n >= 1的整数");
			return -1;
		}
	}
}
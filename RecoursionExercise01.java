
public class RecoursionExercise01 {

	//��дһ��main����
	public static void main(String[] args) {
		T t = new T();
		int n = 40;
		int res = t.fibonacci(n);
		if(res != -1) {
			System.out.println("��n = " + n + "��Ӧ��쳲�������Ϊ" + res);
		}
	}
}

class T {
	/*
	 쳲���������1,1,2,3,5,8,13,���n������ֵ
	 */
	public int fibonacci(int n) {
		if(n >= 1) {
			if(n == 1 || n == 2) {
				return 1;
			} else {
				return fibonacci(n - 1) + fibonacci(n - 2);
			}
		} else {
			System.out.println("Ҫ������n >= 1������");
			return -1;
		}
	}
}
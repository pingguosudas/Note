
public class BreakExercise {

	//编写一个main方法
	public static void main(String[] args) {

		// int j = 0;
		// int k = 0;
		// for (int i = 1; i >=0; i++) {
		// 	j = ((int)(Math.random() * 100) + 1);
		// 	System.out.println("j = " + j);
		// 	k += j;
		// 	if (k > 20) {
		// 		System.out.println("k = " + k);
		// 		break;
		// 	}
		// }
		
		//1-100以内的数求和, 求出当和第一次大于20的当前数[for + break]
		int sum = 0;
		int n = 0;
		for (int i = 1; i<= 100; i++) {
			sum += i;
			if (sum > 20) {
				System.out.println("当和>20时,当前数i=" + i);
				n = i;
				break;
			}
		}
		System.out.println("当和>20时,当前数n=" + n);
	}
}
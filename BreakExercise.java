
public class BreakExercise {

	//��дһ��main����
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
		
		//1-100���ڵ������, ������͵�һ�δ���20�ĵ�ǰ��[for + break]
		int sum = 0;
		int n = 0;
		for (int i = 1; i<= 100; i++) {
			sum += i;
			if (sum > 20) {
				System.out.println("����>20ʱ,��ǰ��i=" + i);
				n = i;
				break;
			}
		}
		System.out.println("����>20ʱ,��ǰ��n=" + n);
	}
}
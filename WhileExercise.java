
public class WhileExercise {

	//��дһ��main����
	public static void main(String[] args) {

		//��ӡ1-100֮�������ܱ�3��������[ʹ��while]
		//��ӡ4-200֮�����е�ż��[ʹ��while]
		int i = 1;
		int endNum = 100;
		int c = 3;
		while (i <= endNum) {
			if (i % c == 0) {
				System.out.println("i = " + i);	
			}

			i++;//��������
		}

		System.out.println("=======");

		int j = 40;//������ʼ��
		int endNum2 = 200;
		int c2 = 2;
		while (j <= endNum2) {
			if (j % c2 == 0) {
				System.out.println("j = " + j);	
			}

			j++;
		}

		// System.out.println("=======");

		// int k = 40;//������ʼ��
		// int endNum3 = 200;
		// int c3 = 2;
		// while (k <= endNum3) {	
		// 	System.out.println("k = " + k);	
		// 	k += c3;
		// }
	}
}

public class ForExercise02 {

	//��дһ��main����
	public static void main(String[] args) {

		// for (int i = 0; i <= 5; i++) {
		// 	int j = 5 - i;
		// 	int k = i + j;
		// 	System.out.println(i + " + " + j + " = " + k);
		// }

		//���������ʽ�����
		// 0 + 5 = 5
		// 1 + 4 = 5
		// 2 + 3 = 5
		// 3 + 2 = 5
		// 4 + 1 = 5
		// 5 + 0 = 5
		
		//����Ϊ��
		//(1) ����� 0 - 5
		//(2) �ڶ������� 5 - i
		
		//�������
		//(1) 5 �滻�ɱ��� n
		//(2) 
		int n = 10;
		for (int i = 0; i <= n; i++) {
			System.out.println(i + " + " + (n - i) + " = " + n);
		}
	}
}

public class DoWhileExercise01 {

	//��дһ��main����
	public static void main(String[] args) {

		//��ӡ1-100
		//����1-100�ĺ�
		int i = 1;
		int j = 0;
		do {
			System.out.println("i = " + i);
			i++;
			j += i;
		} while (i <= 100);
		System.out.println("j = " + j);

		//ͳ��1-200֮���ܱ�5���������ܱ�3��������������
		//����Ϊ��
		//(1) ʹ��do-while���1-200
		//(2) �����ܱ�5���������ܱ�3��������
		//�������
		//(1) ��Χ��ֵ 1-200 �������ɱ���
		//(2) �ܱ�5���������ܱ�3����,5��3�������ɱ���
		int i2 = 1;
		int count = 0;
		do {
			if (i2 % 5 == 0 && i2 % 3 != 0) {
				count++;
			}
			i2++;
		} while (i2 <= 200);

		System.out.println("1-200֮���ܱ�5���������ܱ�3����������������" 
			+ count  + "��");
	}
}
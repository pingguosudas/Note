
public class MethodExercise01 {

	//��дһ��main����
	public static void main(String[] args) {
		AA a = new AA();
		if(a.isOdd(7)) {//������д���Ժ��ܿ����ܶ�
			System.out.println("������");
		} else {
			System.out.println("��ż��");
		}

		a.printChar(4, 4, '#');
	}
}
//��д��AA,��һ������:����һ����������odd����ż��,����boolean
class AA {
	//˼·
	//1. �����ķ������� boolean
	//2. ���������� isOdd
	//3. �������β� (int num)
	//4. ������,�ж�
	public boolean isOdd(int num) {
		// if(num % 2 != 0) {
		// 	return true;
		// } else {
		// 	return false;
		// }

		//return num % 2 != 0 ? true; false;

		return num % 2 != 0;
	}

	//�����С��С��ַ���ӡ��Ӧ�������������ַ�,
	//������: 4,��: 4,�ַ�: #,���ӡ��Ӧ��Ч��
	//˼·
	//1. �����ķ������� void
	//2. ���������� printChar
	//3. �������β� (int raw, int col, char c)
	//4. ������,ѭ��
	public void printChar(int raw, int col, char c) {
		for(int j = 0; j < raw; j++) {
			for(int i = 0; i < col; i++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}

public class Task07 {

	//��дһ��main����
	public static void main(String[] args) {

		//���Сд��a-z�Լ���д��Z-A
		//�������Ƕ�a-z�����for��ʹ��
		//˼·����
		//1. 'b' = 'a' + 1; 'c' = 'a' + 2
		//2. ʹ��for�㶨
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (char i2 = 'Z'; i2 >= 'A'; i2--) {
			System.out.print(i2 + " ");
		}
	}
}
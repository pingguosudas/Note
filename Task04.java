import java.util.Scanner;
public class Task04 {

	//��дһ��main����
	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);
		System.out.println("������3λ����(�ж��Ƿ�Ϊˮ�ɻ���)");
		int number = myScanner.nextInt();//Ŀǰ����charת��,ʹ��int
		// char num1 = number.charAt(0);
		// char num2 = number.charAt(1);
		// char num3 = number.charAt(2);
		// int number2 = Integer.parseInt(number);
		
		/*
		 �ж�һ�������Ƿ�Ϊˮ�ɻ���
		 ˮ�ɻ�����ָһ����λ��,�����λ�����������͵����䱾��
		 ����: 153 = 1 * 1 * 1 + 5 * 5 * 5 + 3 * 3 * 3

		 ˼·����
		 1. ���� int n = 153
		 2. �ȵõ�n�İ�λ,ʮλ,��λ������,ʹ��if�ж����ǵ��������Ƿ����n
		 3. �İ�λ = n / 100
		 4. ��ʮλ = n % 100 / 10
		 5. �ĸ�λ = n % 10
		 �жϼ���
		 */
		
		int num1 = number / 100;
		int num2 = number % 100 / 10;
		int num3 = number % 10;
		if (number == num1 * num1 * num1 + num2 * num2 *num2 
			+ num3 * num3 * num3) {
			System.out.println(number + "��ˮ�ɻ���");
		} else {
			System.out.println(number + "����ˮ�ɻ���");
		}
	}
}
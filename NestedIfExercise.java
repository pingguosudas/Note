import java.util.Scanner;
public class NestedIfExercise {

	//��дһ��main����
	public static void main(String[] args) {

		/*
		 ��Ʊϵͳ�����ݵ��������·ݺ��ο����䣬��ӡƱ��
		 4~10 ������
		      ���ˣ�18~60����60
		      ��ͯ��<18�������
		      ���ˣ�>60����1/3

		      ������
		      ���ˣ�40
		      ������20
		 */
		
		//˼·����
		//��1�������� ʹ�� if-else
		//��2�������� ʹ�ö��֧�����������
		//��3������ ʹ��˫��֧
		
		Scanner myScanner = new Scanner(System.in);

		System.out.println("�������·�");

		byte month = myScanner.nextByte();

		if (month >= 4 && month <= 10) {
			System.out.println("����������");

			int age = myScanner.nextInt();

			if (age >= 18 && age <= 60) {
				System.out.println("Ʊ��=" + 60);
			} else if (age < 18) {
				System.out.println("Ʊ��=" + (60/2));
			} else {
				System.out.println("Ʊ��=" + (60/3));
			}
		} else {
			System.out.println("����������");

			int age = myScanner.nextInt();

			if (age >= 18 && age <= 60) {
				System.out.println("Ʊ��=" + 40);
			} else {
				System.out.println("Ʊ��=" + 20);
			}
		}
	}
}
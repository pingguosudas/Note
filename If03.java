import java.util.Scanner;
public class If03 {

	//��дһ��main����
	public static void main(String[] args) {

		/*
		 ���뱣��ͬ־��֥�����÷�
		 �����
		 ���÷�Ϊ100��ʱ����� ���ü���
		 ���÷�Ϊ(80,99]ʱ����� ��������
		 ���÷�Ϊ[60,80]ʱ����� ����һ��
		 ������������ ���ò�����
		 ��Ӽ������뱣�������÷֣��������ж�
		 �ٶ����÷�Ϊ int
		 */
		
		Scanner myScanner = new Scanner(System.in);
		//�����û�����
		System.out.println("���������÷�(1-100)��");
		int credit = myScanner.nextInt();

		//�ȶ���������÷֣�����һ����Χ����Ч�ж� 1-100��������ʾ�������
		
		if (credit >= 1 && credit <= 100) {

			//��Ϊ��4�����������ʹ�ö��֧
			if (credit == 100) {
				System.out.println("���ü���");
			} else if (credit > 80 && credit <= 99) {//���÷�Ϊ(80,99]ʱ����� ��������
				System.out.println("��������");
			} else if (credit >= 60 && credit <= 80) {//���÷�Ϊ[60,80]ʱ����� ����һ��
				System.out.println("����һ��");
			} else {
				System.out.println("���ò�����");
			}
		} else {
			System.out.println("���÷���Ҫ��1-100������������:)");
		}
	}
}
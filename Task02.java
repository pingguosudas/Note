import java.util.Scanner;
public class Task02 {

	//��дһ��main����
	public static void main(String[] args) {

		//�ж�һ�����������ĸ���Χ:����0,����0,С��0
		Scanner myScanner = new Scanner(System.in);
		System.out.println("������һ������");
		int num = myScanner.nextInt();
		if (num > 0) {
			System.out.println("��������0");
		} else if (num == 0) {
			System.out.println("��������0");
		} else {
			System.out.println("����С��0");
		}
	}
}
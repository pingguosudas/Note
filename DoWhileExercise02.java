import java.util.Scanner;
public class DoWhileExercise02 {

	//��дһ��main����
	public static void main(String[] args) {

		//�����������Ǯ,����������һֱ����ʹ������������,ֱ������˵��ǮΪֹ
		//System.out.println("����������:��Ǯ��? y/n"); do-while
		Scanner myScanner = new Scanner(System.in);
		char answer = ' ';
		do {
			System.out.println("ʹ������������Ź��");
			System.out.println("\n����������:��Ǯ��? y/n");
			answer = myScanner.next().charAt(0);
		} while (answer != 'y');//�ж������ܹؼ�
		System.out.println("֪����Ǯ�ͺ�");
	}
}
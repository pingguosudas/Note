import java.util.Scanner;
public class Array02 {

	//��дһ��main����
	public static void main(String[] args) {

		//��ʾ��������������[]=new ��������[��С]
		//ѭ������5���ɼ�,���浽double����,�����
		
		//����
		//1.����һ��double����,��СΪ5
		
		//(1) ��1�ֶ�̬���䷽ʽ
		//double scores[] = new double[5];
		//(2) ��2�ֶ�̬���䷽ʽ,����������,��new(����ռ�)
		double scores[];//��������,��ʱscores��null
		scores = new double[5];//�����ڴ�ռ�,���Դ������
		//2. ѭ������
		//   score.length ��ʾ����Ĵ�С(����)
		Scanner myScanner = new Scanner(System.in);
		int i = 0;
		for (; i < scores.length; i++) {
			System.out.println("�������" + (i + 1) + "��Ԫ�ص�ֵ");
			scores[i] = myScanner.nextDouble();
		}
		System.out.println("������Ԫ�ص�ֵ�����");
		//���,��������
		for (i = 0; i < scores.length; i++) {
			System.out.println("��" + (i + 1) + "��Ԫ�ص�ֵ��" + scores[i]);
		}
	}
}
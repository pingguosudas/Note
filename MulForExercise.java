import java.util.Scanner;
public class MulForExercise {

	//��дһ��main����
	public static void main(String[] args) {
		
		//ͳ��3����ɼ����,ÿ������5��ͬѧ,����������ƽ���ֺ����а༶��ƽ����
		//ѧ���ĳɼ��Ӽ�������
		//ͳ�������༰������,ÿ������5��ͬѧ

		//˼·����:
		//����Ϊ��
		//(1) �ȼ���һ����,5��ѧ���ĳɼ�,ʹ��for
		//1.1 ����һ��Scanner����,�����û�������
		//1.2 �õ��ð༶ƽ����,����һ��double sum �Ѹð༶5��ѧ���ɼ��ۼ�
		
		//(2) ͳ��3����(ÿ����5��ѧ��)ƽ����
		//(3) ���а༶��ƽ����
		//3.1 ����һ������double totalScore �ۼ�����ѧ���ɼ�
		//3.2 ������ѭ��������,totalScore / (3 * 5)
		//(4) ͳ�������༰������
		//4.1 ����һ������ int passNum = 0 ����һ��ѧ���ɼ�>=60 passNum++
		//4.2 ��� >= 60 passNum++
		//(5) �����Ż�[Ч��,�ɶ���,�ṹ]
		
		//���� Scanner ����
		Scanner myScanner = new Scanner(System.in);
		double totalScore = 0;//�ۼ�����ѧ���ɼ�
		int passNum = 0;//�ۼƼ�������
		for (int i = 1; i <= 3; i++) {//i ��ʾ�༶

			double sum = 0;//һ���༶���ܷ�
			for (int j = 1; j <= 5; j++) {//j ��ʾѧ��
				System.out.println("�������" + i +"�����" 
					+ j + "��ѧ���ĳɼ�");
				double score = myScanner.nextDouble();
				//����һ��ѧ���ɼ�>=60 passNum++
				if (score >= 60) {
					passNum++;
				}
				sum += score;//�ۼ�
				System.out.println("�ɼ�Ϊ" + score);
			}
			//��Ϊsum��5��ѧ�����ܳɼ�
			System.out.println("sum = " + sum + " ƽ���� = " + (sum / 5));
			//��sum�ۼƵ�totalScore
			totalScore += sum;
		}
		System.out.println("�������ܷ�=" + totalScore 
			+ " ƽ����=" + (totalScore / 15));
		System.out.println("��������=" + passNum);
	}
}
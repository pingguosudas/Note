
public class ForExercise {

	//��дһ��main����
	public static void main(String[] args) {

		//��ӡ1~100֮��������9����������,ͳ�Ƹ������ܺ�
		//�Ϻ����������˼�� (����)
		//1. ����Ϊ��:�������ӵ�����,���ɼ򵥵�����,�����
		//2. �������:�ȿ��ǹ̶���ֵ,Ȼ��ת�ɿ������仯��ֵ
		
		// int i = 9,j = 0;
		// for (; i <= 100; i += 9) {
		// 	System.out.println("i=" + i);
		// 	j += i;
		// }
		// System.out.println("������" + (i / 9 - 1) + "��");
		// System.out.println("�ܺ���" + j);
		
		//˼·����
		//��ӡ1~100֮��������9����������,ͳ�Ƹ������ܺ�
		//(1) ��� ��� 1-100��ֵ
		//(2) �����������,���й���,ֻ���9�ı��� i % 9 == 0
		//(3) ͳ�Ƹ��� ����һ������ int count = 0,����������ʱ count++
		//(4) �ܺ�,����һ������ int sum = 0,����������ʱ �ۼ� sum += i
		//�������
		//(1) Ϊ����Ӧ���õ�����,�ѷ�Χ��ʼ��ֵ�ͽ�����ֵ,���ɱ���
		//(2) �����Ը���һ�� 9 ����Ҳ���ɱ��� int t = 9
		
		int count = 0; //ͳ��9�ı����ĸ��� ����
		int sum = 0;//�ܺ�
		int start = 10;
		int end = 200;
		int t = 5;//����
		for (int i = start; i <= end; i++) {
			if (i % t == 0) {
				System.out.println("i=" + i);
				count++;
				sum += i;//�ۼ�
			}
		}
		System.out.println("count=" + count);
		System.out.println("sum=" + sum);
	}
}

public class Task09 {

	//��дһ��main����
	public static void main(String[] args) {

		//��1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+100)�Ľ��
		
		//˼·����
		//1. һ����100�����
		//2. ÿһ����������
		//3. ˫��ѭ��
		//i��ʾ�ڼ���,Ҳ�Ǹ������һ����
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			for (int j = i; j > 0; j--) {//int j = 1; j <= i; j++
				sum += j;
			}
		}
		System.out.println("�����" + sum);
	}
}
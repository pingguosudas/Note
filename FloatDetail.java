
public class FloatDetail {

	//��дһ��main����
	public static void main(String[] args) {

		//Java �ĸ����ͳ���������ֵ��Ĭ��Ϊdouble�ͣ�����float�ͳ��������ӡ�f����F��
		//float num1 = 1.1; //��
		float num2 = 1.1F; //��
		double num3 = 1.1; //��
		double num4 = 1.1f; //��

		//ʮ��������ʽ���磺5.12     512.0f     .512     ������Ҫ��С���㣩
		double num5 = .123; //�ȼ� 0.123
		System.out.println(num5);
		//��ѧ��������ʽ���磺5.12e2[5.12*10��2�η�]     5.12E-2[5.12/10��2�η�]
		System.out.println(5.12e2);//512.0
		System.out.println(5.12E-2);//0.0512

		//ͨ������£�Ӧ��ʹ��double�ͣ���Ϊ����float�͸���ȷ
		double num6 = 2.1234567851;
		float num7 = 2.1234567851f;
		System.out.println(num6);
		System.out.println(num7);

		//������ʹ�����壺2.7 �� 8.31 / 3 �Ƚ�
		//����һ�δ���
		double num8 = 2.7;
		double num9 = 2.7; //8.1 / 3;//2.7
		System.out.println(num8);//2.7
		System.out.println(num9);//�ӽ�2.7��һ��С����������2.7
		//�õ�һ����Ҫ��ʹ�õ㣺�����Ƕ���������С���Ľ�������ж�ʱ��ҪС��
		//Ӧ�������������Ĳ�ֵ�ľ���ֵ����ĳ�����ȷ�Χ���ж�
		if( num8 == num9 ) {
			System.out.println("num8 == num9 ���");
		}
		//��ȷ��д��, ctrl + / ע�Ϳ�ݼ����ٴ������ȡ��ע��
		if(Math.abs(num8 - num9) < 0.000001 ) {
			System.out.println("��ֵ�ǳ�С���ﵽ�涨�ľ��ȣ���Ϊ���");
		}
		// ����ͨ��java API ���� ���ʹ��API?
		System.out.println(Math.abs(num8 - num9));

		//ϸ�ڣ������ֱ�Ӳ�ѯ�õ���С������ֱ�Ӹ�ֵ�������ж����
		
	}
}
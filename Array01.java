
//�������
public class Array01 {

	//��дһ��main����
	public static void main(String[] args) {

		/*
		 һ����������6ֻ��,���ǵ����طֱ�
		 ��3kg,5kg,1kg,3.4kg,2kg,50kg.
		 ��������ֻ�����������Ƕ���?ƽ�������Ƕ���?

		 ˼·����
		 1. ������������double,��͵õ�������
		 2. ƽ������=������/6
		 3. ��ͳ��ʵ�ַ�ʽ������.6->600->566
		 4. �����µļ���->����
		 */
		
		// double hen1 = 3;
		// double hen2 = 5;
		// double hen3 = 1;
		// double hen4 = 3.4;
		// double hen5 = 2;
		// double hen6 = 50;
		// double totalWeight = hen1 + hen2 +hen3 + hen4 + hen5 + hen6;
		// double avgWeight = totalWeight / 6;
		// System.out.println("������" + totalWeight +" ƽ������" + avgWeight);
		
		//�������������һ������=>����
		//����һ������
		//1. double[]��ʾ��double���͵�����,������hens
		//2. {3, 5, 1, 3.4, 2, 50} ��ʾ�����ֵ(Ԫ��)
		//   ���α�ʾ����ĵڼ���Ԫ��
		
		double[] hens = {3, 5, 1, 3.4, 2, 50, 7.8, 88.8};

		//��������õ����������Ԫ�صĺ�,ʹ��for
		//1. ���ǿ���ͨ��hens[�±�]�����������Ԫ��
		//   �±��Ǵ�0��ʼ��ŵ�,�����һ��Ԫ����hens[0]
		//   �ڶ���Ԫ����hens[1]
		//2. ͨ��forѭ�����������Ԫ��(ֵ)
		//3. ʹ��һ������totalWeight������Ԫ���ۼ�
		
		//����ͨ��������.length�õ�����Ĵ�С(����)
		//System.out.println("����ĳ���=" + hens.length);
		double totalWeight = 0;
		int i = 0;
		for (; i < hens.length; i++) {
			//System.out.println("��" + (i + 1) + "��Ԫ�ص�ֵ=" + hens[i]);
			totalWeight += hens[i];
		}
		System.out.println("������" + totalWeight 
			+" ƽ������" + (totalWeight / hens.length));
	}
}
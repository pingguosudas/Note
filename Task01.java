
public class Task01 {

	//��дһ��main����
	public static void main(String[] args) {

		/*
		 ĳ����100000Ԫ,ÿ����һ��·��,��Ҫ����,��������:
		 (1) ���ֽ� > 50000 ʱ,ÿ�ν� 5%
		 (2) ���ֽ� <= 50000 ʱ,ÿ�ν� 1000
		 ������������Ծ������ٴ�·��,Ҫ��ʹ�� while break

		 ˼·����
		 1. ����double money����100000
		 2. �������Ҫ��,���������������
		    money > 50000
		    money >= 1000 && money <= 50000
		    money <1000
		 3. ʹ�ö��֧if-else-if
		 4. while-break[money < 1000],ͬʱʹ��һ������count������ͨ����·����

		*/
	
		double money = 100000;//ʣ��Ǯ����
		int count = 0;//�ۼ�ͨ��·����
		while (true) {//����ѭ��
			if (money > 50000) {
				money *= 0.95;//�������·��,����
				count++;
			} else if (money >= 1000) {
				money -= 1000;
				count++;
			} else {//������֧��
				break;
			}
		}
		
		System.out.println("100000Ԫ��ͨ����·���� = " + count);
	}
}
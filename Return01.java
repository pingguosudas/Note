
public class Return01 {

	//��дһ��main����
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			if (i == 3) {
				System.out.println("hello,world" + i);
				return;//continue;break;
				//��return���ڷ���ʱ,��ʾ��������,���ʹ����main,��ʾ�˳�����
			}
			System.out.println("hello,shijie");
		}
		System.out.println("continue...");
	}
}
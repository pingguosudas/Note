//if-else �Ŀ�������
import java.util.Scanner;//����
public class If02 {

	//��дһ��main����
	public static void main(String[] args) {

		//��дһ�����򣬿��������˵����䣬�����ͬ־���������18��
		//����� �����������18��Ҫ���Լ�����Ϊ�������������
		//��������������䲻����ηŹ����ˡ�
		

		//˼·����
		//1. ������������䣬Ӧ�ö���һ�� Scanner ����
		//2. �����䱣�浽һ������ int age
		//3. ʹ�� if-else �жϣ������Ӧ��Ϣ
		
		//����һ�� Scanner ����
		Scanner myScanner = new Scanner(System.in);
		System.out.println("����������");
		//�����䱣�浽һ������ int age
		int age = myScanner.nextInt();
		//ʹ�� if-else �жϣ������Ӧ��Ϣ
		if (age > 18) {
			System.out.println("���������18��Ҫ���Լ�����Ϊ�����������");
		} else {//˫��֧
			System.out.println("�����䲻����ηŹ�����");
		}

		System.out.println("�������...");
	}
}
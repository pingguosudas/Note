import java.util.Scanner;//��ʾ�� java.util �µ� Scanner �ർ��
public class Input {

	//��дһ��main����
	public static void main(String[] args) {

		//��ʾ�����û�������
		//����
		//Scannar�� ��ʾ ���ı�ɨ�������� java.util ��
		//1. ����/���� Scannar �����ڵİ�
		//2. ���� Scannar ����new ����һ���������
		// myScannar ���� Scannar��Ķ���
		
		Scanner myScanner = new Scanner(System.in);
		//3. �����û������� ʹ����صķ���
		System.out.println("����������");

		//������ִ�е� next ����ʱ����ȴ��û�����~~~
		String name = myScanner.next();//�����û������ַ���
		System.out.println("����������");
		int age = myScanner.nextInt();//�����û�����int
		System.out.println("������нˮ");
		double sal = myScanner.nextDouble();//�����û�����double
		System.out.println("�˵���Ϣ����");
		System.out.println("����=" + name + " ����=" 
			+ age + " нˮ=" + sal);	
	}
}
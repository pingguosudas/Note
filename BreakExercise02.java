import java.util.Scanner;
public class BreakExercise02 {

	//��дһ��main����
	public static void main(String[] args) {

		//ʵ�ֵ�½��֤,��3�λ���,����û���Ϊ"ƻ���մ�",����"777"��ʾ��½�ɹ�
		//,������ʾ���м��λ���,ʹ��for + break���
		
		//˼·����
		//1. ����Scanner��������û�����
		//2. ����String name;String password,�����û���������
		//3. ���ѭ��3��[��¼3��],���������������ǰ�˳�
		//4. ����һ������int chance��¼���м��ε�¼����
		Scanner myScanner = new Scanner(System.in);
		String name = "";
		String password = "";
		int chance = 3;//��½һ��,����һ��
		
		for (int i = 1; i <= 3; i++) {//3�ε�½����
			System.out.println("�������û���");
			name = myScanner.next();
			System.out.println("����������");
			password = myScanner.next();
			//�Ƚ�������û����������Ƿ���ȷ
			//�ַ����ıȽ�ʹ�÷��� equals
			if ("ƻ���մ�".equals(name) && "777".equals(password)) {
				System.out.println("��½�ɹ�");
				break;
			}
			chance--;
			System.out.println("��½ʧ��,����" + chance + "�λ���");	
		}
	}
}
import java.util.Scanner;
public class SeqSearch {

	//��дһ��main����
	public static void main(String[] args) {
		/*
		 ��һ������:��üӥ������ëʨ���������������������� �´�:
		 �Ӽ���������һ������,�ж��������Ƿ����������[˳�����]
		 Ҫ��:����ҵ���,����ʾ�ҵ�,�������±�ֵ
		 
		 ˼·����
		 1. ����һ���ַ�������
		 2. �����û��������������һ�Ƚ����������ʾ��Ϣ���˳�
		 */
		
		//����һ���ַ�������
		String names[] = {"��üӥ��", "��ëʨ��", "��������", "��������"};
		Scanner myScanner = new Scanner(System.in);
		int index = -1;
		System.out.println("����������");
		String findName = myScanner.next();
		//�����û��������������һ�Ƚ����������ʾ��Ϣ���˳�
		for(int i = 0; i < names.length; i++) {
			//�ַ����Ƚ� equals
			if(findName.equals(names[i])) {
				System.out.println("��ϲ������");
				System.out.println("�±�Ϊ " + i);
				index = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("�����,���� " + findName);
		}
	}
}
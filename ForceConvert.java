
public class ForceConvert {

	//��дһ��main����
	public static void main(String[] args) {

		//��ʾǿ������ת��
		int n1 = (int)1.9;
		System.out.println("n1=" + n1);//i=1 ��ɾ�����ʧ

		int n2 = 2000;
		byte b1 = (byte)n2;
		System.out.println("b1=" + b1);//b1=-48 ����������

		int j = 100;
		byte b2 = (byte)j;
		System.out.println("b2=" + b2);
	}
}
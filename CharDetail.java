
public class CharDetail {

	//��дһ��main����
	public static void main(String[] args) {

		//��java�У�char�ı�����һ�������������ʱ����Unicode���Ӧ���ַ�
		char c1 = 97;
		System.out.println(c1);//a

		char c2 = 'a';
		System.out.println((int)c2);//���'a' ��Ӧ�� ����
		char c3 = 'ʯ';
		System.out.println((int)c3);//30707
		char c4 = 30707;
		System.out.println(c4);//ʯ

		//char�����ǿ��Խ�������ģ��൱��һ����������Ϊ�����ж�Ӧ��Unicode��

		System.out.println('a' + 10);//107

		//����
		char c5 = 'b' + 1;//98 + 1 ==> 99
		System.out.println((int)c5);//99
		System.out.println(c5);//99->��Ӧ���ַ�->�����ASC�򣨹涨�õģ�=>c
	}
}
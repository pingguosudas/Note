
public class SwitchDetail {

	//��дһ��main����
	public static void main(String[] args) {

		//���ʽ��������,Ӧ�� case ��ĳ�������һ��
		//�����ǿ����Զ�ת���ɿ����໥ת��������,������������ַ�,�������� int
		
		//ϸ��2
		//switch(���ʽ)�б��ʽ�ķ���ֵ������:
		//(byte,short,int,char,enum[ö��],string)

		//ϸ��3
		//case �Ӿ��е�ֵ�����ǳ��� (1,'a'),�����ǳ������ʽ,�������Ǳ���
		
		//ϸ��4
		//default�Ӿ��ǿ�ѡ��,��û��ƥ���caseʱ,ִ��default
		//���û��default �Ӿ�,û��ƥ���κγ���,��û�����
		
		//ϸ��5
		//break���������ִ�����һ�� case ��֧��ʹ�������� switch ����
		//���û��дbreak�����˳��ִ�е�switch��β,����ִ�е�break
		char c = 'b';
		switch(c) {
			case 'a' ://97
				System.out.println("ok1");
				break;
			case 'b' :
				System.out.println("ok2");
				break;
			default :
				System.out.println("ok3");
		}

		System.out.println("�˳���switch,����ִ��..");
	}
}
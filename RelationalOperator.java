//��ʾ��ϵ�������ʹ��
//

public class RelationalOperator {

	//��дһ��main����
	public static void main(String[] args) {

		int a = 9;//ʵ�ʿ����У�����ʹ�� a,b,i,c1,c2...����
		int b = 8;
		System.out.println(a > b);//true
		System.out.println(a >= b);//true
		System.out.println(a <= b);//false
		System.out.println(a < b);//false
		System.out.println(a == b);//false
		System.out.println(a != b);//true
		boolean flag = a > b;//true
		System.out.println("flag=" + flag);
	}
}
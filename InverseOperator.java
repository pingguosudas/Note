// ! �� ^ ������ʾ

public class InverseOperator {

	//��дһ��main����
	public static void main(String[] args) {

		//! ȡ�� true -> false, false -> true
		System.out.println(60 > 20);//true
		System.out.println(!(60 > 20));//false

		//a ^ b �߼���� ��a ��b ��ͬʱ������Ϊtrue������Ϊfalse
		boolean b = (10 > 1) ^ (3 < 5);
		System.out.println("b=" + b);//false
	}
}
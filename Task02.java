
public class Task02 {

	//��дһ��main����
	public static void main(String[] args) {

		String[] strs = {"tom", "jack", "mary", "smith"};
		A02 a02 = new A02();
		int index = a02.find("mary", strs);
		System.out.println("���ҵ� index = " + index);
	}
}

class A02 {

	//��д��A02���巽��findʵ�ֲ���ĳ�ַ����Ƿ����ַ���������
	//��������������Ҳ�������-1
	public int find(String findStr, String... strs) {

		//ֱ�ӱ����ַ�������,����ҵ�,�򷵻�����
		for(int i = 0; i < strs.length; i++) {
			if(findStr.equals(strs[i])) {
				return i;
			}
		}
		//���û��,�ͷ��� -1
		return -1;
	}
}
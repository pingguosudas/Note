
public class ContinueDetail {

	//��дһ��main����
	public static void main(String[] args) {

		label1:
		for (int j = 0; j < 4; j++) {
			label2:
			for (int i = 0; i < 10; i++) {
				if (i ==2) {
					continue;
					//continue label1;//4��[0,1]
					//break lable2 == continue lable1
				}
				System.out.println("i = " + i);//4�� [0,1,3,4,5,6,7,8,9]
			}
		}
	}
}
import java.util.Scanner;
public class ArrayReduce {

	//��дһ��main����
	public static void main(String[] args) {

		//��һ������ {1, 2, 3, 4, 5},���Խ��������������
		//,��ʾ�û��Ƿ��������,ÿ����������Ǹ�Ԫ��
		//.��ֻʣ�����һ��Ԫ��,��ʾ,����������
		int arr[] = {1, 2, 3, 4, 5};
		Scanner myScanner = new Scanner(System.in);
		while (true) {
			int arrNew[] = new int[arr.length - 1];
			for(int i = 0; i < arr.length - 1; i++) {
				arrNew[i] = arr[i];
			}
			arr = arrNew;
			System.out.println("����������arr�������Ԫ��");
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + "\t");
			}
			if(arr.length == 1) {
				System.out.println("\n����������");
				break;
			} else {
				System.out.println("\n�����Ƿ��������?");
				char key = myScanner.next().charAt(0);
				if(key == 'n') {
					break;
				}
			}
		}
	}
}
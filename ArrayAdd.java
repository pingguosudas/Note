import java.util.Scanner;
public class ArrayAdd {

	//��дһ��main����
	public static void main(String[] args) {

		/*
		 Ҫ��:ʵ�ֶ�̬�ĸ��������Ԫ��Ч��,ʵ�ֶ���������
		 1. ԭʼ����ʹ�þ�̬����int arr[] = {1, 2, 3}
		 2. ���ӵ�Ԫ��4,ֱ�ӷ�����������arr = {1, 2, 3, 4}
		 3. �û�����ͨ�����·����������Ƿ�������:��ӳɹ�,�Ƿ����? y/n

		 ˼·����
		 1. �����ʼ����int arr[] = {1, 2, 3}//�±�0-2
		 2. ����һ��������int arrNew[] = new int[arr.length + 1];
		 3. ����arr����,���ν�arr��Ԫ�ظ��Ƶ�arrNew����
		 4. ��4����arrNew[arrNew.length - 1];��4����arrNew���һ��Ԫ��
		 5. ��arrָ��arrNew:arr = arrNew;ԭarr���鱻����
		 */
		int arr[] = {1, 2, 3};
		int arrNew[] = new int[arr.length + 1];
		//����arr����,���ν�arr��Ԫ�ظ��Ƶ�arrNew����
		for(int i = 0; i < arr.length; i++) {
			arrNew[i] = arr[i];
		}
		//��4����arrNew���һ��Ԫ��
		arrNew[arrNew.length - 1] = 4;
		//��arrָ��arrNew
		arr = arrNew;
		System.out.println("����������arr���ݺ��Ԫ��");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
}

public class TwoDimensionalArray03 {

	//��дһ��main����
	public static void main(String[] args) {

		/*
		 һ������:��̬���������ά���鲢���
		 
		 i = 0: 1
		 i = 1: 2   2
		 i = 3: 3   3   3

		 һ��������һά����,ÿ��һά�����Ԫ������һ��
		 */
		//������ά����,һ����3��һά����,��ÿ��һά���黹û�п����ݿռ�
		int arr[][] = new int[10][];
		for(int i = 0; i < arr.length; i++) {//����arrÿ��һά����
			//��ÿ��һά���鿪�ռ�new
			//���û�и�һά����new,��ôarr[i]��null
			arr[i] = new int[i + 1];
			//����һά����,����һά�����ÿ��Ԫ�ظ�ֵ
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (i + 1);
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}
}
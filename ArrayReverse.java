
public class ArrayReverse {

	//��дһ��main����
	public static void main(String[] args) {

		// arr {11, 22, 33, 44, 55, 66} -> {66, 55, 44, 33, 22, 11}
		
		//��������
		int arr[] = {11, 22, 33, 44, 55, 66};

		//ʹ������ֵ��ʽ
		//˼·����
		//1. ����һ��������arr2,��СΪarr.length
		//2. ˳�����arr,��ÿ��Ԫ�ؿ�����arr2��Ԫ����(���򿽱�)
		//   ���������arr,��ÿ��Ԫ�ؿ�����arr2��Ԫ����(˳�򿽱�)
		int arr2[] = new int[arr.length];
		// int c = 0;
		int len = arr.length;
		// for(int i = 0; i < len; i++) {
		// 	c = arr[i];
		// 	arr2[len - 1 -i] = c;
		// 	arr = arr2;
		// }
		for(int i = len - 1, j = 0; i >= 0; i--, j++) {
			arr2[j] = arr[i];
		}
		//4. ��forѭ������,arr2����һ����������� {11, 22, 33, 44, 55, 66}
		//5. ��arrָ��arr2���ݿռ�,��ʱarrԭ�������ݿռ�û�б�������
		//   ������
		arr = arr2;
		System.out.println("�����������Ԫ��");
		for(int i = 0; i < len; i++) {
			System.out.print(arr[i] + " ");
		}
		
		//��������
		// int arr[] = {11, 22, 33, 44, 55, 66};
		//˼·����
		//����
		//1. ��arr[0]��arr[5]���н���{66, 22, 33, 44, 55, 11}
		//2. ��arr[1]��arr[4]���н���{66, 55, 33, 44, 22, 11}
		//3. ��arr[2]��arr[3]���н���{66, 55, 44, 33, 22, 11}
		//4. һ��Ҫ����3�� = arr.length / 2
		//5. ÿ�ν���ʱ,��Ӧ���±���arr[i]��arr[arr.length - 1 - i]
		//����
		// int temp;
		// int len = arr.length;//�������鳤��
		// for(int i = 0; i < len / 2; i++) {
		// 	temp = arr[len - 1 - i];
		// 	arr[len - 1 - i] = arr[i];
		// 	arr[i] = temp;
		// }
		// System.out.println("�����������Ԫ��");
		// for(int i = 0; i < len; i++) {
		// 	System.out.print(arr[i] + "\t");
		// }
	}	
}
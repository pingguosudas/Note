
public class ArrayExercise02 {

	//��дһ��main����
	public static void main(String[] args) {
		int num[] = {4, -1, 9, 10, 23};
		int numMax = 0;
		int maxNum = 0;
		int maxNum2 = 0;
		for(int i = 0; i < num.length; i++) {
			if(num[i] > numMax) {
				numMax = num[i];
				maxNum = i;
			} //else if(num[i] == numMax) {
			// 	maxNum2 = i;
			// 	System.out.println("ͬ�����ֵ��Ӧ�±���" + maxNum2);
			// }
		}
		System.out.println("���ֵ��" + numMax);
		System.out.println("���Ӧ�±���" + maxNum);
		
		//���������int[] = {4, -1, 9, 10, 23}�����ֵ,���ó���Ӧ�±�
		//˼·����
		//1. ����һ��int����int arr[] = {4, -1, 9, 10, 23}
		//2. �ٶ�max = arr[0]�����ֵ,maxIndex = 0
		//3. ���±�1��ʼ����arr,���max < ��ǰԪ��,˵��max����������
		//   ���ֵ,����max = ��ǰԪ��,maxIndex = ��ǰԪ���±�
		//4. �����Ǳ����������arr��,max�������������ֵ,
		//   maxIndex�����ֵ��Ӧ���±�
		// int arr[] = {4, -1, 9, 10, 23};
		// int max = arr[0];//�ٶ���һ��Ԫ�������ֵ
		// int maxIndex = 0;
		// for(int i = 1; i < arr.length; i++) {//���±�1��ʼ����arr
		// 	if(max < arr[i]) {//���max<��ǰԪ��
		// 		max = arr[i];//��max���óɵ�ǰԪ��
		// 		maxIndex = i;
		// 	}
		// }
		// //�����Ǳ�������arr��,max�������������ֵ,maxIndex�����ֵ�±�
		// System.out.println("���ֵ��" + max + " ���Ӧ�±���" + maxIndex);
	}
}
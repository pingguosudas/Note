
public class Task05 {

	//��дһ��main����
	public static void main(String[] args) {

		//�������10������(1-100��Χ��)���浽����,�������ӡ,
		//�Լ���ƽ��ֵ,�����ֵ�����ֵ���±�,�����������Ƿ���8
		int arr[] = new int[10];
		int i = 0;
		int maxNum = 0;
		int index = -1;
		int index2 = -1;
		for(; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		for(i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		double sum = arr[0];
		for(i = 1; i < arr.length; i++) {
			sum += arr[i];
			if(maxNum < arr[i]) {
				maxNum = arr[i];
				index = i;
			}
			if(8 == arr[i]) {
				index2 = i;
			}
		}
		System.out.println("\nƽ��ֵΪ" + (sum / arr.length));
		System.out.println("���ֵΪ" + maxNum);
		System.out.println("���ֵ�±�Ϊ" + index);
		if(index2 != -1) {
			System.out.println("8�ڸ�������");
		} else {
			System.out.println("8���ڸ�������");
		}
	}
}

public class BubbleSortStar {

	//��дһ��main����
	public static void main(String[] args) {

		int arr[] = {100, 24, 57, 69, 80};
		int temp = 0;
		int len = arr.length;
		int k = 0;
		label1:
		for(int j = 0; j < len - 1; j++) {
			for(int i = 0; i < len - 1 - j; i++) {
				if(arr[i] > arr[i + 1]) {
					temp = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = temp;
				} else {
					k++;
				}
			}
			if(k == len - 1 - j) {
				break label1;
			}
			System.out.println("\n�����ǵ�"+ (j + 1) +"������������");
			for(int i = 0; i < len; i++) {
				System.out.print(arr[i] + "\t");
			}
		}
		System.out.println("\n����������������");
			for(int i = 0; i < len; i++) {
				System.out.print(arr[i] + "\t");
			}
	}
}
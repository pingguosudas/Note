
public class Task07 {

	//��дһ��main����
	public static void main(String[] args) {
		int arr[] = {40, 95, 78, 45, 61, 79, 2, 9, 37, 73};
		int temp = 0;
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - 1 - i; j++) {
				if(arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("����������");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

public class BubbleSortStar {

	//编写一个main方法
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
			System.out.println("\n下面是第"+ (j + 1) +"次排序后的数组");
			for(int i = 0; i < len; i++) {
				System.out.print(arr[i] + "\t");
			}
		}
		System.out.println("\n下面是排序后的数组");
			for(int i = 0; i < len; i++) {
				System.out.print(arr[i] + "\t");
			}
	}
}
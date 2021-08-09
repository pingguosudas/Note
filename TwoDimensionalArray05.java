
public class TwoDimensionalArray05 {

	//编写一个main方法
	public static void main(String[] args) {
		int sum = 0;
		int arr[][] = {{4, 6}, {1, 4, 5, 7}, {-2}};
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		System.out.println("和是" + sum);
	}
}
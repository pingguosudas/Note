import java.util.Scanner;
public class ArrayReduce {

	//编写一个main方法
	public static void main(String[] args) {

		//有一个数组 {1, 2, 3, 4, 5},可以将该数组进行缩减
		//,提示用户是否继续缩减,每次缩减最后那个元素
		//.当只剩下最后一个元素,提示,不能再缩减
		int arr[] = {1, 2, 3, 4, 5};
		Scanner myScanner = new Scanner(System.in);
		while (true) {
			int arrNew[] = new int[arr.length - 1];
			for(int i = 0; i < arr.length - 1; i++) {
				arrNew[i] = arr[i];
			}
			arr = arrNew;
			System.out.println("下面是数组arr缩减后的元素");
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + "\t");
			}
			if(arr.length == 1) {
				System.out.println("\n不能再缩减");
				break;
			} else {
				System.out.println("\n请问是否继续缩减?");
				char key = myScanner.next().charAt(0);
				if(key == 'n') {
					break;
				}
			}
		}
	}
}
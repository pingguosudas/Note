
public class ArrayExercise02 {

	//编写一个main方法
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
			// 	System.out.println("同等最大值对应下标是" + maxNum2);
			// }
		}
		System.out.println("最大值是" + numMax);
		System.out.println("其对应下标是" + maxNum);
		
		//请求出数组int[] = {4, -1, 9, 10, 23}的最大值,并得出对应下标
		//思路分析
		//1. 定义一个int数组int arr[] = {4, -1, 9, 10, 23}
		//2. 假定max = arr[0]是最大值,maxIndex = 0
		//3. 从下标1开始遍历arr,如果max < 当前元素,说明max不是真正的
		//   最大值,就让max = 当前元素,maxIndex = 当前元素下标
		//4. 当我们遍历这个数组arr后,max就是真正的最大值,
		//   maxIndex是最大值对应的下标
		// int arr[] = {4, -1, 9, 10, 23};
		// int max = arr[0];//假定第一个元素是最大值
		// int maxIndex = 0;
		// for(int i = 1; i < arr.length; i++) {//从下标1开始遍历arr
		// 	if(max < arr[i]) {//如果max<当前元素
		// 		max = arr[i];//把max设置成当前元素
		// 		maxIndex = i;
		// 	}
		// }
		// //当我们遍历数组arr后,max就是真正的最大值,maxIndex是最大值下标
		// System.out.println("最大值是" + max + " 其对应下标是" + maxIndex);
	}
}

public class ArrayReverse {

	//编写一个main方法
	public static void main(String[] args) {

		// arr {11, 22, 33, 44, 55, 66} -> {66, 55, 44, 33, 22, 11}
		
		//定义数组
		int arr[] = {11, 22, 33, 44, 55, 66};

		//使用逆序赋值方式
		//思路分析
		//1. 创建一个新数组arr2,大小为arr.length
		//2. 顺序遍历arr,将每个元素拷贝到arr2的元素中(逆序拷贝)
		//   或逆序遍历arr,将每个元素拷贝到arr2的元素中(顺序拷贝)
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
		//4. 当for循环结束,arr2就是一个逆序的数组 {11, 22, 33, 44, 55, 66}
		//5. 让arr指向arr2数据空间,此时arr原来的数据空间没有变量引用
		//   会销毁
		arr = arr2;
		System.out.println("下面是数组的元素");
		for(int i = 0; i < len; i++) {
			System.out.print(arr[i] + " ");
		}
		
		//定义数组
		// int arr[] = {11, 22, 33, 44, 55, 66};
		//思路分析
		//规律
		//1. 把arr[0]和arr[5]进行交换{66, 22, 33, 44, 55, 11}
		//2. 把arr[1]和arr[4]进行交换{66, 55, 33, 44, 22, 11}
		//3. 把arr[2]和arr[3]进行交换{66, 55, 44, 33, 22, 11}
		//4. 一共要交换3次 = arr.length / 2
		//5. 每次交换时,对应的下标是arr[i]和arr[arr.length - 1 - i]
		//代码
		// int temp;
		// int len = arr.length;//计算数组长度
		// for(int i = 0; i < len / 2; i++) {
		// 	temp = arr[len - 1 - i];
		// 	arr[len - 1 - i] = arr[i];
		// 	arr[i] = temp;
		// }
		// System.out.println("下面是数组的元素");
		// for(int i = 0; i < len; i++) {
		// 	System.out.print(arr[i] + "\t");
		// }
	}	
}
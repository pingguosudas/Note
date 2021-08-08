import java.util.Scanner;
public class ArrayAdd {

	//编写一个main方法
	public static void main(String[] args) {

		/*
		 要求:实现动态的给数组添加元素效果,实现对数组扩容
		 1. 原始数组使用静态分配int arr[] = {1, 2, 3}
		 2. 增加的元素4,直接放在数组的最后arr = {1, 2, 3, 4}
		 3. 用户可以通过如下方法来决定是否继续添加:添加成功,是否继续? y/n

		 思路分析
		 1. 定义初始数组int arr[] = {1, 2, 3}//下标0-2
		 2. 定义一个新数组int arrNew[] = new int[arr.length + 1];
		 3. 遍历arr数组,依次将arr的元素复制到arrNew数组
		 4. 将4赋给arrNew[arrNew.length - 1];把4赋给arrNew最后一个元素
		 5. 让arr指向arrNew:arr = arrNew;原arr数组被销毁
		 */
		int arr[] = {1, 2, 3};
		int arrNew[] = new int[arr.length + 1];
		//遍历arr数组,依次将arr的元素复制到arrNew数组
		for(int i = 0; i < arr.length; i++) {
			arrNew[i] = arr[i];
		}
		//把4赋给arrNew最后一个元素
		arrNew[arrNew.length - 1] = 4;
		//让arr指向arrNew
		arr = arrNew;
		System.out.println("下面是数组arr扩容后的元素");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
}
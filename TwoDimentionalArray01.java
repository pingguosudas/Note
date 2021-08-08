
public class TwoDimentionalArray01 {

	//编写一个main方法
	public static void main(String[] args) {

		/*
		 用二维数组输出如下图形
		    0 0 0 0 0 0
		    0 0 1 0 0 0
		    0 2 0 3 0 0
		    0 0 0 0 0 0
		 */
		
		//二维数组:
		//1. 从定义形式上看int[][]
		//2. 可以说,二维数组的每个元素是一维数组
		int arr[][] = {{0, 0, 0, 0, 0, 0},{0, 0, 1, 0, 0, 0},
						{0, 2, 0, 3, 0, 0},{0, 0, 0, 0, 0, 0}};
		//关于二维数组的关键概念
		//(1)
		System.out.println("二维数组的元素个数为 " + arr.length);
		//(2) 二维数组的每个元素是一维数组所以如果需要得到每个一维数组
		//    的值,还需再次遍历
		//(3) 如果我们要访问第(i+1)个一维数组第(j+1)个值 arr[i][j]
		//    举例:要访问3->第3个一维数组第4个值 arr[2][3]
		System.out.println("第3个一维数组第4个值是 " + arr[2][3]);
		//输出二维数组的图形
		for(int i = 0; i < arr.length; i++) {//遍历二维数组的每个元素
			//遍历二维数组的每个元素(数组)
			//1. arr[i]二维数组的第i+1个元素 arr[0]:二维数组的第一个元素
			//2. arr[i].length得到对应的一维数组的长度
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");//输出了一维数组
			}
			System.out.println();//换行
		}
	}
}

public class TwoDimensionalArray03 {

	//编写一个main方法
	public static void main(String[] args) {

		/*
		 一个需求:动态创建下面二维数组并输出
		 
		 i = 0: 1
		 i = 1: 2   2
		 i = 3: 3   3   3

		 一共有三个一维数组,每个一维数组的元素数不一样
		 */
		//创建二维数组,一共有3个一维数组,但每个一维数组还没有开数据空间
		int arr[][] = new int[10][];
		for(int i = 0; i < arr.length; i++) {//遍历arr每个一维数组
			//给每个一维数组开空间new
			//如果没有给一维数组new,那么arr[i]是null
			arr[i] = new int[i + 1];
			//遍历一维数组,并给一维数组的每个元素赋值
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (i + 1);
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}
}

public class ArrayDetail {

	//编写一个main方法
	public static void main(String[] args) {

		//1. 数组是多个相同类型数据的组合,实现对这些数据的统一管理
		//int arr1[] = {1, 2, 3, 60, (int)1.1, "hello"};//String->int
		double arr2[] = {1.1, 2.2, 3.3, 60.6};//int->double
		//2. 数组中的元素可以是任何数据类型,包括基本类型和引用类型,但不能混用
		String arr3[] = {"北京","jack","milan"};
		//3. 数组创建后,如果没有赋值,有默认值
		//int 0,short 0,byte 0,long 0
		//float 0.0,double 0.0,char \u0000
		//boolean false,String null
		short arr4[] = new short[3];
		System.out.println("下面是数组arr4");
		for(int i = 0; i < arr4.length; i++) {
			System.out.println(arr4[i]);
		}
		//6. 数组的下标必须在指定范围内使用,否则提示:下标越界,
		//比如,int arr[] = new int[5];则有效下表为0-4
		//即数组的下标/索引最小是0最大数数组长度-1(4)
		int arr[] = new int[5];
		System.out.println(arr[5]);//数组越界
	}
}
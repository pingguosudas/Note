
public class Task04 {

	//编写一个main方法
	public static void main(String[] args) {
		//已知有一个升序数组,要求插入一个元素,该数组顺序依然是升序
		//{10, 12, 45, 90},添加23->{10, 12, 23, 45, 90}
		int arr[] = {10, 12, 45, 90};
		int arrNew[] = new int[arr.length + 1];
		int insertNum = 23;
		//int index = -1;
		int index = 0;
		int i = 0;
		for(; i < arr.length; i++) {
			if(arr[i] < insertNum) {
				arrNew[i] = arr[i];
				index++;
			} else {
				//index = i;
				break;
			}
		}
		arrNew[index] = insertNum;
		for(i = index; i < arr.length; i++) {
			arrNew[i + 1] = arr[i];
		}
		arr = arrNew;
		System.out.println("添加23后的数组为");
		for(i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
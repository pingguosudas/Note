
public class Task05 {

	//编写一个main方法
	public static void main(String[] args) {

		//随机生成10个整数(1-100范围内)保存到数组,并倒序打印,
		//以及求平均值,求最大值和最大值的下标,并查找里面是否有8
		int arr[] = new int[10];
		int i = 0;
		int maxNum = 0;
		int index = -1;
		int index2 = -1;
		for(; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		for(i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		double sum = arr[0];
		for(i = 1; i < arr.length; i++) {
			sum += arr[i];
			if(maxNum < arr[i]) {
				maxNum = arr[i];
				index = i;
			}
			if(8 == arr[i]) {
				index2 = i;
			}
		}
		System.out.println("\n平均值为" + (sum / arr.length));
		System.out.println("最大值为" + maxNum);
		System.out.println("最大值下标为" + index);
		if(index2 != -1) {
			System.out.println("8在该数组内");
		} else {
			System.out.println("8不在该数组内");
		}
	}
}
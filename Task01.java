
public class Task01 {

	//编写一个main方法
	public static void main(String[] args) {

		A01 a01 = new A01();
		double[] arr = {1, 1.4, -1.3, 89.8, 123.8, 66};//null;//{};
		Double res = a01.max(arr);
		if(res != null) {
			System.out.println("arr的最大值是 = " + res);
		} else {
			System.out.println("arr的输入有误,数组不能为null,或者{}");
		}
	}
}

/*
 编写类A01,定义方法max,实现求某个double数组的最大值,并返回
 先正常完成业务,再考虑代码的健壮性
 */
class A01 {

	public Double max(double... arr) {

		//先判断arr是否为null,然后再判断length是否 > 0
		if(arr != null && arr.length > 0) {

			double max = arr[0];//假定
			for(int i = 1; i < arr.length; i++) {
				if(max < arr[i]) {
					max = arr[i];//double
				}
			}
			return max;
		} else {
			return null;
		}
	}
}
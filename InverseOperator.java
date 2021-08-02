// ! 和 ^ 案例演示

public class InverseOperator {

	//编写一个main方法
	public static void main(String[] args) {

		//! 取反 true -> false, false -> true
		System.out.println(60 > 20);//true
		System.out.println(!(60 > 20));//false

		//a ^ b 逻辑异或 当a 和b 不同时，则结果为true，否则为false
		boolean b = (10 > 1) ^ (3 < 5);
		System.out.println("b=" + b);//false
	}
}
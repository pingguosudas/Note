//演示关系运算符的使用
//

public class RelationalOperator {

	//编写一个main方法
	public static void main(String[] args) {

		int a = 9;//实际开发中，不可使用 a,b,i,c1,c2...命名
		int b = 8;
		System.out.println(a > b);//true
		System.out.println(a >= b);//true
		System.out.println(a <= b);//false
		System.out.println(a < b);//false
		System.out.println(a == b);//false
		System.out.println(a != b);//true
		boolean flag = a > b;//true
		System.out.println("flag=" + flag);
	}
}
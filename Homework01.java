
public class Homework01 {

	//编写一个main方法
	public static void main(String[] args) {

		//演示强制类型转换
		short s = 12;//ok
		//s = s - 9;//× int -> short

		byte b = 10;//ok
		//b = b + 11;//× int -> byte
		b = (byte)(b + 11);//ok 使用强转

		char c = 'a';//ok
		int i = 16;//ok
		float d = .134f;//ok
		double result = c + i + d;//ok

		byte e = 16;//ok
		short f = 14;//ok
		//short t = e + f;//× int -> short
	}
}
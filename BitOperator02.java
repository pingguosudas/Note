
public class BitOperator02 {

	//编写一个main方法
	public static void main(String[] args) {

		System.out.println(1 >> 2);//1 / 2 / 2 = 0
		System.out.println(1 << 2);//1 * 2 * 2 = 4
		System.out.println(4 << 3);//4 * 2 * 2 * 2 = 32
		System.out.println(15 >> 2);//15 / 2 / 2 = 3

		System.out.println(-10.5 % 3);//(-10.5) - (int)(-10.5) / 3 * 3 = -1.5
		System.out.println(-10.4 % 3);//-1.4 近似值
	}
}
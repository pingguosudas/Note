
public class MethodExercise01 {

	//编写一个main方法
	public static void main(String[] args) {
		AA a = new AA();
		if(a.isOdd(7)) {//这样的写法以后还能看到很多
			System.out.println("是奇数");
		} else {
			System.out.println("是偶数");
		}

		a.printChar(4, 4, '#');
	}
}
//编写类AA,有一个方法:碰到一个数是奇数odd还是偶数,返回boolean
class AA {
	//思路
	//1. 方法的返回类型 boolean
	//2. 方法的名字 isOdd
	//3. 方法的形参 (int num)
	//4. 方法体,判断
	public boolean isOdd(int num) {
		// if(num % 2 != 0) {
		// 	return true;
		// } else {
		// 	return false;
		// }

		//return num % 2 != 0 ? true; false;

		return num % 2 != 0;
	}

	//根据行、列、字符打印对应行数和列数的字符,
	//比如行: 4,列: 4,字符: #,则打印相应的效果
	//思路
	//1. 方法的返回类型 void
	//2. 方法的名字 printChar
	//3. 方法的形参 (int raw, int col, char c)
	//4. 方法体,循环
	public void printChar(int raw, int col, char c) {
		for(int j = 0; j < raw; j++) {
			for(int i = 0; i < col; i++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
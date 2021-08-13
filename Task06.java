
public class Task06 {

	//编写一个main方法
	public static void main(String[] args) {
		Cale cale = new Cale(9, 3);
		System.out.println("相加的结果是" + cale.plus());
		System.out.println("相减的结果是" + cale.minus());
		System.out.println("相乘的结果是" + cale.mul());
		Double divRes = cale.div();
		if(divRes != null) {
			System.out.println("相除的结果是" + divRes);
		}
	}
}

/*
 编程创建一个Cale计算类,在其中定义2个变量表示两个操作数
 定义四个方法实现求和、差、乘、商(要求除为0的话,要提示)并创建两个对象,分别测试
 */

class Cale {

	double ope1;
	double ope2;

	public Cale(double ope1, double ope2) {
		this.ope1 = ope1;
		this.ope2 = ope2;
	}

	public double plus() {
		return ope1 + ope2;
	}

	public double minus() {
		return ope1 - ope2;
	}

	public double mul() {
		return ope1 * ope2;
	}

	public Double div() {
		//判断
		if(ope2 != 0) {
			return ope1 / ope2;
		} else {
			System.out.println("输入有误,除数为0");
			return null;
		}
	}
}
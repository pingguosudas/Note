
public class MethodParamenter01 {

	//编写一个main方法
	public static void main(String[] args) {
		int a= 10;
		int b= 20;
		//创建AA对象名字是obj
		AA obj = new AA();
		obj.swap(a, b);//调用swap方法

		System.out.println("main方法\na=" + a + "\tb=" + b);//a=10 b =20
	}
}

class AA {
	public void swap(int a, int b) {
		System.out.println("a和b交换前的值\na=" + a + "\tb=" + b);//a=10 b =20
		//完成了a和b的交换
		int tmp = a;
		a = b;
		b = tmp;
		System.out.println("a和b交换后的值\na=" + a + "\tb=" + b);//b =20 a=10
	}
}
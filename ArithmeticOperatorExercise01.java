
public class ArithmeticOperatorExercise01 {

	//��дһ��main����
	public static void main(String[] args) {

		int i = 1;//i -> 1
		i = i++;//����ʹ����ʱ������(1) temp = i;(2) i = i + 1;(3) i = temp;
		System.out.println(i);//1

		int j = 1;
		j = ++j;//����ʹ����ʱ������(1) j = j + 1;(2) temp = j;(3) j = temp;
		System.out.println(j);//2

		int c1 = 10;
		int c2 = 20;
		int c = c1++;
		System.out.print("c="+c);//10
		System.out.println("c2="+c2);//20
		c = --c2;
		System.out.print("c="+c);//19
		System.out.println("c2="+c2);//19
	}
}
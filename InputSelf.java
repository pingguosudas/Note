import java.util.Scanner;
public class InputSelf {

	//��дһ��main����
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("����������");
		String name = input.next();
		System.out.println("����������");
		int age = input.nextInt();
		System.out.println("������нˮ");
		double sal = input.nextDouble();
		System.out.println("�˵���Ϣ����");
		System.out.println("name=" + name + " age=" 
			+ age + " sal=" + sal);
	}
}
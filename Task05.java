
public class Task05 {

	//��дһ��main����
	public static void main(String[] args) {
		Circle circle = new Circle(3);
		System.out.println("�ܳ� = " + circle.per());
		System.out.println("��� = " + circle.area());
	}
}

/*
 ����һ��Բ��Circle,��������: �뾶,�ṩ��ʾԲ�ܳ����ܵķ���,�ṩ��ʾԲ����ķ���
 */
class Circle {

	double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double per() {//�ܳ�
		return 2 * Math.PI * radius;
	}

	public double area() {//���
		return Math.PI * radius * radius;
	}
}
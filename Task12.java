
public class Task12 {

	//��дһ��main����
	public static void main(String[] args) {
		Employee employee1 = new Employee("tom", '��', 12, "ѧ��", 0.05);
		System.out.println(employee1.name);
	}
}
/*
 ����һ��Employee��
 ������(����, �Ա�, ����, ְλ, нˮ)�ṩ3�����췽��,���Գ�ʼ��
 (1) (����, �Ա�, ����, ְλ, нˮ),(2) (����, �Ա�, ����)
 (3) (ְλ, нˮ),Ҫ���ָ��ù�����
 */
class Employee {

	String name;
	char gender;
	int age;
	String position;
	double sal;

	public Employee(String position, double sal) {
		this.position = position;
		this.sal = sal;
	}

	public Employee(String name, char gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public Employee(String name, char gender, int age, String position, double sal) {
		this(name, gender, age);
		this.position = position;
		this.sal = sal;
	}
}
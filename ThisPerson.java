
public class ThisPerson {

	//��дһ��main����
	public static void main(String[] args) {

		Person p1 = new Person("mary", 20);
		Person p2 = new Person("mary", 20);

		System.out.println("p1��p2�ȽϵĽ�� = " +  p1.compareTo(p2));
	}
}

class Person {

	String name;
	int age;
	//������
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//compareTo�ȽϷ���
	public boolean compareTo(Person p) {
		//���ֺ�������ȫһ��
		// if(this.name.equals(p.name) && this.age == p.age) {
		// 	return true;
		// } else {
		// 	return false;
		// }
		return this.name.equals(p.name) && this.age == p.age;
	}
}

class TestPerson {

	public boolean compareTo(Person p1, Person p2) {
		if(p1.name == p2.name && p1.age == p2.age) {
			return true;
		} else {
			return false;
		}
	}
}
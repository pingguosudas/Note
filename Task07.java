
public class Task07 {

	//��дһ��main����
	public static void main(String[] args) {
		Dog dog = new Dog("��׳", 12, "��ɫ");
		System.out.println(dog.show());
	}
}

//���һ��Dog��,�����֡���ɫ����������,�����������show()��ʾ����Ϣ.����������,���в���
class Dog {

	String name;
	int age;
	String color;

	public Dog(String name, int age, String color) {
		this.name = name;
		this.age = age;
		this.color = color;
	}

	public String show() {
		return "name = " + name + " age = " + age + " color = " + color;
	}
}
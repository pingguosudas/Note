
public class MethodExercise02 {

	//��дһ��main����
	public static void main(String[] args) {
		//��дһ��copyPerson,���Ը���һ��Person����,���ظ��ƵĶ���.��¡����,
		//ע��Ҫ��õ����¶����ԭ���Ķ��������������Ķ���,����ֻ��������ͬ
		Person p = new Person();
		p.name = "jack";
		p.age = 10;
		//����tools
		MyTools tool = new MyTools();
		Person p2 = tool.copyPerson(p);
		//����p1��p2����Person����,���������������Ķ���,������ͬ
		System.out.println("p������age = " + p.age + " name = " + p.name);
		System.out.println("p2������age = " + p2.age + " name = " + p2.name);
		//����ͨ����������hashCode���������Ƿ���ͬһ��
		System.out.println(p == p2);//false
	}
}

class MyTools {
	//˼·
	//1. �����ķ������� Person
	//2. ���������� copyPerson
	//3. �������β� (Person p)
	//4. ������,����һ���¶���,����������,���ؼ���
	public Person copyPerson(Person p) {
		Person p2 = new Person();
		p2.name = p.name;//��ԭ����������ָ���p2.name
		p2.age = p.age;//��ԭ����������丳��p2.age
		return p2;
	}
}

class Person {
	String name;
	int age;
}
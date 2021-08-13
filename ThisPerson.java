
public class ThisPerson {

	//编写一个main方法
	public static void main(String[] args) {

		Person p1 = new Person("mary", 20);
		Person p2 = new Person("mary", 20);

		System.out.println("p1和p2比较的结果 = " +  p1.compareTo(p2));
	}
}

class Person {

	String name;
	int age;
	//构造器
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//compareTo比较方法
	public boolean compareTo(Person p) {
		//名字和年龄完全一样
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
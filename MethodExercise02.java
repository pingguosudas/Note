
public class MethodExercise02 {

	//编写一个main方法
	public static void main(String[] args) {
		//编写一个copyPerson,可以复制一个Person对象,返回复制的对象.克隆对象,
		//注意要求得到的新对象和原来的对象是两个独立的对象,他们只是属性相同
		Person p = new Person();
		p.name = "jack";
		p.age = 10;
		//创建tools
		MyTools tool = new MyTools();
		Person p2 = tool.copyPerson(p);
		//到此p1和p2都是Person对象,但是是两个独立的对象,属性相同
		System.out.println("p的属性age = " + p.age + " name = " + p.name);
		System.out.println("p2的属性age = " + p2.age + " name = " + p2.name);
		//可以通过输出对象的hashCode看看对象是否是同一个
		System.out.println(p == p2);//false
	}
}

class MyTools {
	//思路
	//1. 方法的返回类型 Person
	//2. 方法的名字 copyPerson
	//3. 方法的形参 (Person p)
	//4. 方法体,创建一个新对象,并复制属性,返回即可
	public Person copyPerson(Person p) {
		Person p2 = new Person();
		p2.name = p.name;//把原来对象的名字赋给p2.name
		p2.age = p.age;//把原来对象的年龄赋给p2.age
		return p2;
	}
}

class Person {
	String name;
	int age;
}
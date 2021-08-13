
public class Task07 {

	//编写一个main方法
	public static void main(String[] args) {
		Dog dog = new Dog("大壮", 12, "黄色");
		System.out.println(dog.show());
	}
}

//设计一个Dog类,有名字、颜色和年龄属性,定义输出方法show()显示其信息.并创建对象,进行测试
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
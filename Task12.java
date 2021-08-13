
public class Task12 {

	//编写一个main方法
	public static void main(String[] args) {
		Employee employee1 = new Employee("tom", '男', 12, "学生", 0.05);
		System.out.println(employee1.name);
	}
}
/*
 创建一个Employee类
 属性有(名字, 性别, 年龄, 职位, 薪水)提供3个构造方法,可以初始化
 (1) (名字, 性别, 年龄, 职位, 薪水),(2) (名字, 性别, 年龄)
 (3) (职位, 薪水),要求充分复用构造器
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
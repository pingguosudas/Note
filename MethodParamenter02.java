
public class MethodParamenter02 {

	//��дһ��main����
	public static void main(String[] args) {

		//����
		B b = new B();
		// int[] arr = {1, 2, 3};
		// b.test100(arr);
		// System.out.println("\nmain��arr����");
		// for(int i = 0; i < arr.length; i++) {
		// 	System.out.print(arr[i] + "\t");
		// }

		//����
		Person p = new Person();
		p.name = "jack";
		p.age = 10;
		
		b.test200(p);
		//���test200ִ�е���p = null,����Ľ����10
		//���test200ִ�е���p = new Person();....10
		System.out.println("main��p,age = " + p.age);
	}
}

class B {
	//B���б�дһ������tast100,
	//���Խ���һ������,�ڷ������޸ĸ�����,����ԭ���������Ƿ�仯
	public void test100(int[] arr) {
		System.out.println("�޸�ǰ��arr����");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		arr[0] = 100;
		System.out.println("\ntast100��arr����");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}

	public void test200(Person p) {
		//p.age = 10000;//�޸Ķ�������
		//˼��
		//p = null;
		//˼��
		p = new Person();
		p.name = "tom";
		p.age = 99;
	}
}

class Person {
	String name;
	int age;
}

public class PropertiseDetail {

	//��дһ��main����
	public static void main(String[] args) {

		//����Person����
		//p1 �Ƕ�����(��������)
		//new Person() �����Ķ���ռ�(����)����������
		Person p1 = new Person();

		//�����Ĭ������,��ѭ�������:
		//int 0��short 0, byte 0, long 0, float 0.0,double 0.0��char \u0000��boolean false
		System.out.println("��ǰ�˵���Ϣ \n" + "name = "+ p1.name + " age = " + p1.age +
										 " sal = " + p1.sal + " isPass = " + p1.isPass);
	}
}

class Person {
	//�ĸ�����
	String name;
	int age;
	double sal;
	boolean isPass;
}
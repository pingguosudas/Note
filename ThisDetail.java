
public class ThisDetail {

	//��дһ��main����
	public static void main(String[] args) {
		// T t1 = new T();
		// t1.f2();
		T t2 = new T();
		t2.f3();
	}
}

class T {

	/*
	 ϸ��: ���ʹ������﷨:this(�����б�);
	 ע��ֻ���ڹ�������ʹ��(��ֻ���ڹ������з�����һ��������)

	 :ע��: ���ʹ������﷨:this(�����б�);��������ڵ�һ�����
	 */
	
	String name = "jack";
	int num = 100;

	public T() {

		//����ȥ����T(String name, int age)
		this("jack", 100);
 		System.out.println("T()������������");
	}

	public T(String name, int age) {
 		System.out.println("T(String name, int age)������������");
	}

	//this�ؼ��ֿ����������ʱ��������
	public void f3() {
		String name = "tom";
		//��ͳ��ʽ
		System.out.println("name = " + name + " num = " + num);//name = tom num = 100
		//Ҳ����ʹ�÷�������
		System.out.println("name = " + this.name + " num = " + this.num);//name = jack num = 100
	}

	//ϸ��:���ʳ�Ա�������﷨: this.������(�����б�)
	public void f1() {
		System.out.println("f1()����������");
	}

	public void f2() {
		System.out.println("f2()����������");
		//���ñ����f1
		//��һ�ַ�ʽ
		f1();
		//��2�ַ�ʽ
		this.f1();
	}
}
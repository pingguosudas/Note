// import java.util.Scanner;
public class Method01 {

	//��дһ��main����
	public static void main(String[] args) {
		//����ʹ��
		//1. ����д�ú�,�����ȥ����(ʹ��),�������
		//2. �ȴ���һ������,Ȼ����÷�������
		Person p1 = new Person();
		p1.speak();//���÷���
		p1.cal01();//����cal01����
		p1.cal02(7777);//����cal02����,ͬʱ��n = 7777
		p1.cal02(9999);//����cal02����,ͬʱ��n = 9999
		
		//����getSum����,ͬʱ��num1 = 10,num2 = 20
		//getSum,returnRes
		int returnRes = p1.getSum(10, 20);
		System.out.println("gteSum�������ص�ֵΪ " + returnRes);
	}
}

class Person {
	String name;
	int age;
	//����(��Ա����)
	//���speak��Ա����,���"����һ������"
	//���
	//1. public: ��ʾ�����ǹ�����
	//2. void: ��ʾ����û�з���ֵ
	//3. apeak: �Ƿ����� ()�β��б�
	//4. {}: ������д����Ҫִ�еĴ���
	//5. System.out.println("����һ������");��ʾ���ǵķ��������һ�仰
	
	public void speak() {
		System.out.println("����һ������");
	}

	//���cal01��Ա����,���Լ���1+...+1000�Ľ��
	public void cal01() {
		//ѭ�����
		int res = 0;
		for(int i = 1; i <= 1000; i++) {
			res += i;
		}
		System.out.println("��һ�ӵ�1000�Ľ���� " + res);
	}

	//���cal02��Ա����,�÷������Խ���һ����n,����1+...+n�Ľ��
	//���
	//1. (int n)�β��б��ʾ��ǰ��һ���βο��Խ����û�����
	public void cal02(int n) {
		// Scanner myScanner = new Scanner(System.in);
		int res = 0;
		// n = myScanner.nextInt();
		for(int i = 1; i <= n; i++) {
			res += i;
		}
		System.out.println("��һ�ӵ�" + n + "�Ľ���� " + res);
	}

	//���getSum��Ա����,���Լ��������ĺ�
	////���
	//1. public: ��ʾ�����ǹ�����
	//2. int: ��ʾ����ִ�к�,����һ��int
	//3. getSum: �Ƿ�����
	//4. (int num1, int num2)�β��б�,2���β�,���Խ����û������������
	//5. {}: ������д����Ҫִ�еĴ���
	//6. return res;��ʾ��res��ֵ����
	public int getSum(int num1, int num2) {
		int res = num1 + num2;
		return res;
	}
}
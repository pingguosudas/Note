
public class Task03 {

	//��дһ��main����
	public static void main(String[] args) {
		Book book = new Book("���ߵĿ���", 30);
		book.info();
		book.updatePrice();//���¼۸�
		book.info();
	}
}

class Book {

	String name;
	double price;

	public Book(String name,double price) {
		this.name = name;
		this.price = price;
	}

	public void updatePrice() {
		//���������,û��price�ֲ�����,this.price�ȼ�price
		if(this.price > 150) {
			this.price = 150;
		} else if(this.price > 100) {
			this.price = 100;
		}
	}
	//��ʾ�鼮��Ϣ
	public void info() {
		System.out.println("���� = " + this.name + " �۸� = " + this.price);
	}
}
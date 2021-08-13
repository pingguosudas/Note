
public class Task03 {

	//编写一个main方法
	public static void main(String[] args) {
		Book book = new Book("海边的卡夫卡", 30);
		book.info();
		book.updatePrice();//更新价格
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
		//如果方法中,没有price局部变量,this.price等价price
		if(this.price > 150) {
			this.price = 150;
		} else if(this.price > 100) {
			this.price = 100;
		}
	}
	//显示书籍信息
	public void info() {
		System.out.println("书名 = " + this.name + " 价格 = " + this.price);
	}
}
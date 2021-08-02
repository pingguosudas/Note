
public class Homework04 {

	//编写一个main方法
	public static void main(String[] args) {

		//编程，保存两个书名，用+拼接，看效果
		//保村两个性别，用+拼接，看效果
		//保村两个价格，用+拼接，看效果
		String book1 = "爱丽丝漫游奇境";
		String book2 = "我心中尚未崩坏的地方";
		System.out.println(book1 + " " + book2);//爱丽丝漫游奇境 我心中尚未崩坏的地方

		//性别应该用char保存
		char c1 = '男';
		char c2 = '女';
		System.out.println(c1 + c2);// 男 字符码值 + 女 字符码值

		//保存两本书价格
		double price1 = 9.15;
		double price2 = 7.77;
		System.out.println(price1 + price2);// 就是9.15 + 7.77
	}
}
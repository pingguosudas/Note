
//演示Char的基本使用
public class Char01 {

	//编写一个main方法
	public static void main(String[] args) {
		char c1 = 'a';
		char c2 = '\t';
		char c3 = '石';
		char c4 = 97;//说明：字符类型可以直接存放一个数字
		//修改快捷键 首选项 按键绑定-默认 用ctrl+f快速查找 复制到 按键绑定-用户 更改
		//复制整行输入下一行快捷键：ctal+shift+d 删除当前行快捷键：ctrl+shift+k
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);//当输出c4时，会输出97表示的字符 = > 编码的概念
	}
}
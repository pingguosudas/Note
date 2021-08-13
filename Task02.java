
public class Task02 {

	//编写一个main方法
	public static void main(String[] args) {

		String[] strs = {"tom", "jack", "mary", "smith"};
		A02 a02 = new A02();
		int index = a02.find("mary", strs);
		System.out.println("查找的 index = " + index);
	}
}

class A02 {

	//编写类A02定义方法find实现查找某字符串是否在字符串数组中
	//并返回索引如果找不到返回-1
	public int find(String findStr, String... strs) {

		//直接遍历字符串数组,如果找到,则返回索引
		for(int i = 0; i < strs.length; i++) {
			if(findStr.equals(strs[i])) {
				return i;
			}
		}
		//如果没有,就返回 -1
		return -1;
	}
}
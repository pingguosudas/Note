
public class Test {

	//编写一个main方法
	public static void main(String[] args) {
		// int j = 0;
		// for (int i = 1; i >=0; i++) {
		// 	j = ((int)(Math.random() * 100) + 1);
		// 	System.out.println("j = " + j);
		// 	if (j == 97) {
		// 		System.out.println("i = " + i);
		// 		break;
		// 	}
		// }
		
		String name = "铲子p";
		System.out.println(name.equals("铲子p"));
		System.out.println("铲子p".equals(name));//[推荐,可避免空指针]
	}
}
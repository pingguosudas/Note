import java.util.Scanner;
public class DoWhileExercise02 {

	//编写一个main方法
	public static void main(String[] args) {

		//如果张三不还钱,则物述有栖一直对其使用闪电五连鞭,直到张三说还钱为止
		//System.out.println("物述有栖问:还钱吗? y/n"); do-while
		Scanner myScanner = new Scanner(System.in);
		char answer = ' ';
		do {
			System.out.println("使用闪电五连鞭殴打");
			System.out.println("\n物述有栖问:还钱吗? y/n");
			answer = myScanner.next().charAt(0);
		} while (answer != 'y');//判断条件很关键
		System.out.println("知道还钱就好");
	}
}
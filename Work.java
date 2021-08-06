import java.util.Scanner;
public class Stars03 {

	//编写一个main方法
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入层数");
		int totalLever = myScanner.nextInt();
		for (int i = 1; i <= totalLever; i++) {
			if (i <= totalLever / 2) {
				for (int k = 1; k <= totalLever - i; k++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= 2 * i - 1; j++) {
					if (j == 1 || j == 2 * i - 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println("");
			} else {
				for (int k = 1; k <= i - 1; k++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= (totalLever * 2 + 1) - 2 * i; j++) {
					if (j == 1 || j == (totalLever * 2 + 1) - 2 * i) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println("");
			}
		}
	}
}
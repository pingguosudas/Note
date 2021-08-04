import java.util.Scanner;
public class SwitchExercise {

	//编写一个main方法
	public static void main(String[] args) {

		//使用 switch 把小写类型的
		//char型转为大写(键盘输入). 只转换 a,b,c,d,e.其他输出 "other"

		//创建Scanner对象
		
		Scanner myScanner = new Scanner(System.in);

		// System.out.println("请输入小写字母(a-e)");

		// char c1 = myScanner.next().charAt(0);

		// switch(c1) {
		// 	case 'a' :
		// 		System.out.println("A");
		// 		break;
		// 	case 'b' :
		// 		System.out.println("B");
		// 		break;
		// 	case 'c' :
		// 		System.out.println("C");
		// 		break;
		// 	case 'd' :
		// 		System.out.println("D");
		// 		break;
		// 	case 'e' :
		// 		System.out.println("E");
		// 		break;
		// 	default :
		// 		System.out.println("你的输入有误~");
		// }

		//对学生成绩大于60分的,输出"合格". 低于60分的,输出"不合格".
		//(注:输入的成绩不能大于100), 提示 成绩/60
		
		//思路分析
		//1. 这道题,可以使用分支来完成,但是要求使用switch
		//2. 这里我们需要进行一个转换: (编程思想)
		//   如果成绩在 [60,100] , (int)(成绩/60) = 1
		//   如果成绩在 [0,60) , (int)(成绩/60) = 0
			
		//代码实现
		
		// System.out.println("请输入你的成绩,不能大于100");

		// double score = myScanner.nextDouble();

		// //使用 if-else 保证输入的成绩是有效的 0-100
		
		// if(score >= 0 && score <= 100) {

		// 	switch((int)(score / 60)) {
		// 		case 1 :
		// 			System.out.println("合格");
		// 			break;
		// 		case 0 :
		// 			System.out.println("不合格");
		// 			break;
		// 		// default :
		// 		// 	System.out.println("输入的成绩须在1-100之间");
		// 	}
		// } else {
		// 	System.out.println("输入的成绩须在1-100之间");
		// }
		
		//根据用于指定月份,打印该月份所属的季节.
		//3,4,5春季6,7,8夏季9,10,11秋季12,1,2冬季
		//提示 穿透
		
		//思路分析
		//1. 创建Scanner对象,接收用户输入
		//2. 使用 int month 接收
		//3. 使用switch 来匹配,使用穿透来完成,比较简洁
		
		System.out.println("请输入月份");

		int month = myScanner.nextInt();

		switch(month) {
			case 3 :
			case 4 :
			case 5 :
				System.out.println("是春季");
				break;
			case 6 :
			case 7 :
			case 8 :
				System.out.println("是夏季");
				break;
			case 9 :
			case 10 :
			case 11 :
				System.out.println("是秋季");
				break;
			case 12 :
			case 1 :
			case 2 :
				System.out.println("是冬季");
				break;
			default :
				System.out.println("输入的月份须在1-12之间");
		}
	}
}
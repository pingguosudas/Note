import java.util.Scanner;
public class MulForExercise {

	//编写一个main方法
	public static void main(String[] args) {
		
		//统计3个班成绩情况,每个班有5名同学,求出各个班的平均分和所有班级的平均分
		//学生的成绩从键盘输入
		//统计三个班及格人数,每个班有5名同学

		//思路分析:
		//化繁为简
		//(1) 先计算一个班,5个学生的成绩,使用for
		//1.1 创建一个Scanner对象,接收用户的输入
		//1.2 得到该班级平均分,定义一个double sum 把该班级5个学生成绩累计
		
		//(2) 统计3个班(每个班5个学生)平均分
		//(3) 所有班级的平均分
		//3.1 定义一个变量double totalScore 累计所有学生成绩
		//3.2 当多重循环结束后,totalScore / (3 * 5)
		//(4) 统计三个班及格人数
		//4.1 定义一个变量 int passNum = 0 当有一个学生成绩>=60 passNum++
		//4.2 如果 >= 60 passNum++
		//(5) 可以优化[效率,可读性,结构]
		
		//创建 Scanner 对象
		Scanner myScanner = new Scanner(System.in);
		double totalScore = 0;//累计所有学生成绩
		int passNum = 0;//累计及格人数
		for (int i = 1; i <= 3; i++) {//i 表示班级

			double sum = 0;//一个班级的总分
			for (int j = 1; j <= 5; j++) {//j 表示学生
				System.out.println("请输入第" + i +"个班第" 
					+ j + "个学生的成绩");
				double score = myScanner.nextDouble();
				//当有一个学生成绩>=60 passNum++
				if (score >= 60) {
					passNum++;
				}
				sum += score;//累计
				System.out.println("成绩为" + score);
			}
			//因为sum是5个学生的总成绩
			System.out.println("sum = " + sum + " 平均分 = " + (sum / 5));
			//把sum累计到totalScore
			totalScore += sum;
		}
		System.out.println("三个班总分=" + totalScore 
			+ " 平均分=" + (totalScore / 15));
		System.out.println("及格人数=" + passNum);
	}
}
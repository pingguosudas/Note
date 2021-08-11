
public class RecoursionExercise02 {

	//编写一个main方法
	public static void main(String[] args) {
		Monkey t = new Monkey();
		int day = 1;
		int peachNum = t.peach(day);
		if(peachNum != -1) {
			System.out.println("第 " + day + " 天有 " + peachNum + " 个桃");
		}
	}
}

class Monkey {
	/*
	 猴子吃桃问题:有一堆桃子,猴子第一天吃了其中一半，并多吃了一个
	 以后每天猴子都吃其中一半,然后再多吃一个,当第10天时
	 想再吃时(即还没吃),发现只有一个桃子,问最初有多少个桃子
	 思路:逆推
	 1. day = 10 有1个桃子
	 2. day = 9  有 (day 10 + 1) * 2 = 4
	 3. day = 8  有 (day 9 + 1) * 2 = 10
	 4. 前一天的桃子 = (后一天的桃子 + 1) * 2
	 5. 递归
	 */
	public int peach(int day) {
		if(day == 10) {
			return 1;
		} else if(day >= 1 && day <= 9) {
			return (peach(day + 1) + 1) * 2;
		} else {
			System.out.println("day须在1-10");
			return -1;
		}
	}
}

public class Task01 {

	//编写一个main方法
	public static void main(String[] args) {

		/*
		 某人有100000元,每经过一次路口,需要交费,规则如下:
		 (1) 当现金 > 50000 时,每次交 5%
		 (2) 当现金 <= 50000 时,每次交 1000
		 计算该人最多可以经过多少次路口,要求使用 while break

		 思路分析
		 1. 定义double money保存100000
		 2. 根据题的要求,分析出来三种情况
		    money > 50000
		    money >= 1000 && money <= 50000
		    money <1000
		 3. 使用多分支if-else-if
		 4. while-break[money < 1000],同时使用一个变量count来保存通过的路口数

		*/
	
		double money = 100000;//剩余钱的数
		int count = 0;//累计通过路口数
		while (true) {//无限循环
			if (money > 50000) {
				money *= 0.95;//过了这个路口,还有
				count++;
			} else if (money >= 1000) {
				money -= 1000;
				count++;
			} else {//不足以支付
				break;
			}
		}
		
		System.out.println("100000元可通过的路口数 = " + count);
	}
}
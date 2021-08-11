
public class MiGong {

	//编写一个main方法
	public static void main(String[] args) {

		//
		int map[][] = new int[8][7];
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				if(i == 0 || i == map.length - 1 || j == 0 || j == map[i].length - 1) {
					map[i][j] = 1;
				}
			}
		}
		map[3][1] = 1;
		map[3][2] = 1;
		// map[1][2] = 1;
		map[2][2] = 1;//测试回溯
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}

		//使用findWay给老鼠找路
		T t = new T();
		t.fingWay(map, 1, 1);

		System.out.println("==找路的情况如下==");
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}
}

class T {
	//使用递归回溯的思想解决老鼠出迷宫
	
	//解读
	//1. findWay方法就是专门找出迷宫的路径
	//2. 如果找到就返回true,否则返回false
	//3. map就是二维数组,即表示迷宫地图
	//4. i, j就是老鼠位置,初始化位置为(1, 1)
	//5. 因为是递归找路,所以先规定map数组各个值的含义
	//   0 表示可以走 1 表示障碍物 2 表示可以走 3 表示走过但走不通是死路
	//6. 当map[6][5] = 2就说明找到通路,可以结束,否则就继续找.
	//7. 先确定老鼠找路策略 下 -> 右 -> 上 -> 左
	public boolean fingWay(int map[][], int i, int j) {
		if(map[6][5] == 2) {//说明已经找到
			return true;
		} else {
			if(map[i][j] == 0) {//当这个位置0,说明可以走
				//假定可以走通
				map[i][j] = 2;
				//使用招录策略,确定该位置是否真的可以走通
				//下 -> 右 -> 上 -> 左
				if(fingWay(map, i + 1, j)) {//先走下
					return true;
				} else if(fingWay(map, i, j + 1)) {
					return true;
				} else if(fingWay(map, i - 1, j)) {
					return true;
				} else if(fingWay(map, i, j - 1)) {
					return true;
				} else {
					map[i][j] = 3;
					return false;
				}
				
			} else {//map[i][j] = 1, 2, 3
				return false;
			}
		}
	}

	//修改找路策略,看看路径是否变化
	//下 -> 右 -> 上 -> 左 ==> 上 -> 右 -> 下 -> 左
	public boolean fingWay2(int map[][], int i, int j) {
		if(map[6][5] == 2) {//说明已经找到
			return true;
		} else {
			if(map[i][j] == 0) {//当这个位置0,说明可以走
				//假定可以走通
				map[i][j] = 2;
				//使用招录策略,确定该位置是否真的可以走通
				//下 -> 右 -> 上 -> 左
				if(fingWay2(map, i - 1, j)) {//先走下
					return true;
				} else if(fingWay2(map, i, j + 1)) {
					return true;
				} else if(fingWay2(map, i + 1, j)) {
					return true;
				} else if(fingWay2(map, i, j - 1)) {
					return true;
				} else {
					map[i][j] = 3;
					return false;
				}
				
			} else {//map[i][j] = 1, 2, 3
				return false;
			}
		}
	}
}
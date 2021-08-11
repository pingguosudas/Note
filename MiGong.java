
public class MiGong {

	//��дһ��main����
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
		map[2][2] = 1;//���Ի���
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}

		//ʹ��findWay��������·
		T t = new T();
		t.fingWay(map, 1, 1);

		System.out.println("==��·���������==");
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}
}

class T {
	//ʹ�õݹ���ݵ�˼����������Թ�
	
	//���
	//1. findWay��������ר���ҳ��Թ���·��
	//2. ����ҵ��ͷ���true,���򷵻�false
	//3. map���Ƕ�ά����,����ʾ�Թ���ͼ
	//4. i, j��������λ��,��ʼ��λ��Ϊ(1, 1)
	//5. ��Ϊ�ǵݹ���·,�����ȹ涨map�������ֵ�ĺ���
	//   0 ��ʾ������ 1 ��ʾ�ϰ��� 2 ��ʾ������ 3 ��ʾ�߹����߲�ͨ����·
	//6. ��map[6][5] = 2��˵���ҵ�ͨ·,���Խ���,����ͼ�����.
	//7. ��ȷ��������·���� �� -> �� -> �� -> ��
	public boolean fingWay(int map[][], int i, int j) {
		if(map[6][5] == 2) {//˵���Ѿ��ҵ�
			return true;
		} else {
			if(map[i][j] == 0) {//�����λ��0,˵��������
				//�ٶ�������ͨ
				map[i][j] = 2;
				//ʹ����¼����,ȷ����λ���Ƿ���Ŀ�����ͨ
				//�� -> �� -> �� -> ��
				if(fingWay(map, i + 1, j)) {//������
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

	//�޸���·����,����·���Ƿ�仯
	//�� -> �� -> �� -> �� ==> �� -> �� -> �� -> ��
	public boolean fingWay2(int map[][], int i, int j) {
		if(map[6][5] == 2) {//˵���Ѿ��ҵ�
			return true;
		} else {
			if(map[i][j] == 0) {//�����λ��0,˵��������
				//�ٶ�������ͨ
				map[i][j] = 2;
				//ʹ����¼����,ȷ����λ���Ƿ���Ŀ�����ͨ
				//�� -> �� -> �� -> ��
				if(fingWay2(map, i - 1, j)) {//������
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
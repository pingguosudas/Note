
public class RecoursionExercise02 {

	//��дһ��main����
	public static void main(String[] args) {
		Monkey t = new Monkey();
		int day = 1;
		int peachNum = t.peach(day);
		if(peachNum != -1) {
			System.out.println("�� " + day + " ���� " + peachNum + " ����");
		}
	}
}

class Monkey {
	/*
	 ���ӳ�������:��һ������,���ӵ�һ���������һ�룬�������һ��
	 �Ժ�ÿ����Ӷ�������һ��,Ȼ���ٶ��һ��,����10��ʱ
	 ���ٳ�ʱ(����û��),����ֻ��һ������,������ж��ٸ�����
	 ˼·:����
	 1. day = 10 ��1������
	 2. day = 9  �� (day 10 + 1) * 2 = 4
	 3. day = 8  �� (day 9 + 1) * 2 = 10
	 4. ǰһ������� = (��һ������� + 1) * 2
	 5. �ݹ�
	 */
	public int peach(int day) {
		if(day == 10) {
			return 1;
		} else if(day >= 1 && day <= 9) {
			return (peach(day + 1) + 1) * 2;
		} else {
			System.out.println("day����1-10");
			return -1;
		}
	}
}

public class Task06 {

	//��дһ��main����
	public static void main(String[] args) {
		Cale cale = new Cale(9, 3);
		System.out.println("��ӵĽ����" + cale.plus());
		System.out.println("����Ľ����" + cale.minus());
		System.out.println("��˵Ľ����" + cale.mul());
		Double divRes = cale.div();
		if(divRes != null) {
			System.out.println("����Ľ����" + divRes);
		}
	}
}

/*
 ��̴���һ��Cale������,�����ж���2��������ʾ����������
 �����ĸ�����ʵ����͡���ˡ���(Ҫ���Ϊ0�Ļ�,Ҫ��ʾ)��������������,�ֱ����
 */

class Cale {

	double ope1;
	double ope2;

	public Cale(double ope1, double ope2) {
		this.ope1 = ope1;
		this.ope2 = ope2;
	}

	public double plus() {
		return ope1 + ope2;
	}

	public double minus() {
		return ope1 - ope2;
	}

	public double mul() {
		return ope1 * ope2;
	}

	public Double div() {
		//�ж�
		if(ope2 != 0) {
			return ope1 / ope2;
		} else {
			System.out.println("��������,����Ϊ0");
			return null;
		}
	}
}

public class Task01 {

	//��дһ��main����
	public static void main(String[] args) {

		A01 a01 = new A01();
		double[] arr = {1, 1.4, -1.3, 89.8, 123.8, 66};//null;//{};
		Double res = a01.max(arr);
		if(res != null) {
			System.out.println("arr�����ֵ�� = " + res);
		} else {
			System.out.println("arr����������,���鲻��Ϊnull,����{}");
		}
	}
}

/*
 ��д��A01,���巽��max,ʵ����ĳ��double��������ֵ,������
 ���������ҵ��,�ٿ��Ǵ���Ľ�׳��
 */
class A01 {

	public Double max(double... arr) {

		//���ж�arr�Ƿ�Ϊnull,Ȼ�����ж�length�Ƿ� > 0
		if(arr != null && arr.length > 0) {

			double max = arr[0];//�ٶ�
			for(int i = 1; i < arr.length; i++) {
				if(max < arr[i]) {
					max = arr[i];//double
				}
			}
			return max;
		} else {
			return null;
		}
	}
}
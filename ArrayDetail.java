
public class ArrayDetail {

	//��дһ��main����
	public static void main(String[] args) {

		//1. �����Ƕ����ͬ�������ݵ����,ʵ�ֶ���Щ���ݵ�ͳһ����
		//int arr1[] = {1, 2, 3, 60, (int)1.1, "hello"};//String->int
		double arr2[] = {1.1, 2.2, 3.3, 60.6};//int->double
		//2. �����е�Ԫ�ؿ������κ���������,�����������ͺ���������,�����ܻ���
		String arr3[] = {"����","jack","milan"};
		//3. ���鴴����,���û�и�ֵ,��Ĭ��ֵ
		//int 0,short 0,byte 0,long 0
		//float 0.0,double 0.0,char \u0000
		//boolean false,String null
		short arr4[] = new short[3];
		System.out.println("����������arr4");
		for(int i = 0; i < arr4.length; i++) {
			System.out.println(arr4[i]);
		}
		//6. ������±������ָ����Χ��ʹ��,������ʾ:�±�Խ��,
		//����,int arr[] = new int[5];����Ч�±�Ϊ0-4
		//��������±�/������С��0��������鳤��-1(4)
		int arr[] = new int[5];
		System.out.println(arr[5]);//����Խ��
	}
}
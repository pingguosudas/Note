
public class Task04 {

	//��дһ��main����
	public static void main(String[] args) {
		//��֪��һ����������,Ҫ�����һ��Ԫ��,������˳����Ȼ������
		//{10, 12, 45, 90},���23->{10, 12, 23, 45, 90}
		int arr[] = {10, 12, 45, 90};
		int arrNew[] = new int[arr.length + 1];
		int insertNum = 23;
		//int index = -1;
		int index = 0;
		int i = 0;
		for(; i < arr.length; i++) {
			if(arr[i] < insertNum) {
				arrNew[i] = arr[i];
				index++;
			} else {
				//index = i;
				break;
			}
		}
		arrNew[index] = insertNum;
		for(i = index; i < arr.length; i++) {
			arrNew[i + 1] = arr[i];
		}
		arr = arrNew;
		System.out.println("���23�������Ϊ");
		for(i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
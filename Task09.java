
public class Task09 {

	//��дһ��main����
	public static void main(String[] args) {
		Music music = new Music("irony", 250);
		music.play();
		System.out.println(music.getInfo());
	}
}

/*
 ����Music��,������������name������ʱ��times����,
 ���в���play���ܺͷ��ر���������Ϣ�Ĺ��ܷ���getInfo
 */
class Music {
	
	String name;
	int times;

	public Music(String name, int times) {
		this.name = name;
		this.times = times;
	}
	//����play����
	public void play() {
		System.out.println("���� " + name + " ���ڲ�����...ʱ��Ϊ " + times + "��");
	}

	public String getInfo() {
		return "name = " + name + " times = " +times;
	}
}
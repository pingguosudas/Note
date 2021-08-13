
public class Task09 {

	//编写一个main方法
	public static void main(String[] args) {
		Music music = new Music("irony", 250);
		music.play();
		System.out.println(music.getInfo());
	}
}

/*
 定义Music类,里面有音乐名name、音乐时长times属性,
 并有播放play功能和返回本身属性信息的功能方法getInfo
 */
class Music {
	
	String name;
	int times;

	public Music(String name, int times) {
		this.name = name;
		this.times = times;
	}
	//播放play功能
	public void play() {
		System.out.println("音乐 " + name + " 正在播放中...时长为 " + times + "秒");
	}

	public String getInfo() {
		return "name = " + name + " times = " +times;
	}
}
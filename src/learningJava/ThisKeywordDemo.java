package learningJava;

import javax.sound.sampled.TargetDataLine;

public class ThisKeywordDemo {
	int x;
	int y;
	String s = "RCV";

	public static void main(String[] args) {
		ThisKeywordDemo de = new ThisKeywordDemo(5,9);
		de.getData();

	}
	public ThisKeywordDemo(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x=x;
		y=y;
		System.out.println(x+y);
	}

	public void getData() {
		int x = 50;
		int y = 40;
		System.out.println(this.x + this.y);
//		System.out.println(x + y);
//		getData1();
	}

	public void getData1() {
		int x = 70;
		int y = 400;
		System.out.println(this.x + y);
		System.out.println(x + y);

	}
}
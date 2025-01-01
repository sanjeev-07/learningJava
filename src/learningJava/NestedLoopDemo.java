package learningJava;

public class NestedLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 1; i <= 4; i++) {
//			System.out.println(i);
			int j = 1;
			while (j <= 5) {

				for (int x = 1; x <= 2; x++) {
					System.out.println("i is " + i + " j is " + j+ " x is " +x);
					count++;
				}
				j++;
			}
		}
		System.out.println(count);
	}

}

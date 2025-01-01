package learningJava;

import java.util.Iterator;

//import MethodDemo;

public class MultiDimArray {

	public static void main(String[] args) {
		int[][] multiDimArray = new int[2][3];
		multiDimArray[0][0] = 10;
		multiDimArray[0][1] = 20;
		multiDimArray[0][2] = 30;
		multiDimArray[1][0] = 40;
		multiDimArray[1][1] = 50;
		multiDimArray[1][2] = 60;
//		Login();
//		System.out.println(multiDimArray[1][1]);
		int[][] multiDimArray1 = { { 10, 20, 30 }, { 40, 50, 60 } };
//		System.out.println(multiDimArray1[1][1]);
		for (int i = 0; i < multiDimArray1.length; i++) {
			for (int j = 0; j < multiDimArray1[i].length; j++) {
				System.out.println(multiDimArray1[i][j]);
			}
		}

	}

}

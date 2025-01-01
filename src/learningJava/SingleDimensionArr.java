package learningJava;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class SingleDimensionArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = new int[10];
		myArray[0] = 10;
		myArray[0] = 20;
		myArray[0] = 30;
		myArray[0] = 40;
		int[] myArray1 = { 10, 20, 30, 40 };
//		for (int i = 0; i < myArray1.length; i++) {
//			System.out.println(myArray1[i]);
//		}
		if (myArray1[2] == myArray1[3]) {
			System.out.println("If  passed");
		} else if (myArray1[2] > myArray1[3]) {
			System.out.println("else if passed");
		} else {
			System.out.println("else passed");
		}

	}

}

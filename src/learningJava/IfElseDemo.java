package learningJava;

import java.awt.desktop.AboutHandler;

public class IfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//if(expression)
		int num1 = 50;
		int num2 = 20;
		int num3 = 70;
		if (num1 > num2) {
			System.out.println("num1 is greater than num2");
			if (num2 > num3) {
				System.out.println("nested if");

			} else {
				System.out.println("nested else");
			}
		} else if (num1 == num2) {
			System.out.println("num2 is equal to num1");
		} else {
			System.out.println("num1 is less than num2");
		}

	}

}

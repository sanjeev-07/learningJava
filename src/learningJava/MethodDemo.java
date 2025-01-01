package learningJava;

import java.lang.foreign.AddressLayout;
import java.security.PublicKey;
import java.util.function.BiConsumer;

public class MethodDemo {

	public static void main(String[] args) {
		MedthodsDemo meth = new MedthodsDemo();
//		meth.logout();
		logout();
		addnumbers(90, 35);
		diffpara("banana", 120, 12);
	}

	public static void login() {
		System.out.println("Login success");

	}

	public static void logout() {
		login();
		System.out.println("logout success");
	}

	public static void addnumbers(int x, int y) {
		int z=x+y;
//		return z;
		System.out.println(z);
	}

	public static void diffpara(String s, int i, float f) {
		System.out.println(s);
		System.out.println(i);
		System.out.println(f);
	}
}

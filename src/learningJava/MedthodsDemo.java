package learningJava;
//import learningJava.MethodDemo;
public class MedthodsDemo {

	public static void main(String[] args) {
		MedthodsDemo meth = new MedthodsDemo();
		meth.logout();
		MethodDemo abc = new MethodDemo();
		abc.diffpara("camel", 120, 12);
	}

	public void login() {
		System.out.println("Login success");

	}

	public void logout() {
		login();
		System.out.println("logout success");
	}
}

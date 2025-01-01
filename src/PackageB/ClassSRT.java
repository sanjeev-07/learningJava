package PackageB;

public class ClassSRT {

	public int publicvariable = 1;
	int defaultvariable = 2;
	protected int protectedvariable = 3;
	private int privatevariable = 4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassSRT y = new ClassSRT();
		y.defaultmethod();
	}

	public void publicmethod() {
		System.out.println("This is public method");

	}

	void defaultmethod() {
		System.out.println("This is default method");
	}

	protected void protectedmethod() {
		System.out.println("This is protected method");

	}

	private void privatemethod() {
		System.out.println("This is private method");

	}

}

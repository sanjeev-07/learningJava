package TryCatch;

public class TryCatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int i = 0;
			System.out.println(("Before division"));
			System.out.println(i / 1);
		} catch (Throwable t) {
			System.out.println(t.getMessage());
			System.out.println(t.getCause());
			t.printStackTrace();

		}
		finally {
			System.out.println("finally block");
		}
		System.out.println("After division");

	}

}

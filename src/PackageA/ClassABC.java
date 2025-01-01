package PackageA;

import PackageB.ClassSRT;
import learningJava.MethodDemo;

public class ClassABC {

	public static void main(String[] args) {
		ClassSRT s = new ClassSRT();
		s.publicmethod();
		s.defaultmethod();
		s.protectedmethod();
		s.privatemethod();
	}

}

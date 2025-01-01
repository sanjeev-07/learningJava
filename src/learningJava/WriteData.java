package learningJava;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class WriteData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Step1: Create an object of FileWrite
		FileWriter fw = new FileWriter("C:\\Learning Java\\LearningJava\\src\\PackageA\\TestData.properties",true);
//		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\PackageA\\TestData.properties");
		// Step2: Create an object of Properties
		Properties p = new Properties();

		// Step 4: set get property method to set property
		p.setProperty("Book", "Marvel Stars");
		p.store(fw, "xyz");
		
//		System.out.println(p.getProperty("name"));
	}

}

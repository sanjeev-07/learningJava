package learningJava;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Step1: Create an object of FileReader
//		FileReader fr = new FileReader("C:\\Learning Java\\LearningJava\\src\\PackageA\\TestData.properties");
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\PackageA\\TestData.properties");
		// Step2: Create an object of Properties
		Properties p = new Properties();
		// Step3: Load the file
		p.load(fis);
		// Step 4: Use get property method to get get property
		System.out.println(p.getProperty("Book"));
//		System.out.println(System.getProperty("user.dir"));
	}

}

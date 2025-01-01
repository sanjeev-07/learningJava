import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadDatatoTxtandCSV {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Learning Java\\LearningJava\\src\\PackageA\\TestDataTxt.txt");
		// Step1: Create an object of FileWrite
		FileReader fr = new FileReader(f);

		// Step 2: Create object of Buffered Writer class
		BufferedReader bw = new BufferedReader(fr);

		// Step 3: Write data
		System.out.println(bw.readLine());

		// Step 4: Close file
		bw.close();
		System.out.println(System.getProperty("user.dir"));

	}

}

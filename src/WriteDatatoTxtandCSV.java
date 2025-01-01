import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDatatoTxtandCSV {

	public static void main(String[] args) throws IOException {
		File f =new File("C:\\Learning Java\\LearningJava\\src\\PackageA\\TestDataTxt.csv");
		// Step1: Create an object of FileWrite
		FileWriter fw = new FileWriter(f,true);

		// Step 2: Create object of Buffered Writer class
		BufferedWriter bw = new BufferedWriter(fw);

		// Step 3: Write data
		bw.write("Sample txt"+",");
		
		// Step 4: Close file
		bw.close();
		System.out.println(System.getProperty("user.dir"));

	}

}

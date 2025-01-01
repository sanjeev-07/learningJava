package rwxls;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDatatoXls {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet1 = workbook.createSheet("Sheet1");

		Row r0 = sheet1.createRow(0);
		Cell c0 = r0.createCell(0);
		c0.setCellValue("Sanjeev");
		File f = new File("C:\\Learning Java\\LearningJava\\src\\sampleData\\testdata1.xls");
		FileOutputStream fos = new FileOutputStream(f);
		workbook.write(fos);
		fos.close();
		workbook.close();
	}

}

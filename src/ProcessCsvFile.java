import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ProcessCsvFile {

	public static BufferedReader csvReader;
	public static void main(String[] args) throws IOException {
		//Read email
		String fileName = "abc.csv";
		readCsvFile(fileName);

		processCsvFile();
		
		

	}

	private static void processCsvFile() throws IOException {
		
		XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Java Books");
		String row;
		while ((row = csvReader.readLine()) != null) {
			try (FileOutputStream outputStream = new FileOutputStream("JavaBooks.xlsx")) {
	            //workbook.write(outputStream);
	        }
		}
		
	}

	private static void readCsvFile(String fileName) throws FileNotFoundException {
		String filePath = "/Practice/src/resources";
		csvReader = new BufferedReader(new FileReader(filePath+fileName)); 
		
	}

}

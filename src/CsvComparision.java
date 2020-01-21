import java.io.*;
import java.util.*;

import com.opencsv.*;

public class CsvComparision {

	public static void main(String arg[]) {
		// Read files
		try {
			//FileReader filereader = new FileReader("C:/Users/N23HCEW/MyDrive/SCR issue/DB2_CSN_Data.csv");
			
			CSVReader csvReader1 = new CSVReaderBuilder(new FileReader("C:/Users/N23HCEW/MyDrive/SCR issue/Oracle_distinct_Data.csv")) 
                    .withSkipLines(1) 
                    .build(); 
			List<String[]> oracleCsnData = csvReader1.readAll();
			System.out.println("Total distinct records in oracle = "+oracleCsnData.size());
			
			List<String> ora=new ArrayList<>();
			for(int i=0;i<oracleCsnData.size();i++) {
				ora.add(oracleCsnData.get(i)[0]);
			}
			
			System.out.println("Ora size = "+ora.size());
			
			CSVReader csvReader2 = new CSVReaderBuilder(new FileReader("C:/Users/N23HCEW/MyDrive/SCR issue/DB2_CSN_Distict_Data_new.csv")) 
                    .withSkipLines(1) 
                    .build(); 
			List<String[]> db2CsnData = csvReader2.readAll();
			System.out.println("Total distinct records in DB2 = "+db2CsnData.size());
			
			List<String> db2=new ArrayList<>();
			for(int i=0;i<db2CsnData.size();i++) {
				db2.add(db2CsnData.get(i)[0]);
			}
			
			System.out.println("DB2 size = "+db2.size());
			
			List<String> commonRecords1 = new ArrayList<>();
			List<String> OracleRecordsOnly = new ArrayList<>();
			
			for(String s:ora) {
				if(db2.contains(s)) {		
					commonRecords1.add(s);
				} else {
					OracleRecordsOnly.add(s);
				}
			}
			
			System.out.println("Common records in Oracle and DB2 = "+commonRecords1.size());
			System.out.println("Records present in Oracle only[Not in DB2] ="+OracleRecordsOnly.size());
			
			
			List<String> commonRecords2 = new ArrayList<>();
			List<String> db2RecordsOnly = new ArrayList<>();
			
			for(String s:db2) {
				if(ora.contains(s)){
					commonRecords2.add(s);
				} else {
					db2RecordsOnly.add(s);
				}
			}
			
			System.out.println("Common records in DB2 and Oracle ="+commonRecords2.size());
			System.out.println("Records present in DB2 only[Not in Oracle] "+db2RecordsOnly.size());
			
			//CsvComparision csvReader = new CsvComparision(filereader); 
	        //String[] nextRecord;
		} catch (Exception e) {
			
		}
		

		// Convert files into arrayList.

		// Compare file

		/*BufferedReader crunchifyBuffer = null;

		try {
			String crunchifyLine;
			crunchifyBuffer = new BufferedReader(
					new FileReader("C:/Users/N23HCEW/MyDrive/SCR issue/DB2_CSN_Data.csv"));

			// How to read file in java line by line?
			while ((crunchifyLine = crunchifyBuffer.readLine()) != null) {
				System.out.println("Raw CSV data: " + crunchifyLine);
				System.out.println("Converted ArrayList data: " + crunchifyCSVtoArrayList(crunchifyLine) + "\n");
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (crunchifyBuffer != null)
					crunchifyBuffer.close();
			} catch (IOException crunchifyException) {
				crunchifyException.printStackTrace();
			}

		}
	}

	// Utility which converts CSV to ArrayList using Split Operation
	public static ArrayList<String> crunchifyCSVtoArrayList(String crunchifyCSV) {
		ArrayList<String> crunchifyResult = new ArrayList<String>();

		if (crunchifyCSV != null) {
			String[] splitData = crunchifyCSV.split("\\s*,\\s*");
			for (int i = 0; i < splitData.length; i++) {
				if (!(splitData[i] == null) || !(splitData[i].length() == 0)) {
					crunchifyResult.add(splitData[i].trim());
				}
			}
		}

		return crunchifyResult;
	}*/
	}
}

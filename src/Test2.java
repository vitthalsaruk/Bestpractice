import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import org.hibernate.StatelessSession;

//import org.hibernate.StatelessSession;

public class Test2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException, ParseException {

		String line;
		List<String> oracleData = new ArrayList<>();
		BufferedReader br = new BufferedReader(
				new FileReader("C:/Users/N23HCEW/MyDrive/SCR issue/1july/a.csv"));
		//br.readLine();

		while ((line = br.readLine()) != null) {
			//String[] record = line.split(",");
			//String stringDate = record[2];
			String stringDate=line;

			Calendar calendar = DateUtil.convertCSTtoUTC(DateUtil.convertStringToCalendar(stringDate));

			String stringDateUTC = DateUtil.convertCalenderToStringDate(calendar, "yyyy-MM-dd HH:mm:ss.SSS");

			System.out.println(stringDateUTC);
			
			//oracleData.add(stringDateUTC);

		}
		System.out.println(oracleData.size());
		
		/*FileWriter csvWriter = new FileWriter("C:/Users/N23HCEW/MyDrive/SCR issue/27jun/final.csv");

		int counter=0;
		for (String s:oracleData) {
			System.out.println(s);
			csvWriter.append(s); 
			csvWriter.append("\n");
			counter++;
		}*/
		
		//System.out.println("Done!!!!"+counter);

		/*
		 * String stringDate = oracleData.get(0)[2];
		 * System.out.println(oracleData.get(0)[0]);
		 * System.out.println("CST date = " + stringDate);
		 * 
		 * Calendar calendar =
		 * DateUtil.convertCSTtoUTC(DateUtil.convertStringToCalendar(stringDate)
		 * );
		 * 
		 * String string = DateUtil.convertCalenderToStringDate(calendar,
		 * "yyyy-MM-dd HH:mm:ss.SSS");
		 * 
		 * System.out.println("UTC date = " + string);
		 * 
		 * StatelessSession db2Session = null; try { db2Session =
		 * HibernateOracleSession.getSessionFactory().openStatelessSession(); }
		 * catch (Exception e) {
		 * 
		 * }
		 */

		/*
		 * System.out.println(sd);
		 * 
		 * //Date d = DateUtil.getDateFromString(sd, "dd-MMM-yy HH.mm.ss");
		 * 
		 * Calendar c = DateUtil.convertStringToCalendar(sd);
		 * 
		 * c = DateUtil.convertCSTtoUTC(c);
		 * 
		 * String dd = DateUtil.convertCalenderToStringDate(c,
		 * "yyyy-MM-dd HH.mm.ss.S"); //2018-12-17T13:12:50.000 UTC
		 * System.out.println(dd);
		 */

	}

}

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Testing {
	
	public static void main(String [] arg) {
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";

		Scanner scan = new Scanner(System.in);

		/* Declare second integer, double, and String variables. */
		int ii=scan.nextInt();
		double dd = scan.nextDouble();
		String ss = scan.next();

		/* Read and save an integer, double, and String to your variables.*/
		// Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

		/* Print the sum of both integer variables on a new line. */
		System.out.println(i+ii);

		/* Print the sum of the double variables on a new line. */
		System.out.println(d+dd);

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
		System.out.println(s+ss);

		scan.close();
	}
	
	
}

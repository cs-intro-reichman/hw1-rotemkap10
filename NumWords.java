// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int numInWords = Integer.parseInt(args[0]);
		int hundreds = numInWords/100;
		int tens = numInWords%100/10;
		int ones = numInWords % 10;
		System.out.println(hundreds + " " + "hundreds" + "," + " " + tens + " " + "tens" + "," + " " + "and" + " " + ones + " " + "ones.");
		

	}
}

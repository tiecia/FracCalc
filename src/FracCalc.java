import java.util.Scanner;

public class FracCalc {
	
	//fraction one values
	public static String numeratorOneString;
	public static int numeratorOne;
	public static int wholeNumberOne;
	public static int denominatorOne;
	public static boolean isOneMixed;
	
	//Fraction two values
	public static String numeratorTwoString;
	public static int wholeNumberTwo;
	public static int numeratorTwo;
	public static int denominatorTwo;
	public static boolean isTwoMixed;
	
	//inputs
	public static String fracOne;
	public static String operator;
	public static String fracTwo;
	public static boolean calcOn = true;
	
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Input: ");
		while(inputScanner.hasNext() && calcOn == true) {
			if(inputScanner.hasNext("quit")) {
				calcOn = false;
			} else {
				//Parse and set fractions to variables
				fracOne = inputScanner.next();
				operator = inputScanner.next();
				fracTwo = inputScanner.next();
				//parse and set numerators and denominators
				numeratorOneString = parseNumerator(fracOne);
				denominatorOne = parseDenominator(fracOne);
				numeratorTwoString = parseNumerator(fracTwo);
				denominatorTwo = parseDenominator(fracTwo);
				
				//parse mixed number one
				Scanner parseMixedNumberOne = new Scanner(numeratorOneString).useDelimiter("_");
				String mixedCache = parseMixedNumberOne.next();
				wholeNumberOne = 0;
				if(parseMixedNumberOne.hasNext()) {
					wholeNumberOne = Integer.parseInt(mixedCache);
					numeratorOne = Integer.parseInt(parseMixedNumberOne.next());
					isOneMixed = true;
				} else {
					numeratorOne = Integer.parseInt(mixedCache);
					isOneMixed = false;
				}
				
				//parse mixed number two
				Scanner parseMixedNumberTwo = new Scanner(numeratorTwoString).useDelimiter("_");
				mixedCache = parseMixedNumberTwo.next();
				wholeNumberTwo = 0;
				if(parseMixedNumberTwo.hasNext()) {
					wholeNumberTwo = Integer.parseInt(mixedCache);
					numeratorTwo = Integer.parseInt(parseMixedNumberTwo.next());
					isTwoMixed = true;
					
				} else {
					numeratorTwo = Integer.parseInt(mixedCache);
					isTwoMixed = false;
				}
				
				//make mixed number improper
				
				if(isOneMixed == true) {
					numeratorOne = (denominatorOne*wholeNumberOne)+numeratorOne;
				}
				if(isTwoMixed == true) {
					numeratorTwo = (denominatorTwo*wholeNumberTwo)+numeratorTwo;
				}
				
				
				//Print to the console
				System.out.println("Fraction 1: " + numeratorOne + "/" + denominatorOne);
				if(isOneMixed == true) {
					System.out.println("Proper Fraction 1: " + numeratorOneString + "/" + denominatorOne);
				}

				System.out.println("Operator: " + operator);
				System.out.println("Fraction 2: " + numeratorTwo + "/" + denominatorTwo);
				if(isTwoMixed == true) {
					System.out.println("Proper Fraction 2: " + numeratorTwoString + "/" + denominatorTwo);
				}
				
				
				System.out.println();
				System.out.println("Input:");
			}
		}
		inputScanner.close();
		System.out.println("Goodbye");
	}
	
	public static String parseNumerator(String fraction){
		@SuppressWarnings("resource")
		Scanner parseScanner = new Scanner(fraction).useDelimiter("/");
		String numerator = parseScanner.next();
		parseScanner.close();
		return numerator;
	}
	
	public static int parseDenominator(String fraction){
		@SuppressWarnings("resource")
		Scanner parseScanner = new Scanner(fraction).useDelimiter("/");
		parseScanner.next();
		int denominator = Integer.parseInt(parseScanner.next());
		parseScanner.close();
		return denominator;
	}
}

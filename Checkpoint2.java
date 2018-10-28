import java.util.Scanner;

public class Checkpoint2 {	
	public static void main(String[] args) {
		//Step 1: Declare all Variables
		
		
		//First Numerator Variables
		int numeratorOne;
		int denominatorOne;
		
		//Fraction two values
		int numeratorTwo;
		int denominatorTwo;
		
		
		//inputs
		String fracOne;
		String operator;
		String fracTwo;
		boolean calcOn = true;
		
		//Step 2: Create input Scanner (Scans the console for input)
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Input: ");
		//Step 3: Calculator ON while loop
		while(inputScanner.hasNext() && calcOn == true) {
			if(inputScanner.hasNext("quit")) {
				//Scan for the quit phrase
				calcOn = false;
			} else {
				//Step 4: Set the two fractions and operator to their own variables
				//Parse and set fractions to variables
				fracOne = inputScanner.next();
				operator = inputScanner.next();
				fracTwo = inputScanner.next();
				//Step 5: Parse the denominator into an int and the numerator into a string
				numeratorOne = parseNumerator(fracOne);
				denominatorOne = parseDenominator(fracOne);
				numeratorTwo = parseNumerator(fracTwo);
				denominatorTwo = parseDenominator(fracTwo);
				
				//Step 8: Check to see what operator was used and do math
				if(operator.equals("+")) {
					LCD(numeratorOne, denominatorOne, numeratorTwo, denominatorTwo);
					add(numeratorOne, denominatorOne, numeratorTwo, denominatorTwo);
				}
				else if(operator.equals("-")) {
					LCD(numeratorOne, denominatorOne, numeratorTwo, denominatorTwo);
					subtract(numeratorOne, denominatorOne, numeratorTwo, denominatorTwo);
				}
				else if(operator.equals("*") || operator.equals("x")) {
					multiply(numeratorOne, denominatorOne, numeratorTwo, denominatorTwo);
				}
				else if(operator.equals("/")) {
					divide(numeratorOne, denominatorOne, numeratorTwo, denominatorTwo);
				}

				//System.out.println(solution);
				
				//Step 9: Print next imput line for next input
				System.out.println();
				System.out.println("Input:");
			}
		}
		//If quit phrase was used close the scanner and say goodbye
		inputScanner.close();
		System.out.println("Goodbye");
	}
	
	public static int parseNumerator(String fraction){
		@SuppressWarnings("resource")
		//Create scanner
		Scanner parseScanner = new Scanner(fraction).useDelimiter("/");
		//Sets the whole numerator as a string (with mixed number if applicable)
		String numeratorString = parseScanner.next();
		int numerator;
		int denominator = parseScanner.nextInt();
		parseScanner.close();
		
		Scanner parseMixedNumberOne = new Scanner(numeratorString).useDelimiter("_");
		//Set the first token to a cache variable
		int mixedCache = parseMixedNumberOne.nextInt();
		int wholeNumber = 0;
		//Check to see if there is another token after the first
		if(parseMixedNumberOne.hasNext()) {
			//If there is set the whole number to the cache number
			wholeNumber = mixedCache;
			//And set the numerator as the next token
			numerator = parseMixedNumberOne.nextInt();
			numerator = (wholeNumber*denominator)+numerator;
		} else {
			//If there is no next token set the numerator to the cache variable
			numerator = mixedCache;
		}
		
		//Returns the numerator as a string
		return numerator;
	}
	
	public static int parseDenominator(String fraction){
		@SuppressWarnings("resource")
		//Create scanner
		Scanner parseScanner = new Scanner(fraction).useDelimiter("/");
		//Sets the denominator as an int.
		parseScanner.next();
		int denominator = parseScanner.nextInt();
		parseScanner.close();
		//Returns the denominator as an int.
		return denominator;
	}
	
	public static void add(int numOne, int denomOne, int numTwo, int denomTwo) {
		String LCDString;
		//Finds a common denominator
		LCDString = LCD(numOne, denomOne, numTwo, denomTwo);
		@SuppressWarnings("resource")
		//Returns common denominator and new numerators and string to be parsed again
		Scanner s = new Scanner(LCDString).useDelimiter("!");
		int LCD = s.nextInt();
		numOne = s.nextInt();
		numTwo = s.nextInt();
		//Does the math and prints the solution
		System.out.println((numOne + numTwo) + "/" + LCD);
		//return (numOne + numTwo) + "/" + LCD;
	}
	
	public static void subtract(int numOne, int denomOne, int numTwo, int denomTwo) {
		String LCDString;
		//Finds a common denominator
		LCDString = LCD(numOne, denomOne, numTwo, denomTwo);
		@SuppressWarnings("resource")
		//Returns common denominator and new numerators and string to be parsed again
		Scanner s = new Scanner(LCDString).useDelimiter("!");
		int LCD = s.nextInt();
		numOne = s.nextInt();
		numTwo = s.nextInt();
		//Does the math and prints the solution
		System.out.println((numOne - numTwo) + "/" + LCD);
		//return (numOne - numTwo) + "/" + LCD;
	}
	
	public static void multiply(int numOne, int denomOne, int numTwo, int denomTwo) {
		//return (numOne*numTwo) + "/" + (denomOne*denomTwo);
		//Does the math and prints it
		System.out.println((numOne*numTwo) + "/" + (denomOne*denomTwo));
	}
	
	public static void divide(int numOne, int denomOne, int numTwo, int denomTwo) {
		//return (numOne * denomTwo) + "/" + (numTwo * denomOne);
		//Does the math and prints it
		System.out.println((numOne * denomTwo) + "/" + (numTwo * denomOne));
	}
	
	public static String LCD(int numOne, int denomOne, int numTwo, int denomTwo) {
		//Multiplies the two denominators together to get a common denom
		int LCD = denomOne*denomTwo;
		//Gets the new numerators by multiplying the opposite denom by the other num
		numOne = numOne*denomTwo;
		numTwo = numTwo*denomOne;
		return LCD + "!" + numOne + "!" + numTwo;
	}
	
	public static void reduce(double numerator, double denominator) {
		int GCF;
		for(int i = 1000000000; i>=1; i--) {
			if(numerator % i != 0) {
				
			} else {
				GCF = i;
			}
		}
	}
}

/*     Test Case
 * 2/3 + 5/6
 * 2/3 * 4/5
 * 6/7 / 4/5
 * 3_4/5 - 9/1
 * 4 + 6
 * 40/2 - 87/99
 * 3_67/6 * 7_1/2
 *-4/6 / -3/4
 *-5_6/7 - 6/7
 *-4 + -6
 */
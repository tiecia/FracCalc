import java.util.Scanner; 
 
public class Checkpoint1 {	 
	public static void main(String[] args) { 
		//Step 1: Declare all Variables 
		 
		 
		//First Numerator Variables 
		String numeratorOneString; 
		int numeratorOne; 
		int wholeNumberOne; 
		int denominatorOne; 
		boolean isOneMixed; 
		 
		//Fraction two values 
		String numeratorTwoString; 
		int wholeNumberTwo; 
		int numeratorTwo; 
		int denominatorTwo; 
		boolean isTwoMixed; 
		 
		int LCD; 
		 
		//inputs 
		String fracOne; 
		String operator; 
		String fracTwo; 
		boolean calcOn = true; 
		 
		//String solution; 
		 
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
				numeratorOneString = parseNumerator(fracOne); 
				denominatorOne = parseDenominator(fracOne); 
				numeratorTwoString = parseNumerator(fracTwo); 
				denominatorTwo = parseDenominator(fracTwo); 
				 
				 
				//Step 6: Check to see if the numerator is a mixed number 
				 
				//parse mixed number one 
				@SuppressWarnings("resource") 
				//Create scanner to parse mixed number string 
				Scanner parseMixedNumberOne = new Scanner(numeratorOneString).useDelimiter("_"); 
				//Set the first token to a cache variable 
				int mixedCache = parseMixedNumberOne.nextInt(); 
				wholeNumberOne = 0; 
				//Check to see if there is another token after the first 
				if(parseMixedNumberOne.hasNext()) { 
					//If there is set the whole number to the cache number 
					wholeNumberOne = mixedCache; 
					//And set the numerator as the next token 
					numeratorOne = parseMixedNumberOne.nextInt(); 
					isOneMixed = true; 
				} else { 
					//If there is no next token set the numerator to the cache variable 
					numeratorOne = mixedCache; 
					isOneMixed = false; 
				} 
				 
				//parse mixed number two 
				@SuppressWarnings("resource") 
				//Create scanner to parse mixed number string 
				Scanner parseMixedNumberTwo = new Scanner(numeratorTwoString).useDelimiter("_"); 
				mixedCache = parseMixedNumberTwo.nextInt(); 
				wholeNumberTwo = 0; 
				//Check to see if there is another token after the first 
				if(parseMixedNumberTwo.hasNext()) { 
					//If there is set the whole number to the cache number 
					wholeNumberTwo = mixedCache; 
					//And set the numerator as the next token 
					numeratorTwo = parseMixedNumberTwo.nextInt(); 
					isTwoMixed = true; 
				} else { 
					//If there is no next token set the numerator to the cache variable 
					numeratorTwo = mixedCache; 
					isTwoMixed = false; 
				} 
				 
				//Checkpoint One Stuff 
				System.out.println("Fraction One is " + fracOne); 
				System.out.println("Numerator 1 is: " + numeratorOne); 
				System.out.println("Denominator 1 is: " + denominatorOne); 
				System.out.println(); 
				System.out.println("Operator is: " + operator); 
				System.out.println(); 
				System.out.println("Fraction Two is: " + fracTwo); 
				System.out.println("Numerator 2 is: " + numeratorTwo); 
				System.out.println("Denominator 2 is: " + denominatorTwo); 
				System.out.println(); 
				 
				//make mixed number improper 
				//Step 7: If the input fraction is mixed make in improper 
				 
				if(isOneMixed == true) { 
					System.out.println("Mixed Number 1 is: " + wholeNumberOne); 
					numeratorOne = (denominatorOne*wholeNumberOne)+numeratorOne; 
				} 
				 
 
				 
				if(isTwoMixed == true) { 
					System.out.println("Mixed Number 2 is: " + wholeNumberTwo); 
					numeratorTwo = (denominatorTwo*wholeNumberTwo)+numeratorTwo; 
				} 
 
				 
				 
				//LCD(numeratorOne, denominatorOne, numeratorTwo, denominatorTwo); 
				 
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
	 
	public static String parseNumerator(String fraction){ 
		@SuppressWarnings("resource") 
		//Create scanner 
		Scanner parseScanner = new Scanner(fraction).useDelimiter("/"); 
		//Sets the whole numerator as a string (with mixed number if applicable) 
		String numerator = parseScanner.next(); 
		parseScanner.close(); 
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
		//Returns the denominator as an int 
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
		for(int i = 1000000000; i>=1; i--) { 
			 
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
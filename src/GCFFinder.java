
public class GCFFinder {
	public static int gcfFinder(int numOne, int numTwo) {
		while (numOne != numTwo) {
			if (numOne > numTwo) {
				numOne = numOne - numTwo;
			} else {
				numTwo = numTwo - numOne;
			}
		}
		return numOne;
	}

	public static void main(String[] args) {
		int GCF = gcfFinder(9,21);
		System.out.println(GCF);
	}

}

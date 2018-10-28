
public class GCFFinder {

	public GCFFinder() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int numerator = 5;
		int denominator = 10; 
		int GCF = 0;
		for(int i = 10000; i>=1; i--) {
			if(numerator % i != 0 && denominator % i != 0) {
				
			} else {
				GCF = i;
			}
		}
		System.out.println(GCF);

	}

}

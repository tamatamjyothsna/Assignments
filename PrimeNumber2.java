package assignments;

public class PrimeNumber2 {
	public static void main(String[] args) {

		int n=13;
		boolean isprime = true;
		
		for(int i=2;i<n;i++) {
			
			if(n%i==0) {
				isprime=false;
				break;
				
			}
		}
		
		if(isprime) {
			System.out.println("It is a prime number");
		}
		else {
			System.out.println("It is not a prime number");
		}


	}
}

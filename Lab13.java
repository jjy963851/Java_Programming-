package CSCI1010L;
import java.util.Scanner;
public class Lab13 {

	public static void main(String[] args) {
			
				
			
			String checker = "";
			Scanner jaeyong = new Scanner(System.in);
			System.out.println("put the valid input");
			checker = jaeyong.nextLine();
			
			
			for(int i = 0 , j = checker.length() -1 ;  i < j; i++ , j--) {
				
				if(checker.charAt(i) != checker.charAt(j)){
					
					System.out.println("this is not Palindrome");
					
					
					}
				else {
				System.out.println("this is Palindrome");
					break;
					}
				
				}
			
	
			
	//-----------------------------------------section 2
			int first = 0; int second = 0; int divisor = 1; int gcd = 1;
				Scanner user = new Scanner(System.in);
				System.out.println("put first number");
				Scanner user1 = new Scanner(System.in);
				System.out.println("put second number");
					if(user.hasNextInt()) {
						first = user.nextInt();
				
						}
					if(user1.hasNextInt()) {
						second = user1.nextInt();
						}
		
				while(true ) {
				
					if(divisor > first || divisor > second){
						break;
				
					}
					else if(first % divisor == 0 && second % divisor == 0) {
				
						gcd = divisor;
						
					}
						divisor++;
				
				}
				System.out.println("this is greatest divisor" + gcd);
			user.close();
	
		
		//----------------------------------------section3
			double oldTuition = 2000.00;
			double newTuition = oldTuition;
			int year = 0;
			double rateIncrease = 0.05;
			
			while(newTuition < oldTuition*2) {
				
				newTuition = newTuition*1.05;
					year++;
				}
				
				
				
			 System.out.println("the year going to be = " + year);
				
				
				
				
	
	}// main
				
}

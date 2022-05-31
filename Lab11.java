package CSCI1010L;
import java.util.Scanner;
public class Lab11 {

	public static void main(String[] args) {
		
			int series[] = {1, 3, 5, 7, 9, 11};
			int sum = 0;
			for(int i = 0; i < series.length; i++) {
				
				sum = sum + series[i];
				
			}
			System.out.printf("The sume of series: 1, 3, 5 , 7, 9 , 11: %d\n", sum);
			int Sum = 0;
			for(int i = 1; i <= 11; i+=2) {
				
				Sum = Sum + i;
			}
			System.out.printf("The sum of the series: 1, 3, 5, 7, 9, 11: %d\n", Sum);
			
			int array[] = {5, 10, 15, 20, 25, 30, 35};
			int total = 0;
			
			for(int i = 0; i < array.length; i++) {
				
				total = total + array[i];
			}
			System.out.printf("the sum of the array : 5, 10, 15, 20, 25, 30, 35 : %d\n ", total);
			
			int Total = 0;
			for(int i = 0; i <= 35; i+=5) {
				
				Total = Total + i;
			}
			System.out.printf("the sum of the array : 5, 10, 15, 20, 25, 30, 35 : %d\n ", Total);
			
			myStringOperation();
			
			
	}
			public static void myStringOperation() {
				
				String str = "CSCI1010L-Programming 1 in Java";
				System.out.println("the length of string = " +str.length());
				System.out.println(str.indexOf('P') + " this is the index of p\n");
				System.out.println("the place of - sign = " +str.indexOf('-'));
				System.out.println(str.indexOf("the place of space " +' '));
				Scanner scan = new Scanner(System.in);
				System.out.println("Type your full Name: ");
				String fullname = "";
				
				if(scan.hasNext()) {
					
					fullname = scan.nextLine();
				}
				int index = fullname.indexOf(' ');
				String firstname = fullname.substring(0,index);
				String lastname = fullname.substring(index + 1);
				System.out.printf("the first name is %s, your last name is %s\n" ,firstname,lastname);
				
				String swap;
				swap = firstname;
				firstname = lastname;
				lastname = swap;
				System.out.println("the after swap name " + firstname + lastname);
				
				
			}

}

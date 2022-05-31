package CSCI1010L;

public class Lab12 {

	public static void main(String[] args) {
		
		int sum = 0;
		for(int i = 63; i >=7; i -= 7  ) {
			
			System.out.println("the first answer is = " + i);
			sum = sum + i;
			
			
			}
			System.out.println("the sum of these series = " + sum);
			
		int Sum = 0;
		for(int i = 121; i >= 11;  i-= 11 ) {
			
			if(Sum <= 400) {
				
				Sum = Sum + i;	
				
			}
			else {
				break;
			}
			System.out.println("the second series are = " + i);
		}
		System.out.println(Sum);
			
			
			int sum1 = 0;
			int x = 121;
			
			while(x >= 11) {
				if(sum1 <= 400) {
					
					sum1 = sum1 + x;	
					
				}
				else {
					break;
				}
				x -= 11;
			}
			System.out.println("the while loop answer is = " +sum1);
			
			double sum2 = 0;
			for(int i = 1; i <=8; i++) {
				sum2 = sum2 + (Math.pow(i, 3));
				System.out.println(Math.pow(i, 3));
			}
			System.out.println("the total of the sum is = " +sum2);
			
			double sum3 = 0;
			for(int i = 1; i <=8; i++) {
				sum3 = sum3 + (Math.pow(i,i));
				System.out.println(Math.pow(i, i));
			}
			System.out.println("the total of the sum 2 is = "+ sum3);
			
			for(int i = 2; i <= 4; i++) {
				
				for(int j = 1; j <= 10; j += 1) {
					System.out.printf("%dx%d=%d", i,j,i*j);
					if(j<10) {
						System.out.print(", ");
					}
					else {
						System.out.println();
					}
				}
			}
			
			int facto = 1;
			for(int i = 10; i>=1; i--) {
				facto *= i;
				System.out.println(i);
				
			}
			int facto2 = 1;
			int sum4 = 0;
			
			for(int i = 2; i < 8; i++) {
				
				facto2 *= i;
				System.out.println("this is factorial 2 = " +i);
				sum = sum + facto2;
			}
			System.out.println(sum4);
			
		}
		
		

	}



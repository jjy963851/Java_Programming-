package CSCI1010L;
import java.lang.Math;
public class Lab09 {

	public static void main(String[] args) {
		//CSCI1010l Lab09
		/* this course will figure how to use switch statement and if statement */
		int x = 10;
		double y = 5.0;
		float z = 3.14f;
		double m = 1.1;
		double a = 4.2;
		double b = 3.1;
		double c = 5.1;
		
		String course = "CSCI1010L";
		
		//------------section d
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(course);
		System.out.printf("x = %d, y=%5.2f,z=5.2f,course= %s\n" ,x,y,z,course);
		int var1 = 100;
		int var2 = 125;
		int lowerValue;
		int eqnType = 3;
		
		lowerValue = (var1 < var2)?var1:var2;
		System.out.println(lowerValue);
		
		if(eqnType == 1) {
				y= m*x +c;
				System.out.println(y);
		}
		else if(eqnType ==2) {
			
				y = a*Math.pow(x,2)+b*x+c;
				System.out.println(y);
		}
		else if(eqnType ==3) {
				y = a*Math.log(x);
				System.out.println(y);
		}
		else {
				System.out.println("Unsupported Equation Type");
		}
		//------convert it to switch
		switch(eqnType) {
		case 1:
				y = m*x +c;
				System.out.println(y);
				break;
		
		case 2:
				y = a*Math.pow(x,2)+b*x+c;
				System.out.println(y);
				break;
		case 3:
				y= a*Math.log(x);
				System.out.println(y);
				break;
		default:
				System.out.println("Unsupported Equation Type");
				break;
				
			}
		//-----------------------------Section G
			double largerValue;
			largerValue = (a>b)?a:b;
			System.out.println(largerValue);
		//-------------------------------Section h
			final double Tolerance = 0.001;
			
			String msg = "";
			String msg1 = "absolute difference between x & y is less than the Tolerance";
			String msg2 = "Absolute difference between x & y is not less than the Tolerance";
			
			 msg = (Math.abs(x-y)<Tolerance)? msg1 : msg2;
			 System.out.println(msg);
			 
			//-----------------------------bonus
			 int larger;
			 int largest;
			 int i = 1; 
			 int k = 2;
			 int j = 3;
			 larger = (i>k)? i:k;
			 largest = (larger > j)? larger : j;
			 System.out.println("largest number is =" + largest);
			 
			 	
	}

}

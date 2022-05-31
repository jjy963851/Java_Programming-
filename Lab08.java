package CSCI1010L;
import java.util.Scanner;
import java.lang.Math;
public class Lab08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  eqnType = 0; //1 =linear 2=qudratic 3,logarithmic
		double m = 2.0;
		double a = 3.0;
		double b = 5.0;
		double c = 1.0;
		double x = 10.0;
		double y = 0;
		double z = 1.5;;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\nEquation Type : 1 for Linear Equation\n" + "Equation Type : 2 for Quadratic Equation\n" +"Equation Type :3 for Logarithmic Equations\n");
		System.out.println("Enter your prefer Equation Type");
	
		if(scanner.hasNextInt()) {
		
			eqnType = scanner.nextInt();
		}
		
		
		//eqnType =scanner.nextInt();
			
		if(eqnType == 1) {
			y = m*x+c;
			System.out.println(y);
		}
		else if(eqnType ==2) {
			
			y = a*x*x +b*x + c;	
			System.out.println(y);	
		}
		else if(eqnType ==3) {
			y = a*Math.log(x);	
		
		}
		else {
			
			System.out.println("UnSupported Equation Type!");
		}
		// Section D -----------------------------------------------
		double Value1 = y;
		double Value2 = x;
				
		
		System.out.printf("Value1 = %10.2f, Value2 = %10.2f\n", Value1, Value2);
		// Section E ------------------------------------------------
		double largerVal;
		
		if(Value1 > Value2) {
			largerVal = Value1;
			
		}else {
			largerVal = Value2;	
		}
		
		System.out.println("the larger value is " + largerVal);
		
		// Section F-------------------------------------------------------
		boolean p =!(x > y && a - b < m);
		System.out.println(p);
		
		scanner.close(); //all scanner have to close the end
	}
	
}


public class Lab3{
    public static void main (String[] args){
        
        
        System.out.println("Welcome to CSCI1010L - Lab03");
        
        Calculator cal = new Calculator();
        
        System.out.println("100 + 150 :" + cal.add(100,150));
        System.out.println("1000 - 40 :" + cal.subtract(1000,40));
        System.out.println("100*20 :" + cal.multiply(100,20));
        System.out.println("150.00/3.00 :"+cal.divide(150.00,3.00));
        
        
        
        
        
        
    }
   
}
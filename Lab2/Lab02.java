
public class Lab02{
    public static void main(String[] args){
        System.out.println(" Welcome to CSCI1010L-Lab2");
        Cal choo = new Cal();
        choo.miu(20,30);
        
        display();
        Calculator calc = new Calculator();
    
       calc.add(100,150);
       calc.add(-50,200);
       calc.add(0,100);
       calc.subtract(1000,900);
       calc.subtract(1000,9000);
       calc.subtract(0,50);
    } 
    public static void display(){
        
       System.out.println("39 + 3");
       System.out.println(39 + 3);
       
        
        
    }
}


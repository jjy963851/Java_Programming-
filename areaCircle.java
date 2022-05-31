public class areaCircle
{private double pi;
 private int rad;
 
 public areaCircle()//this is default constructor
 {
    pi =0;
    rad =0;
 }
 public areaCircle(int a)//set the value of radious
 {
      rad = a;   
  }
 public void pi()
 {
     pi = 3.1459;
    }
  public double calculateArea()
 {
     return pi*rad*rad; 
 }
 }
    
    
    
    
    

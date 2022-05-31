/**
 * This is sub class
 * I have three instance variable rad, height, and pi
 * @author JaeYong Chang
 * @version 2019.03.06
 */

public class CalculateCylinder
{int rad;
 int height;
 double pi = 3.1459;
 /**
  * this is default constructor
  * set all the value as 0
  */
 public CalculateCylinder()
 {
     rad = 0;
     height = 0;
     pi = 0;
  }
  /**
   * this is parameterize method
   * @param
   */
 public CalculateCylinder(int a, int b)
 {
     
     rad = a;
     height = b;
     
 }
 /**
  * @return 
  * this is going to show the Volume of Cylinder
  */
 public double calculateVolume()
 {
    return pi*rad*rad*height; 
     
  }
 /**
  * @return
  * this is showing the fomula of Surface area of cylinder
  * have to use double for pi
  */
 
 public double calculateSurfaceArea()
 {
     return (2*pi*rad*height) + (2*pi*rad*rad);
  }
    
    
    
    
    
    
    
    
}
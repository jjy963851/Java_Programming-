/**
 * @author JaeYong Chang
 * @version 2019.03.18
 * this is template class
 * 
 */

public class CalculateArea2
{ 
  private int radius;//set it as a private. so that they cannot change
  private double height;
  private double pi = 3.1459;//this is constance value
  
 /**
  * this is parameterized method
  * this value going to set by user by scanner
  * @param
  */
 public CalculateArea2(int a)
  {
      
       radius = a;
  
   }
  /**
   *  this is mutator method for height
   *  @param
   *  set the value of height and I can change the value of height
   */  
  public void SetHeight(int b)
  {
      
      this.height = b;
      
   }
  /**
   * this is accessor method. I can call height value
   * @return
   */ 
  public double CallHeight()
   {
       return this.height;
       
    }
   

  /**
   * @return
   * this is fomula of getting cricle value
   */
  public double Circle()
  {
      return this.pi*radius*radius;
      
  }
  /**
   * @return
   * this is fomula of getting Sphere value
   */  
  public double Sphere()  
  {
      
      return 4*this.pi*radius*radius;
   }
  /**
   * @return
   * this is fomula of getting Cylinder value
   */ 
   public double Cylinder()
   {
       
      return (2*this.pi*radius*radius) + (2*this.pi*radius*this.height);
       
       
    }
    
}
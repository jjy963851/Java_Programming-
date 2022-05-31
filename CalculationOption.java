

public class CalculationOption
{
    private int total;
     int x;
     int y;
     
    public  void doSum(int x, int y)
    {
        total = x + y;
        
        
    }
    
    public void doProduct(int x)
    {
       total = x*y;
    }   

    public int getTotal()
    {
        return total;
    }    
}
import java.util.ArrayList;
public class araylist
{public static void main(String[]args)
    { ArrayList<Integer > MyArrayList = new ArrayList< Integer>();
        int []numbers = {1,2,3,4,5};
      for(int value: numbers)
      {
          
          MyArrayList.add(value);
          
        }
      MyArrayList.remove(2); 
      MyArrayList.add(200);
      MyArrayList.add(2,700);
      MyArrayList.add(0,"JaeYong");
      
      
      System.out.println(MyArrayList);
      
      
      
        
        
        
        
        
        
        
        
        
    }
}
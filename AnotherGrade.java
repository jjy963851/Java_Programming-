import java.util.Scanner;
/**
 * Write a description of class AnotherGrade here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AnotherGrade
{public static void main(String[]args)
 { Scanner jy = new Scanner(System.in);
     System.out.println("What is your Grade? ");//ak user the grade
     String Grade = jy.next();
     
    template sc = new template(Grade);
    
    System.out.println(sc.GetTheGrade());
    
    
        
        
        
        
        
 }
}
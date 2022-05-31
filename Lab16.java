package CSCI1010L;
import java.util.Arrays;
import java.util.Scanner;
public class Lab16 {

	public static void main(String[] args) {
		
		Student[] studentArray1 = new Student[5];
		Scanner jaeyong = new Scanner(System.in);
		
		for(int i = 0; i < studentArray1.length; i++) {
			
				
			int id = (int)(Math.random()*100);
			String name = " ";
			System.out.println("Enter:" +studentArray1.length + "Value");
			if(jaeyong.hasNext()) {
				
				name = jaeyong.next();
			}
			
			float cgpa;
			cgpa = (float) (Math.random()*4);
			
			Student student = new Student(id, name, cgpa);
			studentArray1[i] = student;
			
			}
		for(Student value: studentArray1 ) {
			System.out.println(value);
		}
		//System.out.println("this is sorted array2");
		Student studentArray2[] = Arrays.copyOf(studentArray1,studentArray1.length);
		//Arrays.sort(studentArray2);
		//for (Student value1 : studentArray2) {
			//System.out.println(value1);
		System.out.println(Arrays.equals(studentArray1, studentArray2));
		}
		
		
		
		
}






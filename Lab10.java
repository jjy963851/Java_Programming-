package CSCI1010L;
import java.util.ArrayList;
import java.util.Scanner;
public class Lab10 {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		ArrayList<Student>students = new ArrayList<Student>();
		final int TOTAL_STUDENTS = 5;
		String name;
		int id;
		double gpa;
		
		Scanner scanner = new Scanner(System.in);
		
		for (int index = 0; index < TOTAL_STUDENTS; index ++) {
				
			Student student = new Student();
			
			System.out.println("Enter the student name");
			if(scanner.hasNext()) {
				
				name = scanner.next();
				student.setName(name);
			}
			System.out.println("Enter the student ID");
			if(scanner.hasNextInt()) {
				id = scanner.nextInt();
				student.setidNumber(id);
			}
			System.out.println("Enter the student GPA");
			if(scanner.hasNextDouble()) {
				gpa = scanner.nextDouble();
				student.setCGPA(gpa);
				
			}
				students.add(student);
				
			}// end of for loop
				
			Lab10 JaeYong = new Lab10();
			JaeYong.displayStudentinfo(students);
			scanner.close();
		}//end of main 
			
		public void displayStudentinfo(ArrayList<Student>students) {
			for(int i = 0; i < students.size(); i++) {
				
			Student student = students.get(i);
			System.out.printf("the Student nae is %-5s,  ",student.getName());
			System.out.printf("the Student nae is %-5d,  ",student.getidNumber());
			System.out.printf("the Student nae is %-5.2f\n,  ",student.getcGPA());
		
			}
	}

}

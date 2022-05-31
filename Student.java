package CSCI1010L;

public class Student {
	
	
	private String name;
	private int id;
	private float cgpa;
	
	public  Student() {
		
	}
	
	public Student(int id, String name, float cgpa) {
		
		
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
		
	}
	public String getName() {
		return name;
	}
	public float getCgpa() {
		
		return cgpa;
	}
	public void setId(int id) {
		this.id = id;
		
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}
	
	public String toString() {
		String retvalue = "ID: "+ this.id +" , "+"Name: "+this.name+ ","+ "CGPA:" + this.cgpa+ "/n";
		return retvalue;
	}
	
	
	
	
	
	
	
	
}

package CSCI1010L;

public class Lab15 {
	
	int temp;
	private int[] iArray; 
	
	private String[] strArray; 
	
	public Lab15() {
		
		
	}
	public Lab15(int iArray[], String strArray[]) {
		
		this.iArray = iArray;
		this.strArray = strArray;
		
	}
	
	public int[] getiArray() {
		return iArray;
		
	}
	public String[] getstrArray() {
		return strArray;
	}
	
	public void setiArray(int iArray[]) {
		this.iArray = iArray;
		
	}
	public void setstrArray(String strArray[]) {
		
		this.strArray = strArray;
	}
	public void reverselnt(int array[]) {
		for(int i = 0, j=array.length-1-i; i<j; i++, j--) {
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
		
	}
	public int findMinimum(int array[]) {
		int minimum = array[0];
		for(int i = 0; i<array.length; i++) {
			if(array[i]< minimum) {
				minimum = array[i];
			}
		}
		return minimum;
		
	}
	public boolean find(int array[], int val) {
		boolean found = false;
		for(int i = 0; i<array.length-1; i++) {
			if(array[i] == val) {
				
				found = true;
			}
			else {
				found = false;
				
			}
			
			
			}
			return found;
		
		
	}
	public void reverseStr(String array[]) {
		String temp;
		for(int i = 0, j = array.length-1; i<j; i++ , j--) {
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
		
	}
	public boolean findStr(String array[], String str) {
		boolean found = false;
			for(int i = 0; !found && i<array.length-1; i++) {
				if(array[i].equals(str)) {
				found = true;
				}
				else{
				found = false;
				
			}
		}
			return found;
		
	}
}

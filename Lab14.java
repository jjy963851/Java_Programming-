package CSCI1010L;

public class Lab14 {

	private int iArray[] = {10, 20 , 12, 1, 7};
	private double fArray[] = {1.1, 2.2, 3.3 ,4.4 ,5.5, 6.6};
	
	public Lab14() {
		
	
	}
	public Lab14(int iArray[], double fArray[]) {
		
		this.iArray = iArray;
		this.fArray = fArray;
		
	}
	public int[] getiArray() {
		return iArray;
	}
	public double []getfArray(){
		return fArray;
	}
	
	public void setiArray(int[] iArray) {
		this.iArray = iArray;
	}
	public void getiArray(double[] fArray) {
		
		this.fArray = fArray;
	}
	
	}


//getter method is return
	//setter take modifer
package CSCI1010L;
/**
 * this class will be setter and getter 
 * Users will use these operands at main class
 * @author jaeyongchang
 * @version 1.0
 * 
 *
 */
public class Automobile implements Comparable<Automobile>{
	private String Maker;
	private String model;
	private int year;
	private String color;
	private int vin;
/**
 * first operand is Maker
 * second operand is model
 * third operand is year
 * fourth operand is color
 * fifth operand is vin
 * this is parameteraized constructor
 */


public Automobile() {
	
}
/**
 * this is default constructor 
 * @param Maker
 * @param model
 * @param year
 * @param color
 * @param vin
 */
public Automobile(String Maker, String model, int year, String color, int vin) {
	this.Maker =  Maker;
	this.model = model;
	this.year = year;
	this.color = color;
	this.vin = vin;
}
public String getMaker() {
	return Maker;
}
/**
 * this is getter method of Maker
 * @return will be maker
 */
public String getmodel() {
	return model;
}
/**
 * this is getter method of model
 * @return will be model
 */
public int getYear() {
	return year;
}
/** 
 * this is getter method of year
 * @return will be year
 */
public String getColor() {
	return color;
}
/**
 * this is getter method of color
 * @return will be color
 */
public int getVin() {
	return vin;
}
/**
 * this is getter method of vin
 * @return this will return vin 
 */
public void setMaker(String paramMaker) {
	this.Maker = paramMaker;
	
}
/**
 * this is setter method of model
 * it will take user's input
 * @param paramModel
 */
public void setModel(String paramModel) {
	this.model = paramModel;
}
/**
 * this is setter method of year
 * will tke user's input
 * @param paramYear
 */
public void setYear(int paramYear) {
	this.year = paramYear;
}
/**
 * this is setter method of color
 * this will take user's input
 * @param paramColor
 */
public void setColor(String paramColor) {
	this.color = paramColor;
}
/**
 * this is setter method of vin
 * this will take user's input
 * @param paramVin
 */
public void setVin(int paramVin) {
	this.vin = paramVin;
}
/**
 * this is getter method. 
 * this will printout all the operands in main class
 */
public String toString() {
	String retValue = "Maker = "+this.Maker +"," + "Model = " + this.model+ "," + "Year =" + this.year + "," + "Color +" + this.color + ","+ "Vin" + this.vin;
	return retValue;
}
public int compareTo( Automobile o) {
	int result;
	if(this.getYear()>o.getYear())
	result = 1;
	else if(this. getYear () == o. getYear ())
	result = 0;
	else
	result = -1;
	return result;
}




}

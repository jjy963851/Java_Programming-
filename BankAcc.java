


public class BankAcc implements Comparable<BankAcc>{
	private static String bankName;
	private static int rountingNum;
	private String accHolderName;
	private int accNum;
	private double balance;
	
public BankAcc() {
	
}
public static String getBankName() {
	
	return bankName;
}

public static void setBankName(String paramBankName) {
	bankName = paramBankName;
	
}
public static int getRoutingNum() {
	return rountingNum;
}
public static void setRoutingNum(int paramRoutingNum) {
	rountingNum = paramRoutingNum;
}
public BankAcc(int accNum, String accHolderName, double balance) {
	this.accNum = accNum;
	this.accHolderName = accHolderName;
	this.balance = balance;
	
}

public int getAccNum() {
	return accNum;
}
public String getAccHolderName() {
	return accHolderName;
}
public double getBalance() {
	return balance;
}
public void setAccNum(int accNum) {
	this.accNum = accNum;
}
public void setAccHolderName(String accHolderName) {
	this.accHolderName = accHolderName;
}
public void setBalance(double balance) {
	this.balance = balance;
}

public String toString() {
	String retValue = "BankName" + bankName + " , " + "RoutingNumber"+ rountingNum +" , "+"AccountNumber"+this.accNum +","+"AccountHolderName"+this.accHolderName+","+"Balance"+this.balance+"/n";
	return retValue;
}
	

public int compareTo(BankAcc o) {
	int result;
	if(this.getBalance()>o.getBalance())
		result = 1;
	else if(this.getBalance ()== o.getBalance())
		result = 0;
	else
		result = -1;
	return result;
	
}


}


		

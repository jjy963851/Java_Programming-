package CSCI1010L;

public class Payment {
public Payment(){
        
        
        
    }
    public void processCard(String cardInfo, double amount){
        
        System.out.printf("Process card: %s for the amount %8.2f\n", cardInfo, amount);
        
    }
    public void processChecking(String checkInfo, double amount){
        
        System.out.printf("process check: %s for the amount %8.2f\n", checkInfo, amount);
        
    }
    public void processCash(double amount){
        System.out.printf("rocess cash sale for the amount %8.2f\n", amount);
    }
    public void Voucher(String voucherinfo, double amount){
        
        System.out.printf("Process voucher: %s for the amount %8.2f\n", voucherinfo, amount); 
    }

}

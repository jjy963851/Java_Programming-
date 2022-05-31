import java.util.*;
import java.util.Scanner;
public class lab7{
    
    public static void main(String[] args){
        
        Payment payment = new Payment();
        
        
        int paymentType =1; // 1 check , 2 Mastercard , 3Visa card, 4 cash ,5 voucher
        double amount= 0.0;
        String info;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the payment amount: ");
        if(scanner.hasNextDouble()){
            amount = scanner.nextDouble();
        }  
        System.out.println("\nEnter payment type :1 for check\n" +"Enter payment type:  2 for Master Card\n" + "Enter payment type:  3 for Visa Card\n" + "Enter payment type:  4 for Cash\n" + "Enter payment type:  5 for Voucher\n");
                            
                            
                            
        if(scanner.hasNext()){
            paymentType = scanner.nextInt();
        
        }
        
        if(paymentType ==1){
            
            payment.processChecking("info: check#12345, rounting#123456",0.0);
            
        }
        else if((paymentType ==2) || (paymentType == 3)){
            payment.processCard("info :masterCard#1414",0.0);
        }
        else if(paymentType ==4){
            payment.processCash(600.0);
        }
        else if(paymentType ==5){
            payment.Voucher("infro : voucher#1245",700.0);
        }
        else {
            System.out.println("Payment type not supported");
            
        }
    }
}
package CSCI1010L;

import java.util.*;
import java.util.Scanner;
public class Lab07{
    
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
            info = " check#12345, rounting#123456";
            payment.processChecking(info,amount);
            
        }
        else if((paymentType ==2) || (paymentType == 3)){
        	info = " masterCard#1414";
            payment.processCard(info,amount);
        }
        else if(paymentType ==4){
        	info = "voucher#12345";
            payment.processCash(amount);
        }
        else if(paymentType ==5){
        	info = "voucher#12345";
            payment.Voucher(info,amount);
        }
        else {
            System.out.println("Payment type not supported");
            
        }
    }
}
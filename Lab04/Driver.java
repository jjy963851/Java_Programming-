
public class Driver{
    
    public static void main(String[] args){
        
        BankAccount ac1 = new BankAccount(100100, "miu",200);
        
        BankAccount ac2 = new BankAccount(100200, "Jaeyong",100);
        
        ac1.viewBalance();
        
        ac2.viewBalance();
        
        
        ac1.deposit(1000);
        System.out.printf("now miu's balance is =");
        ac1.viewBalance();
        ac2.deposit(1000);
        System.out.printf("now Jaeyong's balance is =");
        ac2.viewBalance();
        
       ac1.withdraw(500);
        System.out.printf("now Jaeyong's balance is =");
        ac1.viewBalance();
        
        ac2.withdraw(500);
        System.out.printf("now miu's balance is =");
        ac2.viewBalance();
        
        ac1.transfer(300,ac2);
        System.out.printf("after the transfer, miu and Jaeyong' balance =");
        ac1.viewBalance();
        ac2.viewBalance();
        
        
        
        
        
        
        
    }
}
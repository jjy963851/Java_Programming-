
public class BankAccount{
    private  int accountNumber;
    private  String name;
    private double principal;
    
    public BankAccount() {
        
        
    }
    public BankAccount(int acNumParam, String nameParam,double pParam){
       this.accountNumber = acNumParam;
       this.name = nameParam;
       this.principal = pParam;
        
        
    }
    public  double deposit(double addedFund){
        this.principal = this.principal + addedFund;
        
        return this.principal;
        
          
    }
    public  double withdraw(double withdrawnFund){
        
        this.principal = this.principal - withdrawnFund;
        return this.principal;
    }
    public void transfer(double transferFund, BankAccount toAccount){
        this.withdraw(transferFund);
        toAccount.deposit(transferFund);
        
        
        
        
    }
    public void viewBalance(){
        
        System.out.println(this.principal);
    }
    }
    
    
    
        
    
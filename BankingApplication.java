import java.util.Date;


public class BankingApplication {
    private String  accounType; //{"currentAccount","savingAccount","salaryacount"};
    private String name;
    private int accountNumber;
    private Date creationDate ;
    private double balance;

    public void createAccount(String at,String name,int an,Date ct,double balance){
          this.accounType=at;
          this.name=name;
          this.accountNumber=an;
          this.creationDate=ct;
        if(balance!=0){
          this.balance=balance;
        }

     System.out.println("Your account created successfully Please se the datails of your account : AccountType:"+this.accounType+ "Name : "+ this.name + "AccountNumber : "+ this.accountNumber+"CreationDate : "+this.creationDate+"Balance :"+this.balance);

    }
    public void displayAllAccounts(){
        System.out.println(accounType);
        System.out.println(name);
        System.out.println(accountNumber);
        System.out.println(creationDate);
        System.out.println(balance);
    }
    public void updateAnAccount(double blce){
        if(balance!=0){
            balance+=blce;
        }
        System.out.println("Account updated successfully");
    }
    public void deleteAccount(){
        
        System.out.println("Account deleted successfully");
    }
    public void depositMoney(double am){
        if(am!=0){
        this.balance+=am;
        }
        System.out.println("Account deposited successfully your new balance is :"+ balance);
    }
    public void withdraMoney(double amo){
     if((this.balance-amo)>500){
          this.balance-=amo;
          System.out.println("Withdraw "+balance +" BDT Money Successfully");
     }
     else{
        System.out.println("Cannot Withdraw money Inssuffecient balance");
     }
    }
  public boolean search(int ac_no){
    // System.out.println("Account found");
    if(accountNumber==ac_no){
      return true;
    }
    return false;

  }
  public void exit(){
    System.out.println("Exiting the bank application See you again");
  }
    
}
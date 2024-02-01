import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

//import javax.xml.crypto.Data;

public class dataintoBank extends BankingApplication{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList <BankingApplication> list= new ArrayList<>();
        BankingApplication b0=new BankingApplication();
        Date ct=new Date();
        b0.createAccount("savingAccount", "silma subah", 4567, ct, 300.00);
        list.add(b0);
        System.out.println("Welcome to our Bank what would you like to do there are several choices for you what would yoy like to do");
        System.out.println("1.Create a new account");
        System.out.println("2.Display allAcccounts");
        System.out.println("3.Update an Account");
        System.out.println("4.Delete an Account");
        System.out.println("5.Deposit an amount into your account");
        System.out.println("6.Withdraw an amount from your account");
        System.out.println("7.Search for an account");
        System.out.println("8.Exit");
        System.out.println("Enter a choice");
        int choice=0; boolean found =false;
        while (choice!=8) {
            choice=sc.nextInt();
            switch (choice) {
              case 1:
                  System.out.println("Creating bank account for you");
                  System.out.println("Enter your Accounttype : 1.Currentaccount 2.SavingAccount 3.SalaryAccount");
                  String accounttype=sc.next();
                  System.out.println("Enter your name");
                  String name=sc.nextLine();
                  System.out.println("Enter your accountNumber");
                  int number=sc.nextInt();
                  Date creationdate=new Date();
                  System.out.println("Enter your amount");
                  double balance=sc.nextDouble();
                  BankingApplication b1=new BankingApplication();
                  b1.createAccount(accounttype, name, number,creationdate, balance);
                  list.add(b1);
                  break;
              case 2:
                  System.out.println("Display All accounts");
                  System.out.println("Enter accountno");
                  int ac_no=sc.nextInt();
                  for(int numb=0;numb<list.size();numb++){
                     if(list.get(numb).search(ac_no)){
                        found=true;
                         list.get(numb).displayAllAccounts();
                     }
                  }
                  if(!found){
                    System.out.println("Please enter valid Accountnumber");
                  }
                  break;
             case 3:
                  System.out.println("Update an account");
                  System.out.println("Enter accountno");
                   ac_no=sc.nextInt();
                  for(int numb=0;numb<list.size();numb++){
                     if(list.get(numb).search(ac_no)){
                        found=true;
                         double newamount=sc.nextDouble();
                         list.get(numb).updateAnAccount(newamount);
                     }
                  }
                  if(!found){
                    System.out.println("Please enter valid Accountnumber");
                  }
                  break;
            case 4:
                System.out.println("Delete an account");
                System.out.println("Enter accountno");
                ac_no=sc.nextInt();
                for(int numb=0;numb<list.size();numb++){
                    if(list.get(numb).search(ac_no)){
                        found=true;
                        list.remove(numb);
                        list.get(numb).deleteAccount();
                    }
                }
                    if(!found){
                    System.out.println("Please enter valid Accountnumber");
                    }
                break;
            case 5:
                System.out.println("Deposit an amount");
                System.out.println("Enter accountno");
                ac_no=sc.nextInt();
                for(int numb=0;numb<list.size();numb++){
                    if(list.get(numb).search(ac_no)){
                        found=true;
                        double depositedamount=sc.nextDouble();
                        list.get(numb).depositMoney(depositedamount);;
                    }
                }
                    if(!found){
                    System.out.println("Please enter valid Accountnumber");
                    }
                break;
            case 6:
                System.out.println("Withdraw an amount");
                System.out.println("Enter accountno");
                ac_no=sc.nextInt();
                for(int numb=0;numb<list.size();numb++){
                    if(list.get(numb).search(ac_no)){
                        found=true;
                        double withdrawdamount=sc.nextDouble();
                        list.get(numb).withdraMoney(withdrawdamount);
                    }
                }
                    if(!found){
                    System.out.println("Please enter valid Accountnumber");
                    }
                break;
            case 7:
                System.out.println("Search an account");
                System.out.println("Enter accountno");
                ac_no=sc.nextInt();
                for(int numb=0;numb<list.size();numb++){
                    if(list.get(numb).search(ac_no)){
                        found=true;
                        System.out.println("Account found");
                    }
               }
               
               if(!found){
                System.out.println("Please enter valid Accountnumber");
                }
              break;
            case 8:
               BankingApplication b2=new BankingApplication();
               b2.exit();
               break;
            default:
                 System.out.println("PLease enter a valid choice");
                 break;
            }
        }
    }
}

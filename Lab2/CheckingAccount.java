import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * Write a description of class CheckingAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CheckingAccount extends BankAccount
{
    double fee;
    
    Scanner in = new Scanner(System.in);
    Scanner inn = new Scanner(System.in);
    BankAccount tmp = new BankAccount();
    public CheckingAccount(){
        fee = 1.00;
    }
    
    public void CheckAccount(){
        System.out.print("Enter Username: ");
        String name = in.nextLine();
        System.out.print("Deposit: ");
        double amount = inn.nextDouble();
        
        
        System.out.println("-------------------------------------");
        System.out.println("Account Created");
        System.out.println("-------------------------------------");
        
        tmp.BankAccount(name, amount);
        
    }
    
    public void Withdraw(){
        System.out.print("Enter The Amount to Withdraw:");
        double amount = in.nextDouble();
        System.out.println("-------------------------------------");
        
        if(amount >= 300){
            tmp.Withdraw(0);
            System.out.println("Sorry The Amount of 300$ Withdraw is Limited");
            System.out.println("-------------------------------------");
        }else{
            tmp.Withdraw(amount);
            System.out.println("Successfully Withdraw");
            System.out.println("-------------------------------------");
            if(amount >= 50){
                tmp.Withdraw(fee);
                System.out.println("Total Withdraw: "+ amount);
                System.out.println("Total Fee: "+ fee);
                System.out.println("-------------------------------------");
            }else{
                System.out.println("Total Withdraw: "+ amount);
                System.out.println("Total Fee: 0.00");
                System.out.println("-------------------------------------");
            }
        }
        
        
    }
    
    public void Deposit(){
        System.out.print("Enter The Amount to Deposit:");
        double amount = in.nextDouble();
        tmp.Deposit(amount);
        System.out.println("-------------------------------------");
        System.out.println("Successfully Deposit");
        System.out.println("-------------------------------------");
    }
    
    
    public void Display(){
            System.out.println("-------------------------------------");
            System.out.println("Display");
            System.out.println("-------------------------------------");
            System.out.println("Username     : "+ tmp.getOwner());
            System.out.println("Balance      : "+ tmp.getBalance());
            System.out.println("AccountNumber: "+ tmp.getNumber());
            System.out.println("-------------------------------------");
    }
    
    public void Switch(){
        System.out.println("Input Number 2 to Open SavingAccount");
        System.out.print(": ");
        int accNumber = in.nextInt();
         System.out.println("-------------------------------------");
         
        tmp.Switch(accNumber);
    }
    
    public void SavingAccount(){
        double rate = 1.1;
        if(tmp.getNumber() == 2){
            tmp.Rate(rate);
            System.out.println("Notification: Monthly Interest Added");
            System.out.println("-------------------------------------");
        }else if(tmp.getNumber() == 1){
            System.out.println("Sorry Your Account Not Saving Account Type");
             System.out.println("-------------------------------------");
        }
    }
}

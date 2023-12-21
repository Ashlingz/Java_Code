
/**
 * Write a description of class SavingAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.Scanner;

public class SavingAccount extends BankAccount
{
    double rate;
    int savingNumber;
    String accNumber;
    
    Scanner in = new Scanner(System.in);
    BankAccount tmp = new BankAccount();
    
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
    Date date = new Date(); 
    public SavingAccount(){
        rate = 1.1;
    }
    public void SavingAccount(){
        if(tmp.getNumber() == 2){
            tmp.Rate(rate);
            System.out.println("Notification: Monthly Interest Added");
            System.out.println("-------------------------------------");
        }else if(tmp.getNumber() == 1){
            System.out.println("Sorry Your Account Not Saving Account Type");
             System.out.println("-------------------------------------");
        }
    }
    
    public void Switch(){
        System.out.println("Input Number 2 to Open SavingAccount");
        System.out.print(": ");
        int accNumber = in.nextInt();
         System.out.println("-------------------------------------");
         
        tmp.Switch(accNumber);
    }
}

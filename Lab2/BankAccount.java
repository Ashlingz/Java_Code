import java.util.Scanner;
import java.util.ArrayList;

/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
    double balance;
    int number;
    String owner;
    
    Scanner in = new Scanner(System.in);
    Scanner inn = new Scanner(System.in);
    public BankAccount(){
        balance = 0.00;
        owner = "";
        number = 1;
    }
    
    public void BankAccount(String name, double amount){     
        owner = name;
        balance += amount;
    }
    
    public void Switch(int accNumber){
        number = accNumber;
    }
    
    public void Deposit(double amount){
        balance += amount;
    }
    
    public void Withdraw(double amount){
        balance -= amount;
    }
    
    public void Rate(double rate){
        balance += rate;
    }
    
    public double getBalance(){
        return balance;
    }
    public int getNumber(){
        return number;
    }
    public String getOwner(){
        return owner;
    }
    
    
}

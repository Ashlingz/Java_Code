import java.util.Scanner;

/**
 * Write a description of class BankSystem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankSystem
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String cmd;
        CheckingAccount c = new CheckingAccount();
        SavingAccount s = new SavingAccount();
        
        System.out.println("1 to Create Account");
        System.out.println("2 to Display");
        System.out.println("3 to Withdraw");
        System.out.println("4 to Deposit");
        System.out.println("6 to Check Notification");
        System.out.println("7 to Switch Account");
        
        do{
            System.out.print("Enter: ");
            cmd = in.nextLine();
            switch(cmd){
                case "1":
                    c.CheckAccount();
                    break;
                case "2":
                    c.Display();
                    break;
                case "4":
                    c.Deposit();
                    break;
                case "3":
                    c.Withdraw();
                    break;
                case "6":
                    c.SavingAccount();
                    break;
                case "7":
                    c.Switch();
                    break;
            }
        }while(!cmd.equals("0"));
    }
}

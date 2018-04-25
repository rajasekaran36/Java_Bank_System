import java.util.ArrayList;
import java.util.Scanner;

public class Bank {

    ArrayList<BankCustomer> allCustomers;

    private boolean debitTransaction(BankCustomer aCustomer, int amount){
    int currentBalance = aCustomer.account_balance;
    if(currentBalance>=amount){
        currentBalance = currentBalance - amount;
        aCustomer.account_balance = currentBalance;
        return true;
        }
        return false;
    }

    private boolean creditTransaction(BankCustomer aCustomer, int amount){

        if(amount>=0){
            aCustomer.account_balance = aCustomer.account_balance + amount;
            return true;
        }
        return false;
    }

    private void displayCustomer(BankCustomer aCustomer){
        System.out.println("Customer Account Number: "+aCustomer.account_number);
        System.out.println("Customer Name: "+aCustomer.customerName);
        System.out.println("Current Balance of this Customer: "+aCustomer.account_balance);
    }

    private BankCustomer createCustomer(){
        Scanner input = new Scanner(System.in);
        BankCustomer aCustomer = new BankCustomer();
        System.out.println("Enter Customer Name: ");
        aCustomer.customerName = input.next();
        aCustomer.account_balance = 0;
        return aCustomer;
    }

    private boolean deleteCustomer(int account_number){

        return false;
    }
}

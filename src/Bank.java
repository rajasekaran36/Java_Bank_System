public class Bank {
BankCustomer allCustomers;

private void displayCustomer(BankCustomer aCustomer){
    System.out.println("Customer Account Number: "+aCustomer.account_number);
    System.out.println("Customer Name: "+aCustomer.customerName);
    System.out.println("Current Balance of this Customer: "+aCustomer.account_balance);
}
}

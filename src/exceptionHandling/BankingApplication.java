package exceptionHandling;
//Custom exception class for insufficient balance
class InsufficientBalanceException extends Exception {
 public InsufficientBalanceException(String message) {
     super(message);
 }
}

//BankAccount class to manage deposits and withdrawals
class BankAccount {
 private String accountNumber;
 private double balance;

 public BankAccount(String accountNumber, double initialBalance) {
     this.accountNumber = accountNumber;
     this.balance = initialBalance;
 }

 // Method to deposit money
 public void deposit(double amount) {
     if (amount <= 0) {
         System.out.println("Deposit amount must be positive.");
         return;
     }
     balance += amount;
     System.out.println("Successfully deposited: " + amount);
     System.out.println("Current balance: " + balance);
 }

 // Method to withdraw money
 public void withdraw(double amount) throws InsufficientBalanceException {
     if (amount > balance) {
         throw new InsufficientBalanceException("Insufficient balance! Attempted to withdraw: " + amount);
     }
     balance -= amount;
     System.out.println("Successfully withdrawn: " + amount);
     System.out.println("Current balance: " + balance);
 }

 // Method to display account details
 public void displayDetails() {
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Balance: " + balance);
 }
}

//Main class
public class BankingApplication {
 public static void main(String[] args) {
     // Create a bank account
     BankAccount account = new BankAccount("123456789", 1000.0);

     // Display initial details
     account.displayDetails();

     try {
         // Deposit money
         account.deposit(500);

         // Attempt to withdraw money
         System.out.println("\nAttempting to withdraw 2000...");
         account.withdraw(2000); // This will throw an exception

     } catch (InsufficientBalanceException e) {
         // Handle insufficient balance exception
         System.err.println("Error: " + e.getMessage());
     } finally {
         // Always executed
         System.out.println("Transaction process completed.");
     }

     // Display final account details
     System.out.println("\nFinal Account Details:");
     account.displayDetails();
 }
}

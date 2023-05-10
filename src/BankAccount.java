import java.util.Scanner;

public class BankAccount {
    double balance;
    double previousTransaction;
    String customerName;
    String customerID;

    BankAccount(String customerName, String customerID) {
        this.customerName = customerName;
        this.customerID = customerID;
    }

    void deposit (double amount) {
        if (amount != 0) {
            balance += amount;
            previousTransaction = amount;
        }
    }

    void withdraw(double amount) {
        if (amount != 0 && balance >= amount) {
            balance -= amount;
        }
        else if (balance < amount) {
            System.out.println("Bank balance insufficient");
        }
    }

    void getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Deposited: " + previousTransaction);
        }
        else if (previousTransaction < 0) {
            System.out.println("Withdrawn " + Math.abs(previousTransaction));
        }
        else {
            System.out.println("No transaction occurred");
        }
    }
    void menu() {
        char option;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome " + customerName);
        System.out.println("Your ID: " + customerID);
        System.out.println("\n");
        System.out.println("a) Check Balance");
        System.out.println("b) Deposit Amount");
        System.out.println("c) Withdraw Amount");
        System.out.println("d) Previous Transaction");
        System.out.println("e) Exit");

        do {
            System.out.println("********************************************");
            System.out.println("Choose an option");
            option = scan.next().charAt(0);
            System.out.println("\n");

            switch (option) {
                case 'a':
                    System.out.println("......................");
                    System.out.println("Balance = " + balance);
                    System.out.println("......................");
                    System.out.println("\n");
                    break;
                case 'b':
                    System.out.println("......................");
                    System.out.println("Enter a amount to deposit :");
                    System.out.println("......................");
                    double amount = scan.nextDouble();
                    deposit(amount);
                    System.out.println("\n");
                    break;
                case 'c':
                    System.out.println("......................");
                    System.out.println("Enter a amount to withdraw :");
                    System.out.println("......................");
                    double withdrawAmount = scan.nextDouble();
                    withdraw(withdrawAmount);
                    System.out.println("\n");
                    break;
                case 'd':
                    System.out.println("......................");
                    System.out.println("Previous Transaction:");
                    getPreviousTransaction();
                    System.out.println("......................");
                    System.out.println("\n");
                    break;
                case 'e':
                    System.out.println("......................");
                    break;
                default:
                    System.out.println("Choose a correct option to proceed");
                    break;
            }
        } while (option != 'e');
        System.out.println("Thank you for using our banking service");
    }
}

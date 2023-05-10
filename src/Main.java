import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your 'Name' and 'CustomerID' to access your bank account");
        String name = scan.nextLine();
        String customerID = scan.nextLine();
        BankAccount obj = new BankAccount(name, customerID);
        obj.menu();
    }
}
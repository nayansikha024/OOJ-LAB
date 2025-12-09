import java.util.Scanner;

class Account {
    String name;
    int accNo;
    String accType;
    double balance;

    void createAccount(String n, int a, String t, double b) {
        name = n;
        accNo = a;
        accType = t;
        balance = b;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: ₹" + amount);
    }

    void display() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Name: " + name);
        System.out.println("Account No: " + accNo);
        System.out.println("Type: " + accType);
        System.out.println("Balance: ₹" + String.format("%.2f", balance));
    }
}

class SavAcct extends Account {
    final double interestRate = 0.05;

    void computeInterest(int years) {
        double interest = balance * Math.pow(1 + interestRate, years) - balance;
        balance += interest;
        System.out.println("Compound interest for " + years + " years: ₹ " + String.format("%.2f", interest));
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Not enough balance.");
        }
    }
}

// Current Account with minimum balance check
class CurAcct extends Account {
    final double minBalance = 1000;
    final double serviceCharge = 100;

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
            if (balance < minBalance) {
                balance -= serviceCharge;
                System.out.println("Balance below ₹1000. Service charge ₹100 applied.");
            }
        } else {
            System.out.println("Not enough balance.");
        }
    }

    void issueChequeBook() {
        System.out.println("Cheque book issued.");
    }
}

// Main class 
public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Account Type:\n1. Savings Account\n2. Current Account");
        int choice = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        if (choice == 1) {
            SavAcct sa = new SavAcct();
            sa.createAccount(name, accNo, "Savings", balance);

            System.out.print("Enter deposit amount: ");
            double depositAmt = sc.nextDouble();
            sa.deposit(depositAmt);

            System.out.print("Enter number of years for interest: ");
            int years = sc.nextInt();
            sa.computeInterest(years);

            System.out.print("Enter withdrawal amount: ");
            double withdrawAmt = sc.nextDouble();
            sa.withdraw(withdrawAmt);

            sa.display();
        } else if (choice == 2) {
            CurAcct ca = new CurAcct();
            ca.createAccount(name, accNo, "Current", balance);

            System.out.print("Enter deposit amount: ");
            double depositAmt = sc.nextDouble();
            ca.deposit(depositAmt);

            System.out.print("Enter withdrawal amount: ");
            double withdrawAmt = sc.nextDouble();
            ca.withdraw(withdrawAmt);

            ca.issueChequeBook();
            ca.display();
        } else {
            System.out.println("Invalid account type selected.");
        }

        sc.close();
    }
}
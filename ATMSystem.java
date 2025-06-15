import java.util.Scanner;

class Account {
    private double balance;

    public Account(double initialBalance) {
        balance = initialBalance;
    }

    public double checkBalance() {
        return balance;
    }

    public void depositAmount(double amount) {
        balance += amount;
    }

    public boolean withdrawAmount(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}

class ATMInterface {
    private Account account;

    public ATMInterface(Account account) {
        this.account = account;
    }

    public void startATM() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            showMenu();
            System.out.print("Select an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Current Balance: Rs. " + account.checkBalance());
                    break;
                case 2:
                    System.out.print("Enter deposit amount: Rs. ");
                    double deposit = scanner.nextDouble();
                    if (deposit > 0) {
                        account.depositAmount(deposit);
                        System.out.println("Amount deposited successfully.");
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: Rs. ");
                    double withdrawal = scanner.nextDouble();
                    if (withdrawal > 0 && account.withdrawAmount(withdrawal)) {
                        System.out.println("Amount withdrawn successfully.");
                    } else {
                        System.out.println("Insufficient balance or invalid amount.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for visiting. Have a nice day!");
                    return;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
            System.out.println(); 
        }
    }

    private void showMenu() {
        System.out.println("=== ATM Menu ===");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
    }
}

public class ATMSystem {
    public static void main(String[] args) {
        Account user = new Account(100000);
        ATMInterface atm = new ATMInterface(user);
        atm.startATM();
    }
}

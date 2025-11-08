public class BankAccount {
    public static void main(String[] args) {
        Accounts account = new Accounts();
        account.setBalance(5000);
        account.getBalance();             // Shows current balance
        account.depositAmount(2000);      // Adds 2000
        account.withdrawalAmount(1000);   // Deducts 1000
        account.getBalance();             // Final balance
    }
}

class Accounts {
    private int balance;

    public void withdrawalAmount(int amount) {
        if (balance - amount < 0) {
            System.out.println("Insufficient Balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    public void depositAmount(int amount) {
        if (amount < 0) {
            System.out.println("Invalid Amount.");
        } else {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    public void getBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
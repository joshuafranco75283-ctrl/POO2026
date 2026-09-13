public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(12345, "John Doe", 1000.0);
        System.out.println("Account Number: " + account1.getAccountNumber());
        System.out.println("Account Holder: " + account1.getAccountHolder());
        System.out.println("Balance: " + account1.getBalance() + "$");

        double depositAmount = 500.0;
        if (account1.deposit(depositAmount)){
            System.out.println("Deposited: " + depositAmount + "$");
            System.out.println("New Balance: " + account1.getBalance() + "$");
        } else {
            System.out.println("Deposit failed.");
        }
        double withdrawAmount = 200.0;
        if (account1.withdraw(withdrawAmount)){
            System.out.println("Withdrew: " + withdrawAmount + "$");
            System.out.println("New Balance: " + account1.getBalance() + "$");
        } else {
            System.out.println("Withdrawal failed.");
        }
        double invalidWithdrawAmount = 2000.0;
        if (account1.withdraw(invalidWithdrawAmount)){
            System.out.println("Withdrew: " + invalidWithdrawAmount + "$");
            System.out.println("New Balance: " + account1.getBalance() + "$");
        } else {
            System.out.println("Withdrawal failed. Insufficient funds.");
            System.out.println("Balance remains unchanged: " + account1.getBalance() + "$");
        }
        double invalidDepositAmount = -100.0;
        if (account1.deposit(invalidDepositAmount)){
            System.out.println("Deposited: " + invalidDepositAmount + "$");
            System.out.println("New Balance: " + account1.getBalance() + "$");
        } else {
            System.out.println("Deposit failed. Invalid amount.");
            System.out.println("Balance remains unchanged: " + account1.getBalance() + "$");
        }
    }
}

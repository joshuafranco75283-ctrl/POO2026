public class BankAccount {

    private final Integer accountNumber;
    private final String accountHolder;
    private double balance;

     private boolean isValidAccountNumber(Integer accountNumber){
        return accountNumber != null && accountNumber > 0;
    }

    private boolean isValidAccountHolder(String accountHolder){
        return accountHolder != null && !accountHolder.isBlank() && !accountHolder.isEmpty();
    }

    private boolean isValidBalance(double balance){
        return balance >= 0.0;
    }
    public BankAccount(Integer accountNumber, String accountHolder, double balance) {
        if (isValidAccountNumber(accountNumber)){
            this.accountNumber = accountNumber;
        } else {
            this.accountNumber = null;
        }
        if (isValidAccountHolder(accountHolder)) {
            this.accountHolder = accountHolder;
        } else {
            this.accountHolder = "Default Account Holder";
        }
        if (isValidBalance(balance)) {
            this.balance = balance;
        } else {
            this.balance = 0.0;
        }
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            return true;
        } else {
            return false; 
        }
    }
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            return true;
        } else {
            return false; 
        }
    }

    public String getAccountHolder() {
        return this.accountHolder;
    }

    public Integer getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    
}

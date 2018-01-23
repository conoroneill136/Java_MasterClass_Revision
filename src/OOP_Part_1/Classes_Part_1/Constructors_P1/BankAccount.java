package OOP_Part_1.Classes_Part_1.Constructors_P1;

public class BankAccount {
    private String  accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this("0000",0d,"Default name",
                "default Email", "default phonenumber");
    }

    public BankAccount(String accountNumber, double balance,
                       String customerName, String email,
                       String phoneNumber){
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.customerName = "No Name";
        this.balance = 0;
        this.email = "default";
        this.phoneNumber = "default";

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double amount){
        double currentBalance = getBalance();
        currentBalance += amount;
        balance = currentBalance;
        System.out.println("Deposited " + amount + " Balance now: " + balance);
    }
        public void withdrawFunds(double amount){
        double currentBalance = getBalance();
        if(amount <= currentBalance) {
            currentBalance -= amount;
            balance = currentBalance;
            System.out.println("Withdrew " + amount + " Your Balance is now " + balance);
        }
        else
            System.out.println("You do not have sufficient funds to withdraw this amount");
    }

}

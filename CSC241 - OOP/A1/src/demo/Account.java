package demo;

public class Account {
    int acc_no;
    private String name;
    float amount;

    //Constructor
    public Account(int a, String n, float amt) {
        this.acc_no = a;
        this.name = n;
        this.amount = amt;
    }

    //Public methods
    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Account #: " + acc_no);
        System.out.println("Balance: " + amount + "\n");
    }

    public void checkBalance() {
        System.out.println("Balance: " + amount);
    }

    public void deposit(int added_amount) {
        amount += added_amount;
        System.out.println("\n" + added_amount + " Deposited");
    }

    public void withdraw(int withdraw_amount) {
        amount -= withdraw_amount;
        System.out.println("\n" + withdraw_amount + " Withdrawn");
    }
}

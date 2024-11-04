package model;

public class Expense extends Transaction {
    public Expense(double amount, String description) {
        super(amount, description);
    }

    @Override
    public void execute() {
        System.out.println("Expense added: " + description + " - $" + amount);
    }
}

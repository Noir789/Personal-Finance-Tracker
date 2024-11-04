package model;

public class Income extends Transaction {
    public Income(double amount, String description) {
        super(amount, description);
    }

    @Override
    public void execute() {
        System.out.println("Income added: " + description + " - $" + amount);
    }
}

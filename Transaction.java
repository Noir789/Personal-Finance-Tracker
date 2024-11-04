package model;

public abstract class Transaction {
    protected double amount;
    protected String description;

    public Transaction(double amount, String description) {
        this.amount = amount;
        this.description = description;
    }

    public abstract void execute();
}

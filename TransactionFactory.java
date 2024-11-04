package model;

public class TransactionFactory {
    public static Transaction createTransaction(String type, double amount, String description) {
        if ("income".equalsIgnoreCase(type)) {
            return new Income(amount, description);
        } else if ("expense".equalsIgnoreCase(type)) {
            return new Expense(amount, description);
        }
        throw new IllegalArgumentException("Unknown transaction type");
    }
}

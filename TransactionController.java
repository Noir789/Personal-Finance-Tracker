package controller;

import model.Transaction;
import model.TransactionFactory;

import java.util.ArrayList;
import java.util.List;

public class TransactionController {
    private List<Transaction> transactions;

    public TransactionController() {
        transactions = new ArrayList<>();
    }

    public void addTransaction(String type, double amount, String description) {
        Transaction transaction = TransactionFactory.createTransaction(type, amount, description);
        transaction.execute();
        transactions.add(transaction);
    }
}

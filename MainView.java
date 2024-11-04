package view;

import controller.TransactionController;

import java.util.Scanner;

public class MainView {
    private TransactionController controller;

    public MainView(TransactionController controller) {
        this.controller = controller;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        String command;
        System.out.println("Welcome to Personal Finance Tracker!");

        while (true) {
            System.out.print("Enter transaction type (income/expense) or 'exit': ");
            command = scanner.nextLine();

            if ("exit".equalsIgnoreCase(command)) {
                break;
            }

            System.out.print("Enter amount: ");
            double amount = scanner.nextDouble();
            scanner.nextLine();  // Consume newline
            System.out.print("Enter description: ");
            String description = scanner.nextLine();

            controller.addTransaction(command, amount, description);
        }

        scanner.close();
    }
}

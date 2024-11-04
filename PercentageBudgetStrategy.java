package strategy;

public class PercentageBudgetStrategy implements BudgetStrategy {
    @Override
    public void execute() {
        // Логика для процентного бюджета
        System.out.println("Using percentage-based budget strategy.");
    }
}

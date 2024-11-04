package strategy;

public class FixedBudgetStrategy implements BudgetStrategy {
    @Override
    public void execute() {
        // Логика для фиксированного бюджета
        System.out.println("Using fixed budget strategy.");
    }
}

package BudgetWise_Personal_Finance_Tracker;

class Budget implements IAnalyzable {

    protected double income;
    protected double limit;
    protected double totalExpenses;

    public Budget(double income, double limit) {
        this.income = income;
        this.limit = limit;
        this.totalExpenses = 0;
    }

    // Encapsulation: expense added only via method
    public void addExpense(double amount) {
        totalExpenses += amount;
    }

    public double calculateSavings() {
        return income - totalExpenses;   // operator usage
    }

    @Override
    public void detectOverspend() {
        if (totalExpenses > limit) {
            System.out.println("⚠ Overspending detected!");
        } else {
            System.out.println("Expenses are within budget");
        }
    }

    @Override
    public void generateReport() {
        System.out.println("Budget Report");
    }
}

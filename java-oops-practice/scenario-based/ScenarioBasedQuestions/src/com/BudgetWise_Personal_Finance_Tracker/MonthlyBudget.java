package BudgetWise_Personal_Finance_Tracker;

class MonthlyBudget extends Budget {

    public MonthlyBudget(double income, double limit) {
        super(income, limit);
    }

    @Override
    public void generateReport() {
        System.out.println("\n--- Monthly Budget Report ---");
        System.out.println("Income: ₹" + income);
        System.out.println("Expenses: ₹" + totalExpenses);
        System.out.println("Savings: ₹" + calculateSavings());
    }
}


package BudgetWise_Personal_Finance_Tracker;


	public class AnnualBudget extends Budget {

	    public AnnualBudget(double income, double limit) {
	        super(income, limit);
	    }

	    @Override
	    public void generateReport() {
	        System.out.println("\n--- Annual Budget Report ---");
	        System.out.println("Total Income: ₹" + income);
	        System.out.println("Total Expenses: ₹" + totalExpenses);
	        System.out.println("Net Savings: ₹" + calculateSavings());
	    }
	}


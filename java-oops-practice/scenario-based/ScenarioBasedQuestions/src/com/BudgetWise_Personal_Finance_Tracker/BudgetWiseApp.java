package BudgetWise_Personal_Finance_Tracker;

import java.util.Scanner;

public class BudgetWiseApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Budget Type:");
        System.out.println("1. Monthly Budget");
        System.out.println("2. Annual Budget");
        int choice = sc.nextInt();

        System.out.print("Enter income: ");
        double income = sc.nextDouble();

        System.out.print("Enter budget limit: ");
        double limit = sc.nextDouble();

        Budget budget;

        if (choice == 1) {
            budget = new MonthlyBudget(income, limit);
        } else {
            budget = new AnnualBudget(income, limit);
        }

        System.out.print("Enter number of expenses: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter expense " + i + ": ");
            double expense = sc.nextDouble();
            budget.addExpense(expense);
        }

        budget.generateReport();
        budget.detectOverspend();

        sc.close();
    }
}


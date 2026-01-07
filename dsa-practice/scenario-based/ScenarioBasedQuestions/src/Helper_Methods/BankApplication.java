package Helper_Methods;

//Main class
public class BankApplication {

 // -------- Helper Method 1 --------
 public static boolean validateUserInput(Customer customer) {
     if (customer.getName() == null || customer.getName().isEmpty()) {
         return false;
     }
     if (customer.getId() <= 0) {
         return false;
     }
     return true;
 }

 // -------- Helper Method 2 --------
 public static boolean checkLoanEligibility(Account account) {
     return account.getBalance() >= 50000;
 }

 // -------- Helper Method 3 --------
 public static double calculateDiscount(double amount) {
     if (amount >= 100000) {
         return amount * 0.10; // 10% discount
     } else if (amount >= 50000) {
         return amount * 0.05; // 5% discount
     }
     return 0;
 }

 // -------- Main Method --------
 public static void main(String[] args) {

     Customer customer = new Customer(101, "Khushi");
     SavingsAccount savings = new SavingsAccount(12345, 75000, 4.5);

     if (validateUserInput(customer)) {
         System.out.println("User input is valid");
     } else {
         System.out.println("Invalid user input");
     }

     if (checkLoanEligibility(savings)) {
         System.out.println("Customer is eligible for loan");
     } else {
         System.out.println("Customer is not eligible for loan");
     }

     double discount = calculateDiscount(80000);
     System.out.println("Discount Amount: ₹" + discount);
 }
}

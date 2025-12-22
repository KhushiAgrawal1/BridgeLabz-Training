// Program Title : Null Pointer Exception Demonstration
// Description   : This program demonstrates NullPointerException by
//                 accessing a method on a null object and then shows
//                 how to handle it using try-catch.

public class NullPointer {

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null;              // text initialized to null
        System.out.println(text.length()); // Causes NullPointerException
    }

    // Method to handle NullPointerException
    public static void handleException() {
        String text = null;
        try {
            System.out.println(text.length()); // Exception occurs here
        }
        catch (NullPointerException e) {
            System.out.println("Null Pointer Exception Handled.");
            System.out.println("Error message: " + e);
        }
    }

    public static void main(String[] args) {

        // Calling method that generates exception
        System.out.println("Generating Null Pointer Exception: ");
        try {
            generateException();
        }
        catch (NullPointerException e) {
            System.out.println("Exception occurred in main: " + e);
        }

        // Calling method that handles exception
        System.out.println("Handling null pointer exception: ");
        handleException();
    }
}

import java.util.Scanner;

public class OnlineQuizApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] questions = {
                "1. Which language is used for Android development?",
                "2. Which keyword is used to inherit a class in Java?",
                "3. Which loop is best when number of iterations is known?",
                "4. Which company developed Java?",
                "5. Which data type is used to store true/false?"
        };

        String[][] options = {
                {"A. Java", "B. Python", "C. C++", "D. Swift"},
                {"A. this", "B. super", "C. extends", "D. implements"},
                {"A. while", "B. do-while", "C. for", "D. foreach"},
                {"A. Google", "B. Microsoft", "C. Sun Microsystems", "D. Apple"},
                {"A. int", "B. boolean", "C. char", "D. String"}
        };

        char[] correctAnswers = {'A', 'C', 'C', 'C', 'B'};

        int score = 0;

        for (int i = 0; i < questions.length; i++) {

            System.out.println("\n" + questions[i]);

            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }

            System.out.print("Enter your answer (A/B/C/D): ");
            char userAnswer = sc.next().toUpperCase().charAt(0);

            switch (userAnswer) {

                case 'A':
                case 'B':
                case 'C':
                case 'D':
                    if (userAnswer == correctAnswers[i]) {
                        System.out.println("✅ Correct Answer!");
                        score++;
                    } else {
                        System.out.println("❌ Wrong Answer!");
                    }
                    break;

                default:
                    System.out.println("⚠️ Invalid choice!");
            }
        }

        System.out.println("\n🎯 Quiz Finished!");
        System.out.println("Your Final Score: " + score + "/5");

        sc.close();
    }
}

package EduMentor_Personalized_Learning_Platform;

public class EduMentorMain {
    public static void main(String[] args) {

        Learner l1 = new Learner(1, "Khushi", "khushi@edu.com", "Short");

        String[] q = {"Q1", "Q2"};
        String[] a = {"A", "B"};

        Quiz quiz = new Quiz(q, a);
        quiz.evaluate(new String[]{"A", "B"});
        System.out.println("Quiz Percentage: " + quiz.getPercentage());
        l1.generateCertificate();  // Polymorphism
    }
}


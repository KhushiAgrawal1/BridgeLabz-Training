package EduMentor_Personalized_Learning_Platform;

public class Quiz {

    private String[] questions;
    private String[] answers;
    private int score;

    public Quiz(String[] questions, String[] answers) {
        this.questions = questions;
        this.answers = answers;
    }

    public void evaluate(String[] userAnswers) {
        for (int i = 0; i < answers.length; i++) {
            if (answers[i].equals(userAnswers[i])) {
                score += 10;   // operator usage
            }
        }
    }

    public double getPercentage() {
        return (score * 100.0) / (answers.length * 10);
    }
}

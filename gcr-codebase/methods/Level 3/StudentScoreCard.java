import java.util.Scanner;

public class StudentScoreCard {

    // Function to generate random 2-digit PCM marks
    static int[][] generatePCMMarks(int students) {

        int[][] marks = new int[students][3]; // Physics, Chemistry, Maths

        for (int i = 0; i < students; i++) {
            marks[i][0] = (int)(Math.random() * 51) + 50; // Physics
            marks[i][1] = (int)(Math.random() * 51) + 50; // Chemistry
            marks[i][2] = (int)(Math.random() * 51) + 50; // Maths
        }
        return marks;
    }

    // Function to calculate total, average, percentage
    static double[][] calculateResults(int[][] marks) {

        int students = marks.length;
        double[][] result = new double[students][3]; // Total, Average, Percentage

        for (int i = 0; i < students; i++) {

            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Round to 2 decimal places
            result[i][0] = total;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return result;
    }

    // Method to display the scorecard
    static void displayScoreCard(int[][] marks, double[][] result) {

        System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAvg\tPercentage");

        for (int i = 0; i < marks.length; i++) {
            System.out.println(
                (i + 1) + "\t" +
                marks[i][0] + "\t" +
                marks[i][1] + "\t" +
                marks[i][2] + "\t" +
                result[i][0] + "\t" +
                result[i][1] + "\t" +
                result[i][2]
            );
        }
    }

    public static void main(String[] args) {

        // Input the number of students
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        // Generate marks
        int[][] pcmMarks = generatePCMMarks(students);

        // Calculate results
        double[][] results = calculateResults(pcmMarks);

        // Display the results
        displayScoreCard(pcmMarks, results);

    }
}
// Program to divide pens equally among students

public class PenDivision
{
    public static void main(String args[])
    {
        // Total pens and students
        int pens = 14;
        int students = 3;

        // Pens each student will get
        int penPerStudent = pens / students;

        // Remaining pens
        int remainingPens = pens % students;

        // Display result
        System.out.println("The Pen Per Student is " + penPerStudent + "and the remaining pen not distributed is " + remainingPens);
    }
}

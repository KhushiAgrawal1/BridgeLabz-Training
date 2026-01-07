package EduMentor_Personalized_Learning_Platform;

public class Learner extends User implements ICertifiable {

    private String courseType; // Short / FullTime

    public Learner(int id, String name, String email, String courseType) {
        super(id, name, email);
        this.courseType = courseType;
    }

    @Override
    public void generateCertificate() {
        if (courseType.equalsIgnoreCase("Short")) {
            System.out.println("Short Course Certificate issued to " + name);
        } else {
            System.out.println("Full-Time Program Certificate issued to " + name);
        }
    }
}


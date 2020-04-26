public class Teacher extends Information {

    private String subject;


    public Teacher(String fistName, String lastName, int age, String subject) {
        super(fistName, lastName, age);
        this.subject = subject;

    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    String getInfo() {
        return super.getInfo()+ subject;

    }
}

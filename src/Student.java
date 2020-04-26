public class Student extends Information {

    private int yearOfStudy;


    public Student(String fisrtName, String lastName, int age, int yearOfStudy) {
        super(fisrtName, lastName, age);
        this.yearOfStudy = yearOfStudy;

    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }
    @Override
    String getInfo(){
        return super.getInfo() + yearOfStudy;

    }

}

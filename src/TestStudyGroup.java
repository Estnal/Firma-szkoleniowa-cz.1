public class TestStudyGroup {
    public static void main(String[] args) {
        Teacher teacher =  new Teacher("Profesor Wojtek","Kowalski", 45, "Ekonomia" );
        Student student1 = new Student("Adam", "Rutkowski", 22, 2);
        Student student2 =  new Student("Ania", "Rutkowska", 23, 2);

        System.out.println(teacher.getInfo());
        System.out.println(student1.getInfo());
        System.out.println(student2.getInfo());

    }



    }



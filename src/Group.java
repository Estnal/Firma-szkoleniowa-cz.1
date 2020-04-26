public class Group {
    Teacher teacher;
    Student[] students;

        public Group(Teacher teacher, Student[] students) {
            this.teacher = teacher;
            this.students = students;
        }

        public Student[] getStudents() {
            return this.students;
        }

        public Teacher getTeacher() {
            return this.teacher;
        }

    }






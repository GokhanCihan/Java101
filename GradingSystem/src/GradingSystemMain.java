public class GradingSystemMain {
    public static void main(String[] args) {
        Course math = new Course("Math", "MATH-101", "MATH");
        Course physics = new Course("Physics", "PHYSICS-101", "PHY");
        Course chemistry = new Course("Chemistry", "CHEMISTRY-101", "CHE");

        Teacher teacher1 = new Teacher("Ahmet A.", "MATH", 90507000);
        Teacher teacher2 = new Teacher("Ali V.", "PHY", 90505000);
        Teacher teacher3 = new Teacher("Ayşe Ç.", "CHE", 90532000);

        math.addTeacher(teacher1);
        physics.addTeacher(teacher2);
        chemistry.addTeacher(teacher3);

        Student student1 = new Student("Murat M.", "4140144015", math, physics, chemistry);
        student1.addExamNotes(50, 20, 40);
        student1.didPass();

        Student s2 = new Student("Uğur C.", "42211133", math, physics, chemistry);
        s2.addExamNotes(100, 50, 40);
        s2.didPass();

        Student s3 = new Student("Emre İ.", "4221121312", math, physics, chemistry);
        s3.addExamNotes(50, 20, 40);
        s3.didPass();
    }
}

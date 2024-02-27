public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int examResult;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.examResult = 0;
    }

    public void addTeacher(Teacher teacher) {
        if(this.prefix.equals(teacher.branch)){
            this.teacher = teacher;
            System.out.println("Teacher assigned successfully.");
        } else {
            System.out.println("Teacher can not be assigned to this course!");
        }
    }

    public void printTeacher() {
        if (this.teacher != null) {
            System.out.println("Teacher of the " + this.name + "course: " + this.teacher.name );
        }else {
            System.out.println("Not assigned any teacher to this course");
        }
    }
}

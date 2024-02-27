public class Student {
    String name, id;
    int numberOfClasses, average;
    Course math, physics, chemistry;
    boolean didPass;

    Student(String name, String id, Course math, Course physics, Course chemistry) {
        this.name = name;
        this.id = id;
        this.numberOfClasses = 3;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        calculateAverage();
        this.didPass = false;
    }

    public void addExamNotes(int mathResult, int physicsResult, int chemistryResult) {
        if (mathResult >= 0 && mathResult <= 100) {
            this.math.examResult = mathResult;
        }

        if (physicsResult >= 0 && physicsResult <= 100) {
            this.physics.examResult = physicsResult;
        }

        if (chemistryResult >= 0 && chemistryResult <= 100) {
            this.chemistry.examResult = chemistryResult;
        }
    }

    public void calculateAverage() {
        this.average = (this.physics.examResult + this.chemistry.examResult + this.math.examResult) / this.numberOfClasses;
    }

    public boolean checkAverage() {
        calculateAverage();
        return this.average > 55;
    }

    public void didPass() {
        this.didPass = checkAverage();
    }

    public void printExamResults() {
            System.out.println("Student: " + this.name);
            System.out.println("Math Exam Result: " + this.math.examResult);
            System.out.println("Physics Exam Result: " + this.physics.examResult);
            System.out.println("Chemistry Exam Result : " + this.chemistry.examResult);
    }
}

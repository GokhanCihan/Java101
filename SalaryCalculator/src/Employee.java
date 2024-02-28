public class Employee {
    String name;
    int salary;
    int workHours;
    int yearHired;

    Employee(String name, int salary, int workHours, int yearHired) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.yearHired = yearHired;
    }

    double tax() {
        return (this.salary >= 1000) ? 0.03 : 0;
    }

    int bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        }
        return 0;
    }

    void raiseSalary() {
        int years = 2024 - this.yearHired;

        if (years < 10) {
            this.salary = (int) (this.salary * 1.05);
        }else if (years < 20) {
            this.salary = (int) (this.salary * 1.10);
        }else {
            this.salary = (int) (this.salary * 1.15);
        }
    }

    public String toString() {
        return "\tEMPLOYEE" +
                "\n======================" +
                "\nName: " + this.name + "\nSalary: " + this.salary +
               "\nweekly work hours: " + this.workHours +
               "\nyear hired: " + this.yearHired;
    }
}

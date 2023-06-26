public class Employee {
    private String name;
    private String gender;
    private int age;
    private double salary;

    public Employee(String name, String gender, int age, double salary) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
    }

    public double salaryIncrease(double amount) {
        if (salary > 0) {
            salary += amount * 0.8;
        } else if (salary > 500) {
            salary += amount * 0.6;
        } else {
            salary += amount * 0.4;
        }
        return salary;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

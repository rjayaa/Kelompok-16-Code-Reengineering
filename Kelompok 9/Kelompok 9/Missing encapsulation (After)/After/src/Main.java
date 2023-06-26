public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", "Male", 26, 10000);
        employee1.salaryIncrease(100);

        employee1.display();
    }
}

import java.util.Scanner;

public class Shapes {
    private Scanner scanner;

    public Shapes() {
        this.scanner = new Scanner(System.in);
    }

    // Mengganti method calculateSquareArea dengan menggunakan method getInput
    public void calculateSquareArea() {
        int side = getInput("Enter side length"); // Memanggil method getInput untuk mengambil input dari pengguna
        System.out.println("Area of square: " + side * side);
    }

    // Mengganti method calculateRectangleArea dengan menggunakan method getInput
    public void calculateRectangleArea() {
        int width = getInput("Enter width"); // Memanggil method getInput untuk mengambil input dari pengguna
        int height = getInput("Enter height"); // Memanggil method getInput untuk mengambil input dari pengguna
        System.out.println("Area of rectangle: " + height * width);
    }

    // Mengganti method calculateCircleArea dengan menggunakan method getInputDouble
    public void calculateCircleArea() {
        double radius = getInputDouble("Enter radius"); // Memanggil method getInputDouble untuk mengambil input dari
                                                        // pengguna
        System.out.println("Area of circle: " + 3.14 * radius * radius);
    }

    // Membuat method getInput yang digunakan untuk mengambil input integer dari
    // pengguna
    private int getInput(String message) {
        System.out.print(message + ": ");
        return scanner.nextInt();
    }

    // Membuat method getInputDouble yang digunakan untuk mengambil input double
    // dari pengguna
    private double getInputDouble(String message) {
        System.out.print(message + ": ");
        return scanner.nextDouble();
    }

    // Mengganti penggunaan if-else dengan switch case pada method menu
    public void menu() {
        int input;

        do {
            System.out.println("Menu\n========");
            System.out.println("1. Calculate Rectangle Area");
            System.out.println("2. Calculate Square Area");
            System.out.println("3. Calculate Circle Area");
            System.out.println("0. Exit");
            System.out.print("Input: ");

            input = scanner.nextInt();
            switch (input) { // Menggunakan switch case untuk memeriksa input pengguna
                case 1:
                    calculateRectangleArea();
                    break;
                case 2:
                    calculateSquareArea();
                    break;
                case 3:
                    calculateCircleArea();
                    break;
            }
        } while (input != 0);

    }

    public static void main(String[] args) {
        Shapes test = new Shapes();
        test.menu();
    }
}

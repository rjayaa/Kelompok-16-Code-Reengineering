public class Main {
public static void main(String[] args) {
Vehicle mercedes = new Vehicle("Mercedes");
Vehicle ducati = new Vehicle("Ducati");

    mercedes.displayStock();
    mercedes.displayModel();
    mercedes.displayColor();
    System.out.println();

    ducati.displayStock();
    ducati.displayModel();
    ducati.displayColor();
    ducati.displayCylinderCapacity();
	}
}

class Vehicle {
private String brand;

public Vehicle(String brand) {
    this.brand = brand;
	}

public void displayStock() {
    System.out.println(brand + " stock");
	}

public void displayModel() {
    System.out.println(brand + " model");
	}

public void displayColor() {
    System.out.println(brand + " color");
	}

public void displayCylinderCapacity() {
    System.out.println(brand + " cylinder capacity");
	}
}
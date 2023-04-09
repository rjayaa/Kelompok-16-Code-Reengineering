import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingCart {
	
	private List<Item> items;
    private CartTotalCalculator totalCalculator;

    // constructor
    public ShoppingCart() {
        this.items = new ArrayList<>();
        this.totalCalculator = new CartTotalCalculator(items);
    }

    // add item to cart
    public void addItem(Item item) {
        items.add(item);
        totalCalculator.updateTotalPrice(item.getPrice());
    }

    // getter for totalPrice
    public double getTotalPrice() {
        return totalCalculator.getTotalPrice();
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter item name (or 'exit' to quit):");
            String itemName = scanner.nextLine();
            if (itemName.equals(anObject:"exit")) {
                break;
            }
            System.out.println(x:"Enter item price:");
            double itemPrice = Double.parseDouble(scanner.nextLine());
            Item item = new Item(itemName, itemPrice);
            cart.addItem(item);
        }
        scanner.close();
        System.out.println("Total price: " + cart.getTotalPrice());
    }
}

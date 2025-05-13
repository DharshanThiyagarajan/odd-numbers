import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<MenuItem> orderedItems = new ArrayList<>();

    public void addItem(MenuItem item) {
        orderedItems.add(item);
    }

    public void displayBill() {
        double total = 0;
        System.out.println("\n--- BILL ---");
        for (MenuItem item : orderedItems) {
            System.out.println(item);
            total += item.getPrice();
        }
        System.out.println("Total Amount: ₹" + total);
    }
}

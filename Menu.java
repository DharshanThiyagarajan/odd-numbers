import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<MenuItem> items = new ArrayList<>();

    public Menu() {
        items.add(new MenuItem("Iddly", 10.0));
        items.add(new MenuItem("Dosa", 40.0));
        items.add(new MenuItem("Special Dosa", 60.0));
        items.add(new MenuItem("Deserts", 70.0));
        items.add(new MenuItem("Drinks", 80.0));
    }

    public void displayMenu() {
        System.out.println("\n--- MENU ---");
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i));
        }
    }

    public MenuItem getItem(int index) {
        if (index >= 0 && index < items.size()) {
            return items.get(index);
        }
        return null;
    }

    public int size() {
        return items.size();
    }
}

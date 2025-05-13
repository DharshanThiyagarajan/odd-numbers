import java.util.Scanner;

public class RestaurantApp {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Order order = new Order();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Restaurant Menu System ---");
            System.out.println("1. View Menu");
            System.out.println("2. Place Order");
            System.out.println("3. View Bill");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    menu.displayMenu();
                    break;
                case 2:
                    menu.displayMenu();
                    System.out.print("Enter item number to order: ");
                    int itemNumber = scanner.nextInt();
                    MenuItem selectedItem = menu.getItem(itemNumber - 1);
                    if (selectedItem != null) {
                        order.addItem(selectedItem);
                        System.out.println(selectedItem.getName() + " added to your order.");
                    } else {
                        System.out.println("Invalid item number.");
                    }
                    break;
                case 3:
                    order.displayBill();
                    break;
                case 4:
                    System.out.println("Thank you for visiting!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);

        scanner.close();
    }
}

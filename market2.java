import java.util.Scanner;

public class market2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] items = {"chips", "biscuits", "cake", "colddrink", "kurkure"};
        double[] prices = {25.00, 20.00, 30.00, 20.00, 25.00};

        System.out.println("Available items for purchase:");
        for (int i = 0; i < items.length; i++) {
            System.out.println((i + 1) + ". " + items[i] + " - " + prices[i]);
        }

        double totalCost = 0;
        double discount = 10;

        System.out.println("\nEnter the item numbers you want to purchase:");
        String input = scanner.nextLine();
        String[] selectedItems = input.split(" ");

        for (String selectedItem : selectedItems) {
            int index = Integer.parseInt(selectedItem) - 1;
            if (index >= 0 && index < items.length) {
                totalCost += prices[index];
            }
        }
        discount = totalCost * 0.1;
		totalCost -= discount;

        System.out.println("\nTotal cost: " + totalCost);
        System.out.println("Discount : " + discount);

        scanner.close();
    }
}

import java.util.Scanner;

public class Financial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        String productName = sc.nextLine();
        double price = sc.nextDouble();
        int quantity = sc.nextInt();

        // Calculate total
        double total = price * quantity;

        // Formatted Output
        System.out.println("--------------------------------------------");
        System.out.printf("%-15s %10s %10s %12s\n", "Product", "Price", "Qty", "Total");
        System.out.println("--------------------------------------------");
        System.out.printf("%-15s %10.2f %10d %12.2f\n",
                productName, price, quantity, total);
        System.out.println("--------------------------------------------");

        sc.close();
    }
}
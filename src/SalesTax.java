import java.util.Scanner;

public class SalesTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the purchase price: $");
        double purchasePrice = input.nextDouble();

        double salesTax = purchasePrice * 0.05;

        System.out.println("Purchase Price: $" + purchasePrice);
        System.out.println("Sales Tax (5%): $" + salesTax);

        input.close();
    }
}

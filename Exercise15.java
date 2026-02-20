import java.util.Scanner;

public class Exercise15 {

    public static void main(String[] args) {

        System.out.println("Exercise 15");
        System.out.println("[EX] Array of invoices");

        Scanner sc = new Scanner(System.in);

        System.out.print("How many invoices? ");
        int n = sc.nextInt();
        sc.nextLine();

        invoice[] invoices = new invoice[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nInvoice " + (i + 1));

            System.out.print("Part number: ");
            String partNumber = sc.nextLine();

            System.out.print("Part description: ");
            String partDescription = sc.nextLine();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            System.out.print("Price per item: ");
            double price = sc.nextDouble();
            sc.nextLine();

            invoices[i] = new invoice(partNumber, partDescription, quantity, price);
        }

        System.out.println("\nInvoice amounts:");
        for (int i = 0; i < invoices.length; i++) {
            double amount = invoices[i].getQuantity() * invoices[i].getPricePerItem();
            System.out.println("Invoice " + (i + 1) + " amount: " + amount);
        }

        sc.close();
    }
}

class invoice {

    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public String getPartNumber() { return partNumber; }
    public String getPartDescription() { return partDescription; }
    public int getQuantity() { return quantity; }
    public double getPricePerItem() { return pricePerItem; }

    public void setPartNumber(String partNumber) { this.partNumber = partNumber; }
    public void setPartDescription(String partDescription) { this.partDescription = partDescription; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public void setPricePerItem(double pricePerItem) { this.pricePerItem = pricePerItem; }
}

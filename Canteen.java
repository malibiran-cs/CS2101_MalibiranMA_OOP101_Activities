import java.util.Scanner;
class Canteen {
    public static void main(String[] args) {
    String[] foodMenu = {"Burger", "Pizza", "Bacon Egg and Cheese Sandwich", "Nachos", "Fish Fillet"};
    double[] foodPrices = {10.00, 15.00, 25.00, 15.00, 20.00};

    System.out.println("=====   M E N U   =====");
    for (int i = 0; i < foodMenu.length; i++) {
        System.out.println((i + 1) + ". " + foodMenu[i] + " - $" + foodPrices[i]);    }

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter item number: ");
    int foodItem = sc.nextInt();

    System.out.print("Enter quantity: ");
    int quantity = sc.nextInt();

    System.out.print("Are you a student? (Y/N)");
    String studentStatus = sc.next();

    sc.close();

    boolean isStudent = studentStatus.equalsIgnoreCase("Y");
    boolean validFood = (foodItem >= 1 && foodItem <= foodMenu.length);
    boolean validQuantity = (quantity >= 1 && quantity <= 10);

    if (!validFood || !validQuantity) {
        System.out.println("Invalid order! Please enter a valid item and quantity");
    }




    }
}
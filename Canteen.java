import java.util.Scanner;
class Canteen {
    public static void main(String[] args) {
    String[] foodMenu = {"Burger", "Pizza", "Bacon Egg and Cheese Sandwich", "Nachos", "Fish Fillet"};
    double[] foodPrices = {10.00, 15.00, 25.00, 15.00, 20.00};

    System.out.println("=====   M E N U   =====");
    for (int i = 0; i < foodMenu.length; i++) {
        System.out.println((i + 1) + ". " + foodMenu[i] + " - $" + foodPrices[i]);    }

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter item number: ");
    int foodItem = sc.nextInt();

    System.out.println("Enter quantity: ");
    int quantity = sc.nextInt();

    System.out.println("Are you a student? (Y/N)");
    String studentStatus = sc.next();

    boolean isStudent = studentStatus.equalsIgnoreCase("Y");


    }
}
import java.util.Scanner;
class Canteen {
    public static void main(String[] args) {
    String[] foodMenu = {"Burger", "Pizza", "Bacon Egg and Cheese Sandwich", "Nachos", "Fish Fillet"};
    double[] foodPrice = {10.00, 15.00, 25.00, 15.00, 20.00};

    String orderAgain;
    int totalFood = 0;
    double subtotal = 0.0;
    double totalDiscount = 0.0;
    double finalTotal = 0.0;

do {
    System.out.println("=====   M E N U   =====");
    for (int i = 0; i < foodMenu.length; i++) {
        System.out.printf("%d. %s - $%.2f%n", (i + 1), foodMenu[i], foodPrice[i]);    }

    Scanner sc = new Scanner(System.in);

    System.out.println("");

    System.out.print("Enter item number: ");
    int foodItem = sc.nextInt();

    System.out.print("Enter quantity: ");
    int quantity = sc.nextInt();

    System.out.print("Are you a student? (Y/N): ");
    String studentStatus = sc.next();

    boolean isStudent = studentStatus.equalsIgnoreCase("Y");
    boolean validFood = (foodItem >= 1 && foodItem <= foodMenu.length);
    boolean validQuantity = (quantity >= 1 && quantity <= 10);

    if (!validFood || !validQuantity) {
        System.out.println("Invalid order! Please enter a valid item and quantity");
    }

    else {
        totalFood += quantity;

        double orderAmount = foodPrice[foodItem - 1] * quantity;
        subtotal += orderAmount;
        double discountRate = 0.0;
        if (isStudent && orderAmount >= 500) {
            discountRate = 0.15;
        }

        else if (isStudent){
            discountRate = 0.10;
        }

        else if (orderAmount >= 500){
            discountRate = 0.05;
        }

        double deduction = orderAmount * discountRate;
        double finalAmount = orderAmount - deduction;

        subtotal += orderAmount;
        totalFood += quantity;
        totalDiscount += deduction;
        finalTotal += finalAmount;

        System.out.printf("Subtotal: $%.2f%n" + orderAmount);
        System.out.printf("Discount: $%.2f%n" + (finalAmount - orderAmount));
        System.out.printf("Order total: $%.2f%n" + finalAmount);

    }

    System.out.print("Do you want to order again? (Y/N): ");
    orderAgain = sc.next();

} while (orderAgain.equalsIgnoreCase("Y"));

System.out.println("===== ORDER SUMMARY =====");
System.out.println("Total items: " + totalFood);
System.out.printf("Total before discount: $%.2f%n" + subtotal);
System.out.printf("Total discount: $%.2f%n" + totalDiscount);
System.out.printf("Final amount: $%.2f%n" + finalTotal);
System.out.println("Thank you for ordering!");





    

    }
}
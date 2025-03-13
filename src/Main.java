import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Undo undo = Undo.getInstance();

        int option;
        do {
            System.out.println("\nChoose one option: ");
            System.out.println("1. Add order");
            System.out.println("2. Undo last order");
            System.out.println("3. List orders");
            System.out.println("4. Exit");

            option = input.nextInt();

            switch (option) {

                case 1:
                    String order = input.nextLine();
                    undo.addOrder(order);
                    System.out.println("order " + order + " has been added.");
                    break;

                case 2:
                    undo.undoOrder();
                    System.out.println("Last order has been removed.");
                    break;

                case 3:
                    System.out.println("Order list: ");
                    undo.listOrders();
                    break;

                case 4:
                    System.out.println("Exit. Thanks for operate with us");
                    break;

                default:
                    System.out.println("Not valid option");
            }

        } while (option != 4);
    }
}

import java.util.ArrayList;
import java.util.List;

public class Undo {

    private static Undo instance;
    private List<String> orders;

    private Undo() {

        orders = new ArrayList<>();
    }

    public static Undo getInstance() {
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }

    public void addOrder(String order) {
        orders.add(order);
        System.out.println("New order added: " + order);
    }

    public void undoOrder() {

        if (orders.isEmpty()) {
            System.out.println("There is no order to delete");
        } else {
            orders.remove(orders.size() - 1);
            System.out.println("Last order was deleted");
        }
    }

    public void listOrders() {
        if (orders.isEmpty()) {
            System.out.println("There are not orders to show");
        } else {
            for (int i = 0; i < orders.size(); i++) {
                System.out.println((i + 1) + ". " + orders.get(i));
            }
        }
    }

}

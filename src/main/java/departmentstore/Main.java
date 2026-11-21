package departmentstore;

import departmentstore.controller.StoreController;
import departmentstore.view.ConsoleView;

/**
 * Starting point of the program.
 */
public class Main {

    public static void main(String[] args) {
        ConsoleView view = new ConsoleView();
        StoreController controller = new StoreController(view);
        controller.run();
    }
}

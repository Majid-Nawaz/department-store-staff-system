package departmentstore.controller;

import departmentstore.view.ConsoleView;
import departmentstore.view.MenuOption;

/**
 * Controls the program flow - takes the menu choice from the view
 * and decides what to do with it.
 */
public class StoreController {

    private final ConsoleView view;

    public StoreController(ConsoleView view) {
        this.view = view;
    }

    public void run() {
        view.showMessage("=== Department Store Staff System ===");

        boolean running = true;
        while (running) {
            view.showMenu();
            MenuOption choice = view.readMenuChoice();
            view.showMessage(choice.getLabel() + " selected");

            switch (choice) {
                case SORT:
                    // sorting gets added here later
                    view.showMessage("Sort is coming soon.");
                    break;
                case SEARCH:
                    // searching gets added here later
                    view.showMessage("Search is coming soon.");
                    break;
                case ADD_RECORDS:
                    // adding new staff gets added here later
                    view.showMessage("Add records is coming soon.");
                    break;
                case BINARY_TREE:
                    // binary tree gets added here later
                    view.showMessage("Binary tree is coming soon.");
                    break;
                case EXIT:
                    view.showMessage("Goodbye!");
                    running = false;
                    break;
            }
        }
    }
}

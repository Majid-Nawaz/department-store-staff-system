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
        view.showWelcome();

        boolean running = true;
        while (running) {
            view.showMenu();
            MenuOption choice = view.readMenuChoice();
            view.showChoice(choice);

            switch (choice) {
                case SORT_NAMES:
                    view.showMessage("Sorting isn't available yet.");
                    break;
                case FIND_EMPLOYEE:
                    view.showMessage("Searching isn't available yet.");
                    break;
                case ADD_EMPLOYEE:
                    view.showMessage("Adding employees isn't available yet.");
                    break;
                case BUILD_HIERARCHY:
                    view.showMessage("The hierarchy tree isn't available yet.");
                    break;
                case QUIT:
                    view.showMessage("Closing Staff Hub. See you next time!");
                    running = false;
                    break;
            }
        }
    }
}

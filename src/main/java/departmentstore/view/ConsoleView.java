package departmentstore.view;

import java.util.Scanner;

/**
 * Handles everything the user sees and types in the terminal.
 */
public class ConsoleView {

    private final Scanner scanner = new Scanner(System.in);

    // print the menu by looping through the enum, so new options show up automatically
    public void showMenu() {
        System.out.println();
        System.out.println("Do You wish to SORT or SEARCH:");
        for (MenuOption option : MenuOption.values()) {
            System.out.println(option.getNumber() + ". " + option.getLabel());
        }
    }

    // keep asking until the user types a valid menu number
    public MenuOption readMenuChoice() {
        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine().trim();
            try {
                MenuOption choice = MenuOption.fromNumber(Integer.parseInt(input));
                if (choice != null) {
                    return choice;
                }
            } catch (NumberFormatException e) {
                // not a number, just fall through to the error message
            }
            System.out.println("Invalid choice, please enter a number from 1 to "
                    + MenuOption.values().length);
        }
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}

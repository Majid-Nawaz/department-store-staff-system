package departmentstore.view;

import java.util.Scanner;

/**
 * Handles everything the user sees and types in the terminal.
 */
public class ConsoleView {

    private final Scanner scanner = new Scanner(System.in);

    public void showWelcome() {
        System.out.println("==========================================");
        System.out.println("  Northgate Department Store - Staff Hub");
        System.out.println("==========================================");
    }

    // print the menu by looping through the enum, so new options show up automatically
    public void showMenu() {
        System.out.println();
        System.out.println("What would you like to do next?");
        for (MenuOption option : MenuOption.values()) {
            System.out.println("  [" + option.getNumber() + "] " + option.getLabel());
        }
    }

    // keep asking until the user types a valid menu number
    public MenuOption readMenuChoice() {
        while (true) {
            System.out.print("Your choice: ");
            String input = scanner.nextLine().trim();
            try {
                MenuOption choice = MenuOption.fromNumber(Integer.parseInt(input));
                if (choice != null) {
                    return choice;
                }
            } catch (NumberFormatException e) {
                // not a number, just fall through to the error message
            }
            System.out.println("That option doesn't exist. Type a number from "
                    + MenuOption.lowestNumber() + " to " + MenuOption.highestNumber() + ".");
        }
    }

    public void showChoice(MenuOption choice) {
        System.out.println("-> " + choice.getLabel());
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}

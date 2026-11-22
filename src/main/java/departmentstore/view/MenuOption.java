package departmentstore.view;

/**
 * All the options on the main menu.
 * Each option has the number the user types and the text shown on screen.
 */
public enum MenuOption {
    SORT_NAMES(1, "Sort staff names (A-Z)"),
    FIND_EMPLOYEE(2, "Find an employee"),
    ADD_EMPLOYEE(3, "Add a new employee"),
    BUILD_HIERARCHY(4, "Build the staff hierarchy tree"),
    QUIT(5, "Quit");

    private final int number;
    private final String label;

    MenuOption(int number, String label) {
        this.number = number;
        this.label = label;
    }

    public int getNumber() {
        return number;
    }

    public String getLabel() {
        return label;
    }

    // find the option that matches the number the user typed, null if none match
    public static MenuOption fromNumber(int number) {
        for (MenuOption option : values()) {
            if (option.number == number) {
                return option;
            }
        }
        return null;
    }

    // smallest and biggest valid numbers, so the error message never needs hardcoding
    public static int lowestNumber() {
        return values()[0].number;
    }

    public static int highestNumber() {
        return values()[values().length - 1].number;
    }
}

package departmentstore.view;

/**
 * All the options on the main menu.
 * Each option has the number the user types and the text shown on screen.
 */
public enum MenuOption {
    SORT(1, "SORT"),
    SEARCH(2, "SEARCH"),
    ADD_RECORDS(3, "ADD RECORDS"),
    BINARY_TREE(4, "Create a binary tree"),
    EXIT(5, "EXIT");

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
}

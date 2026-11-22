package departmentstore.model;

/**
 * All the departments in the store.
 * Only these are allowed, so nobody can be put in a department that doesn't exist.
 */
public enum Department {
    WOMENSWEAR("Womenswear"),
    MENSWEAR("Menswear"),
    KIDSWEAR("Kidswear"),
    BEAUTY("Beauty"),
    ELECTRONICS("Electronics"),
    HOME_AND_FURNITURE("Home & Furniture"),
    FOOD_HALL("Food Hall"),
    CUSTOMER_SERVICE("Customer Service"),
    HR("HR"),
    FINANCE("Finance"),
    OPERATIONS("Operations");

    private final String label;

    Department(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    // turns text like "food hall" into FOOD_HALL, ignores case and extra spaces
    // returns null if the department doesn't exist
    public static Department fromLabel(String text) {
        if (text == null) {
            return null;
        }
        String cleaned = text.trim();
        for (Department department : values()) {
            if (department.label.equalsIgnoreCase(cleaned)) {
                return department;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return label;
    }
}

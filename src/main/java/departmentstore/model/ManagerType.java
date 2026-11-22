package departmentstore.model;

/**
 * The manager types used in the store, listed from most senior to least senior.
 * The order matters - it ranks staff by seniority.
 */
public enum ManagerType {
    STORE_MANAGER("Store Manager"),
    SENIOR_MANAGER("Senior Manager"),
    DEPARTMENT_MANAGER("Department Manager"),
    ASSISTANT_MANAGER("Assistant Manager"),
    TEAM_LEAD("Team Lead"),
    STAFF("Staff");

    private final String label;

    ManagerType(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    // turns text like "team lead" into TEAM_LEAD, ignores case and extra spaces
    // returns null if the text isn't a real manager type
    public static ManagerType fromLabel(String text) {
        if (text == null) {
            return null;
        }
        String cleaned = text.trim();
        for (ManagerType type : values()) {
            if (type.label.equalsIgnoreCase(cleaned)) {
                return type;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return label;
    }
}

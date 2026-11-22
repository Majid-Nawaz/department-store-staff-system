package departmentstore.model;

/**
 * One member of staff in the store.
 * Only keeps the details the program actually needs: name, manager type and department.
 */
public class Employee {

    private final String name;
    private final ManagerType managerType;
    private final Department department;

    public Employee(String name, ManagerType managerType, Department department) {
        // don't let a broken record into the list
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Employee name can't be empty");
        }
        if (managerType == null) {
            throw new IllegalArgumentException("Manager type is missing for " + name);
        }
        if (department == null) {
            throw new IllegalArgumentException("Department is missing for " + name);
        }
        // tidy up extra spaces, e.g. "  Kate   Summer " -> "Kate Summer"
        this.name = name.trim().replaceAll("\\s+", " ");
        this.managerType = managerType;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public ManagerType getManagerType() {
        return managerType;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return name + " | " + managerType.getLabel() + " | " + department.getLabel();
    }
}

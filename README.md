# Department Store Staff System

A Java console application for managing employee records in a department store. It reads staff data from a text file and lets the user sort, search, add new employees, and view the staff hierarchy as a binary tree, all through an enum-driven terminal menu.

> **Status:** in development

## Features

- Sort staff names alphabetically and display the first 20
- Search for an employee by name and return their manager type and department
- Add new employees with a validated manager type and department
- Build an employee hierarchy as a binary tree (level-order insertion), showing tree height and node count
- Menu options defined with a Java `enum`

## Project Structure

The code follows the Model-View-Controller (MVC) pattern.

```
src/main/java/departmentstore/
├── Main.java      # entry point
├── model/         # employee data, enums, sorting, searching, binary tree
├── view/          # terminal input/output and menu enum
└── controller/    # connects the view to the model
```

## Requirements

- JDK 8 or later
- Apache Maven
- Apache NetBeans (optional)

## Getting Started

### NetBeans

1. Clone the repository.
2. Open it with **File > Open Project**.
3. Run the project (**F6**).

### Command line

```bash
mvn compile exec:java
```

## Usage

Choose an option by typing its number:

```
Do You wish to SORT or SEARCH:
1. SORT
2. SEARCH
3. ADD RECORDS
4. Create a binary tree
5. EXIT
```

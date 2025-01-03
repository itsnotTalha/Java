public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
        displayMenu();
        int choice = getIntegerInput(scanner, "Enter your choice: ", 1, 6);

        switch (choice) {
            case 1:
                addRecord(scanner);
                break;
            case 2:
                deleteRecord(scanner);
                break;
            case 3:
                updateRecord(scanner);
                break;
            case 4:
                printRecords(scanner);
                break;
            case 5:
                searchRecords(scanner); // Ensure the method is implemented for searching.
                break;
            case 6:
                System.out.println("Exiting the University Management System. Goodbye!");
                scanner.close();
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}

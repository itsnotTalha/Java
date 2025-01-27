import java.util.ArrayList;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<University> universities = new ArrayList<>();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add University");
            System.out.println("2. Sort Universities by Establishment Year (Descending)");
            System.out.println("3. Display UGC Approved Universities");
            System.out.println("4. Display Universities Where Politics Is Not Allowed");
            System.out.println("5. Search Universities by Address");
            System.out.println("6. Display All Universities");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Choose Type of University:");
                    System.out.println("1. Public University");
                    System.out.println("2. Private University");
                    System.out.print("Enter your choice: ");
                    int type = scanner.nextInt();
                    scanner.nextLine();
                    if (type == 1) {
                        universities.add(createPublicUniversity(scanner));
                    } else if (type == 2) {
                        universities.add(createPrivateUniversity(scanner));
                    } else {
                        System.out.println("Invalid choice!");
                    }
                    break;
                case 2:
                    Collections.sort(universities);
                    System.out.println("\nUniversities sorted by establishment year (descending):");
                    for (University i : universities) {
                        System.out.println(i);
                    }
                    break;
                case 3:
                    System.out.println("\nUGC Approved Universities:");
                    for (University university : universities) {
                        if (university instanceof PrivateUniversity
                                && ((PrivateUniversity) university).isUgcApproved()) {
                            System.out.println(university);
                        }
                    }
                    break;
                case 4:
                    System.out.println("\nUniversities where politics is not allowed:");
                    for (University university : universities) {
                        if (university instanceof PublicUniversity
                                && !((PublicUniversity) university).isPoliticsAllowed()) {
                            System.out.println(university);
                        }
                    }
                    break;
                case 5:
                    System.out.print("\nEnter an address to search for universities: ");
                    String searchAddress = scanner.nextLine();
                    System.out.println("\nUniversities at " + searchAddress + ":");
                    for (University university : universities) {
                        if (university.getAddress().equalsIgnoreCase(searchAddress)) {
                            System.out.println(university);
                        }
                    }
                    break;
                case 6:
                    System.out.println("\nDetailed Information of All Universities:");
                    for (University university : universities) {
                        System.out.println(university);
                    }
                    break;
                case 7:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

    private static PublicUniversity createPublicUniversity(Scanner scanner) {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("Establishment Year: ");
        int year = scanner.nextInt();
        System.out.print("Establishment Month: ");
        int month = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Establishment Day: ");
        int day = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Number of Departments: ");
        int departments = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Number of Halls: ");
        int halls = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Politics Allowed (true/false): ");
        boolean politics = scanner.nextBoolean();
        scanner.nextLine();
        return new PublicUniversity(name, address, year, month, day, departments, halls, politics);
    }

    private static PrivateUniversity createPrivateUniversity(Scanner scanner) {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("Establishment Year: ");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Establishment Month: ");
        int month = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Establishment Day: ");
        int day = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Number of Departments: ");
        int departments = scanner.nextInt();
        scanner.nextLine();
        System.out.print("UGC Approved (true/false): ");
        boolean ugc = scanner.nextBoolean();
        scanner.nextLine();
        System.out.print("Number of Trustee Members: ");
        int trustees = scanner.nextInt();
        scanner.nextLine();
        return new PrivateUniversity(name, address, year, month, day, departments, ugc, trustees);
    }
}
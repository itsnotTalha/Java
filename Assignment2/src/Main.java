import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            System.out.println("Enter name: ");
            String name = scan.nextLine();

            String id;
            while (true) {
                System.out.println("Enter ID: ");
                id = scan.nextLine();
                boolean exists = false;

                for (Employee emp : employees) {
                    if (emp.getId().equals(id)) {
                        exists = true;
                        System.out.println("ID already exists. Please try again.");
                        break;
                    }
                }
                if (!exists) break;
            }

            try {
                System.out.println("Enter date of birth (day): ");
                int day = scan.nextInt();
                System.out.println("Enter month of birth (1-12): ");
                int month = scan.nextInt();
                System.out.println("Enter year of birth: ");
                int year = scan.nextInt();
                scan.nextLine(); // Consume the newline left by nextInt()

                double salary, hour;
                if (i < 3) {
                    System.out.println("Monthly Salary: ");
                    salary = scan.nextDouble();
                    scan.nextLine(); // Consume the newline left by nextDouble()
                    employees.add(new FulltimeEmployee(name, id, salary, year, month, day));

                } else {
                    System.out.println("Hours Worked: ");
                    hour = scan.nextDouble();
                    System.out.println("Hourly Rate: ");
                    salary = scan.nextDouble();
                    scan.nextLine(); // Consume the newline left by nextDouble()
                    employees.add(new ParttimeEmployee(name, id, hour, salary, year, month, day));
                }
            } catch (InputMismatchException e) {
                System.out.println("Input format mismatched. Please try again.");
                scan.nextLine(); // Consume invalid input
                i--;
            }
        }

        // Sort employees by salary
        employees.sort(Comparator.comparing(Employee::getSalary));

        // Display all employees
        for (Employee emp : employees) {
            if (emp instanceof ParttimeEmployee) {
                System.out.println("Part-time Employee:");
            } else {
                System.out.println("Full-time Employee:");
            }
            emp.details();
        }

        // Search employees by birth year
        System.out.println("Enter Birth Year to search: ");
        int searchYear = scan.nextInt();
        boolean found = false;

        for (Employee emp : employees) {
            if (emp.getDateOfBirth().get(Calendar.YEAR) == searchYear) {
                emp.details();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No employees found with birth year: " + searchYear);
        }

        scan.close();
    }
}

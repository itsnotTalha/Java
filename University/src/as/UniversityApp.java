package as;

import java.util.Scanner;

public class UniversityApp {
    private static final int MAX_STUDENTS = 100;
    private static final int MAX_COURSES = 50;
    private static final int MAX_FACULTIES = 20;

    private static Student[] students = new Student[MAX_STUDENTS];
    private static Course[] courses = new Course[MAX_COURSES];
    private static Faculty[] faculties = new Faculty[MAX_FACULTIES];
    private static int studentCount = 0;
    private static int courseCount = 0;
    private static int facultyCount = 0;

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
                    searchRecords(scanner);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
            }
        }
    }
    private static void searchRecords(Scanner scanner) {
        System.out.println("What do you want to search for?");
        System.out.println("1. Student");
        System.out.println("2. Course");
        System.out.println("3. Faculty");
        int choice = getIntegerInput(scanner, "Enter your choice: ", 1, 3);

        switch (choice) {
            case 1:
                searchStudent(scanner);
                break;
            case 2:
                searchCourse(scanner);
                break;
            case 3:
                searchFaculty(scanner);
                break;
        }
    }

    private static void searchStudent(Scanner scanner) {
        int studentId = getIntegerInput(scanner, "Enter student ID to search: ", 1, Integer.MAX_VALUE);
        int index = findStudentIndex(studentId);
        if (index != -1) {
            System.out.println(students[index]);
        } else {
            System.out.println("Student not found.");
        }
    }

    private static void searchCourse(Scanner scanner) {
        String courseId = getStringInput(scanner, "Enter course ID to search: ");
        int index = findCourseIndex(courseId);
        if (index != -1) {
            System.out.println(courses[index]);
        } else {
            System.out.println("Course not found.");
        }
    }

    private static void searchFaculty(Scanner scanner) {
        int facultyId = getIntegerInput(scanner, "Enter faculty ID to search: ", 1, Integer.MAX_VALUE);
        int index = findFacultyIndex(facultyId);
        if (index != -1) {
            System.out.println(faculties[index]);
        } else {
            System.out.println("Faculty not found.");
        }
    }

    private static void displayMenu() {
        System.out.println("\nUniversity Management System");
        System.out.println("1. Add");
        System.out.println("2. Delete");
        System.out.println("3. Update");
        System.out.println("4. Print");
        System.out.println("5. Search");
        System.out.println("6. Exit");
    }

    private static void addRecord(Scanner scanner) {
        System.out.println("What do you want to add?");
        System.out.println("1. Student");
        System.out.println("2. Course");
        System.out.println("3. Faculty");
        int choice = getIntegerInput(scanner, "Enter your choice: ", 1, 3);

        switch (choice) {
            case 1:
                addStudent(scanner);
                break;
            case 2:
                addCourse(scanner);
                break;
            case 3:
                addFaculty(scanner);
                break;
        }
    }

    private static void addStudent(Scanner scanner) {
        if (studentCount >= MAX_STUDENTS) {
            System.out.println("Student array is full.");
            return;
        }
        int studentId = getIntegerInput(scanner, "Enter student ID: ", 1, Integer.MAX_VALUE);
        String studentName = getStringInput(scanner, "Enter student name: ");
        double studentCGPA = getDoubleInput(scanner, "Enter student CGPA: ", 0, 4.0);
        students[studentCount++] = new Student(studentId, studentName, studentCGPA);
        System.out.println("Student added successfully.");
    }

    private static void addCourse(Scanner scanner) {
        if (courseCount >= MAX_COURSES) {
            System.out.println("Course array is full.");
            return;
        }
        String courseId = getStringInput(scanner, "Enter course ID: ");
        String courseTitle = getStringInput(scanner, "Enter course title: ");
        double credit = getDoubleInput(scanner, "Enter credit hours: ", 0, Double.MAX_VALUE);
        courses[courseCount++] = new Course(courseId, courseTitle, credit);
        System.out.println("Course added successfully.");
    }

    private static void addFaculty(Scanner scanner) {
        if (facultyCount >= MAX_FACULTIES) {
            System.out.println("Faculty array is full.");
            return;
        }
        int facultyId = getIntegerInput(scanner, "Enter faculty ID: ", 1, Integer.MAX_VALUE);
        String facultyName = getStringInput(scanner, "Enter faculty name: ");
        String facultyPosition = getStringInput(scanner, "Enter faculty position: ");
        faculties[facultyCount++] = new Faculty(facultyId, facultyName, facultyPosition);
        System.out.println("Faculty added successfully.");
    }

    private static void deleteRecord(Scanner scanner) {
        System.out.println("What do you want to delete?");
        System.out.println("1. Student");
        System.out.println("2. Course");
        System.out.println("3. Faculty");
        int choice = getIntegerInput(scanner, "Enter your choice: ", 1, 3);

        switch (choice) {
            case 1:
                deleteStudent(scanner);
                break;
            case 2:
                deleteCourse(scanner);
                break;
            case 3:
                deleteFaculty(scanner);
                break;
        }
    }

    private static void deleteStudent(Scanner scanner) {
        int studentId = getIntegerInput(scanner, "Enter student ID to delete: ", 1, Integer.MAX_VALUE);
        int index = findStudentIndex(studentId);
        if (index != -1) {
            removeStudentFromCourses(studentId);
            System.arraycopy(students, index + 1, students, index, studentCount - index - 1);
            students[--studentCount] = null;
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    private static void deleteCourse(Scanner scanner) {
        String courseId = getStringInput(scanner, "Enter course ID to delete: ");
        int index = findCourseIndex(courseId);
        if (index != -1) {
            System.arraycopy(courses, index + 1, courses, index, courseCount - index - 1);
            courses[--courseCount] = null;
            System.out.println("Course deleted successfully.");
        } else {
            System.out.println("Course not found.");
        }
    }

    private static void deleteFaculty(Scanner scanner) {
        int facultyId = getIntegerInput(scanner, "Enter faculty ID to delete: ", 1, Integer.MAX_VALUE);
        int index = findFacultyIndex(facultyId);
        if (index != -1) {
            removeFacultyFromCourses(facultyId);
            System.arraycopy(faculties, index + 1, faculties, index, facultyCount - index - 1);
            faculties[--facultyCount] = null;
            System.out.println("Faculty deleted successfully.");
        } else {
            System.out.println("Faculty not found.");
        }
    }

    private static void updateRecord(Scanner scanner) {
        System.out.println("What do you want to update?");
        System.out.println("1. Student");
        System.out.println("2. Course");
        System.out.println("3. Faculty");
        int choice = getIntegerInput(scanner, "Enter your choice: ", 1, 3);

        switch (choice) {
            case 1:
                updateStudent(scanner);
                break;
            case 2:
                updateCourse(scanner);
                break;
            case 3:
                updateFaculty(scanner);
                break;
        }
    }

    private static void updateStudent(Scanner scanner) {
        int studentId = getIntegerInput(scanner, "Enter student ID to update: ", 1, Integer.MAX_VALUE);
        int index = findStudentIndex(studentId);
        if (index != -1) {
            String newName = getStringInput(scanner, "Enter new name: ");
            double newCGPA = getDoubleInput(scanner, "Enter new CGPA: ", 0, 4.0);
            students[index].setStudentName(newName);
            students[index].setStudentCGPA(newCGPA);
            System.out.println("Student updated successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    private static void updateCourse(Scanner scanner) {
        String courseId = getStringInput(scanner, "Enter course ID to update: ");
        int index = findCourseIndex(courseId);
        if (index != -1) {
            String newTitle = getStringInput(scanner, "Enter new title: ");
            double newCredit = getDoubleInput(scanner, "Enter new credit hours: ", 0, Double.MAX_VALUE);
            courses[index].setCourseTitle(newTitle);
            courses[index].setCredit(newCredit);
            System.out.println("Course updated successfully.");
        } else {
            System.out.println("Course not found.");
        }
    }

    private static void updateFaculty(Scanner scanner) {
        int facultyId = getIntegerInput(scanner, "Enter faculty ID to update: ", 1, Integer.MAX_VALUE);
        int index = findFacultyIndex(facultyId);
        if (index != -1) {
            String newName = getStringInput(scanner, "Enter new name: ");
            String newPosition = getStringInput(scanner, "Enter new position: ");
            faculties[index].setFacultyName(newName);
            faculties[index].setFacultyPosition(newPosition);
            System.out.println("Faculty updated successfully.");
        } else {
            System.out.println("Faculty not found.");
        }
    }

    private static void printRecords(Scanner scanner) {
        System.out.println("What do you want to print?");
        System.out.println("1. Students");
        System.out.println("2. Courses");
        System.out.println("3. Faculty");
        int choice = getIntegerInput(scanner, "Enter your choice: ", 1, 3);

        switch (choice) {
            case 1:
                printStudents();
                break;
            case 2:
                printCourses();
                break;
            case 3:
                printFaculty();
                break;
        }
    }

    private static void printStudents() {
        if (studentCount == 0) {
            System.out.println("No students to display.");
            return;
        }
        for (int i = 0; i < studentCount; i++) {
            System.out.println(students[i]);
        }
    }

    private static void printCourses() {
        if (courseCount == 0) {
            System.out.println("No courses to display.");
            return;
        }
        for (int i = 0; i < courseCount; i++) {
            System.out.println(courses[i]);
        }
    }

    private static void printFaculty() {
        if (facultyCount == 0) {
            System.out.println("No faculty members to display.");
            return;
        }
        for (int i = 0; i < facultyCount; i++) {
            System.out.println(faculties[i]);
        }
    }

    private static int getIntegerInput(Scanner scanner, String prompt, int min, int max) {
        int value;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                if (value >= min && value <= max) {
                    return value;
                }
            }
            scanner.nextLine(); // Clear invalid input
            System.out.println("Invalid input. Please enter a number between " + min + " and " + max + ".");
        }
    }

    private static double getDoubleInput(Scanner scanner, String prompt, double min, double max) {
        double value;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                value = scanner.nextDouble();
                if (value >= min && value <= max) {
                    return value;
                }
            }
            scanner.nextLine(); // Clear invalid input
            System.out.println("Invalid input. Please enter a number between " + min + " and " + max + ".");
        }
    }

    private static String getStringInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.next();
    }

    private static int findStudentIndex(int studentId) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getStudentId() == studentId) {
                return i;
            }
        }
        return -1;
    }

    private static int findCourseIndex(String courseId) {
        for (int i = 0; i < courseCount; i++) {
            if (courses[i].getCourseId().equals(courseId)) {
                return i;
            }
        }
        return -1;
    }

    private static int findFacultyIndex(int facultyId) {
        for (int i = 0; i < facultyCount; i++) {
            if (faculties[i].getFacultyId() == facultyId) {
                return i;
            }
        }
        return -1;
    }

    private static void removeStudentFromCourses(int studentId) {
        // Implementation for removing a student from all associated courses
    }

    private static void removeFacultyFromCourses(int facultyId) {
        // Implementation for removing a faculty member from all associated courses
    }
}

class Student {
    private int studentId;
    private String studentName;
    private double studentCGPA;

    public Student(int studentId, String studentName, double studentCGPA) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentCGPA = studentCGPA;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentCGPA(double studentCGPA) {
        this.studentCGPA = studentCGPA;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId + ", Name: " + studentName + ", CGPA: " + studentCGPA;
    }
}

class Course {
    private String courseId;
    private String courseTitle;
    private double credit;

    public Course(String courseId, String courseTitle, double credit) {
        this.courseId = courseId;
        this.courseTitle = courseTitle;
        this.credit = credit;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "Course ID: " + courseId + ", Title: " + courseTitle + ", Credit: " + credit;
    }
}

class Faculty {
    private int facultyId;
    private String facultyName;
    private String facultyPosition;

    public Faculty(int facultyId, String facultyName, String facultyPosition) {
        this.facultyId = facultyId;
        this.facultyName = facultyName;
        this.facultyPosition = facultyPosition;
    }

    public int getFacultyId() {
        return facultyId;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public void setFacultyPosition(String facultyPosition) {
        this.facultyPosition = facultyPosition;
    }

    @Override
    public String toString() {
        return "Faculty ID: " + facultyId + ", Name: " + facultyName + ", Position: " + facultyPosition;
    }
}

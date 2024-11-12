public class Data {
    public String name;
    public String id;
    public Double grade = 0.0;
    public Double credit = 0.0;
    public String[] subjects = new String[]{"A", "B", "C", "D"};

    public void calculate(double gpa, double cr) {
        double gradePoints = gpa * cr;
        grade += gradePoints;
        credit += cr;
    }

    public double cgpa() {
        if (credit == 0) {
            return 0.0;
        }
        return (grade / credit);
    }

    public void getGrade() {
        if (cgpa() > 4.0 || cgpa() < 0.0) {
            System.out.println("Error: Invalid grade.");
        } else if (cgpa() == 4.00) {
            System.out.println("A");
        } else if (cgpa() >= 3.67) {
            System.out.println("A-");
        } else if (cgpa() >= 3.33) {
            System.out.println("B+");
        } else if (cgpa() >= 3.00) {
            System.out.println("B");
        } else if (cgpa() >= 2.67) {
            System.out.println("B-");
        } else if (cgpa() >= 2.33) {
            System.out.println("C+");
        } else if (cgpa() >= 2.00) {
            System.out.println("C");
        } else if (cgpa() >= 1.67) {
            System.out.println("C-");
        } else if (cgpa() >= 1.33) {
            System.out.println("D+");
        } else if (cgpa() >= 1.00) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }


    public void display() {
        System.out.println("Information of " + name);
        System.out.println("ID: " + id);
        System.out.println("Completed credit: " + credit);
        System.out.println("CGPA: " + cgpa());
        System.out.print("Your obtained grade is: ");
        getGrade();
    }
}

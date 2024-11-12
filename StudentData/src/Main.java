import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 2;
        System.out.print("Amount of students: ");
        n = scan.nextInt();
        Data[] student = new Data[n];
        for (int i = 0; i < n; i++) {
            student[i] = new Data();
            int sub;
            System.out.print("Enter Student " + (i + 1) + " name: ");
            scan.nextLine();
            student[i].name = scan.nextLine();
            System.out.print("Enter Student " + (i + 1) + " ID: ");
            student[i].id = scan.next();
            System.out.print("Enter amount of subjects: ");
            sub = scan.nextInt();
            for (int j = 0; j < sub; j++) {
                if (sub > student[i].subjects.length) {
                    break;
                }
                System.out.println("Enter GPA and credit for subject " + student[i].subjects[j]);
                student[i].calculate(scan.nextDouble(), scan.nextDouble());
            }
            System.out.println("Added successfully.");
        }
        String search;
        System.out.print("Enter your ID: ");
        search = scan.next();
        for (Data data : student) {
            if (search.equals(data.id)) {
                data.display();
            }
        }
    }
}
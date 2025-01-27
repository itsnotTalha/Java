public class Main {
    public static void main(String[] args) {
        UndergraduateStudent s1 = new UndergraduateStudent("Talha", "100", 90,80,100);
        UndergraduateStudent s2 = new UndergraduateStudent("Jubayer", "101", 80,68,70);
        UndergraduateStudent s3 = new UndergraduateStudent("Muhit", "101", 100,48,87);

        s1.calculateAverage();
        s1.generateGrade();
        s1.printDetails();

        s2.calculateAverage();
        s2.generateGrade();
        s2.printDetails();

        s3.calculateAverage();
        s3.generateGrade();
        s3.printDetails();

        s1.saveRecordToFile();
        s2.saveRecordToFile();
        s3.saveRecordToFile();

    }
}
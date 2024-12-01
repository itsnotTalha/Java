public class Person{
    private String nome;
    private String national_id;

    public void Display(){
        System.out.println("Name: "+this.nome);
        System.out.println("NationalId: "+this.national_id);
    }
//getter method
    public String getNome() {
        return nome;
    }

    public String getNational_id() {
        return national_id;
    }
    //constructor
    public Person(String nome, String national_id) {
        this.nome = nome;
        this.national_id = national_id;
    }
}
class Student extends Person{
     private int studentID;
     private double gpa;
     //constructor
     public Student(String nome, String national_id, int studentID, double gpa) {
         super(nome, national_id);
         this.studentID = studentID;
         this.gpa = gpa;
     }

     public void Display(){
         super.Display();//not necessary here
         System.out.println("Name: "+getNome());
         System.out.println("NationalId: "+getNational_id());
         System.out.println("StudentID: "+studentID);
         System.out.println("GPA: "+gpa);
     }
}

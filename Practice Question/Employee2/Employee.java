package Newp;

public class Employee {
    public String name;
    public String year;
    public String address;

    public Employee(String name, String year, String address){
        this.name=name;
        this.year=year;
        this.address=address;
    }
    public void Display(){
        System.out.println(name+"\t"+year+"\t"+address);
    }

    public static void main(String[] args) {
        Employee [] emp = new Employee[4];
        emp[0]=new Employee("Rahul", "1994", "Tilak Nagar, New Delhi");
        emp[1]= new Employee("Raman", "2000", "Hari Nagar, New Delhi");
        emp[2]= new Employee("Rohit", "1999", "Subash Nagar, New Delhi");
        emp[3]= new Employee("Raman", "2000", "Hari Nagar, New Delhi");
        System.out.println("Name\tYear\tAddress");
        for(Employee x:emp){
            x.Display();
        }
    }
}

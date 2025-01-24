import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class Employee {
    private String name;
    private String id;
    Calendar dateOfBirth=null;

    public Employee(int year, int month, int day){
        this.dateOfBirth = Calendar.getInstance();
        this.dateOfBirth.set(year,month-1,day);
    }
    public Employee(){}

    public void details(){
        System.out.println("Name: "+ name);
        System.out.println("ID: "+id);
        System.out.println("Date of Birth: " +getFormattedDateOfBirth());
    }
    private String getFormattedDateOfBirth() {
        if (dateOfBirth == null) {
            return "Not set";
        }
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // Desired date format
        return sdf.format(dateOfBirth.getTime());
    }

    public abstract double getSalary();

    public void setId(String id) {
        this.id = id;
    }

    public void setDateOfBirth(Calendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Calendar getDateOfBirth() {
        return dateOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

}

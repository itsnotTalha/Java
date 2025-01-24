public class FulltimeEmployee extends Employee{
    private double monthlySalary;

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
    public FulltimeEmployee(String name, String id, double monthlySalary,int day, int month,int year){
        super(year,month,day);
        setName(name);
        setId(id);
        this.monthlySalary=monthlySalary;
    }

    public void details(){
        super.details();
        System.out.println("Monthly salary: "+monthlySalary);
    }

    public double getSalary() {
        return monthlySalary;
    }
}

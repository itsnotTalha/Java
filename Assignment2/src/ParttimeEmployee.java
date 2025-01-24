public class ParttimeEmployee extends Employee{
    private double hour;
    private double hourlyRate;

    public ParttimeEmployee(String name, String id, double hour, double hourlyRate,int day, int month,int year){
        super(year,month,day);
        setName(name);
        setId(id);
        setHour(hour);
        setHourlyRate(hourlyRate);
    }
    public void setHour(double hour) {
        this.hour = hour;
    }

    public void setHourlyRate(double h) {
        this.hourlyRate = h;
    }
    public void setHourlyRate(){
        hourlyRate=200;
    }

    public double getSalary(){
        return hour*hourlyRate;
    }
    public void details(){
        super.details();
        System.out.println("Worked hour: "+hour);
        System.out.println("Hourly Rate: "+hourlyRate);
        System.out.println("Salary: "+getSalary());
    }

}

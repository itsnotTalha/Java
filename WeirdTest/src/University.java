import java.text.SimpleDateFormat;
import java.util.*;
class University implements Comparable<University> {
    private String name;
    private String address;
    Calendar dateEstablished;
    private int numberOfDepartments;

    public University(String name, String address, int year, int month, int day, int numberOfDepartments) {
        this.name = name;
        this.address = address;
        this.dateEstablished = Calendar.getInstance();
        this.dateEstablished.set(year,month-1,day);
        this.numberOfDepartments = numberOfDepartments;
    }

    public String getFormattedDateEstablished() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        return formatter.format(dateEstablished.getTime());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateEstablished() {
        return getFormattedDateEstablished();
    }

    public void setDateEstablished(int year, int month, int day) {
        this.dateEstablished = Calendar.getInstance();
        this.dateEstablished.set(year,month-1,day);
    }

    public int getNumberOfDepartments() {
        return numberOfDepartments;
    }

    public void setNumberOfDepartments(int numberOfDepartments) {
        this.numberOfDepartments = numberOfDepartments;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Address: " + address + ", Established: " + getFormattedDateEstablished() + ", Departments: "
                + numberOfDepartments;
    }

    public int compareTo(University other) {
        return other.dateEstablished.getTime().compareTo(this.dateEstablished.getTime());
    }

}
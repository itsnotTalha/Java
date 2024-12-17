import java.util.Scanner;

public class Employee {
    Scanner scan = new Scanner(System.in);
    public int empno;
    public String ename;
    public double basic,hr,da;
    public double netpay;

    public double Calculate(){
        return basic+hr+da;
    }
    public void havedata(){
        System.out.println("Employee no: ");
        empno= scan.nextInt();
        System.out.println("Employee name: ");
        ename= scan.next();
        System.out.println("Basic: ");
        basic= scan.nextDouble();
        System.out.println("HR: ");
        hr= scan.nextDouble();
        System.out.println("Da: ");
        da= scan.nextDouble();
        netpay=Calculate();
    }
    public void displayData(){
        System.out.println("Employee no. "+empno);
        System.out.println("Employee name: "+ename);
        System.out.println("Netpay: "+netpay);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.havedata();
        e1.displayData();
    }
}

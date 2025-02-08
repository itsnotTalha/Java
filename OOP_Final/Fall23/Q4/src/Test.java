import java.util.ArrayList;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        ArrayList<Address> arr1 = new ArrayList<>();
        Address a1 = new Address("19/A","Dhanmondi","Dhaka",1209);
        Address a2 = new Address("2/A","Tejgaon","Dhaka",1215);
        Address a3 = new Address("65","Nirala","Khulna",9100);
        arr1.add(a1);
        arr1.add(a2);
        arr1.add(a3);
        Address a4 = new Address("215","Aamtola","Barishal",8200);
        Address a5 = new Address("36","Gulshan","Dhaka",1212);
        arr1.add(1,a4);
        arr1.add(2,a5);
        arr1.sort(Comparator.comparing(Address::getZip_code));
        arr1.remove(2);
        for(Address x : arr1){
            System.out.println(x.getZip_code());
        }
    }
}

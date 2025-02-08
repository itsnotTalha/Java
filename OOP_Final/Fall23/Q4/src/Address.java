public class Address {
    String building_number, area, city;
    int zip_code; Address(String building_number, String area, String city,int zip_code){
        this.building_number = building_number;
        this.area = area;
        this.city = city;
        this.zip_code = zip_code;
    }
    int getZip_code(){ return zip_code;
    }
}
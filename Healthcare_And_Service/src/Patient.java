public class Patient extends Storage{
    public Patient(String name, String age, String gender){
        pName=name;
        pAge=age;
        pGender=gender;
    }
    public void getDetails(){
        System.out.println("Name: "+pName);
        System.out.println("Age: "+pAge);
        System.out.println("Gender: "+pGender);
    }
    private void setMed(){

    }
}

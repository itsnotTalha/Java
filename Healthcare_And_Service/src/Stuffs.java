import java.util.Random;
    public class Stuffs extends Storage implements Hospital{

        private String serial;
        public void setSl()
        {
            this.serial=sl+new Random().nextInt(100);
        }
        public String getSerial()
        {
            return serial;
        }

        public void getDetails()
        {
            System.out.println("Stuff Name: "+sName);
            System.out.println("Gender: "+sGender);
            System.out.println("Serial: "+getSerial());
            System.out.println();
        }
         void assignGender(){
            switch(new Random().nextInt(2)){
                case 0:
                    sGender = "Male";
                    break;
                case 1:
                    sGender = "Female";
                    break;
                default:
                    sGender = "Sick";
            }
        }
        Stuffs()
        {
            setSl();

        }
        Stuffs(String name)
        {
            setSl();
            assignGender();
            sName=name;
        }
    }

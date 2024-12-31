import java.util.Random;
    public class Stuffs implements Hospital{
        private String name;
        private String gender;
        private String serial;
        public void setSl()
        {
            this.serial=sl+new Random().nextInt(100);
        }
        public String getSerial()
        {
            return serial;
        }

        public String getGender()
        {
            return gender;
        }
        public void setGender(String gender)
        {
            this.gender=gender;
        }
        public String getName()
        {
            return name;
        }
        public void setName(String name)
        {
            this.name=name;
        }
        public void getDetails()
        {
            System.out.println("Name: "+name);
            System.out.println("Gender: "+gender);
            System.out.println("Serial: "+getSerial());
        }
        Stuffs()
        {
            setSl();

        }
        Stuffs(String name,String gender)
        {
            setSl();
            this.name=name;
            this.gender=gender;
        }
    }

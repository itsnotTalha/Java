    import java.util.Random;
    import java.util.Scanner;

    public class HomePage extends Storage {
        static int c = 0;

       public static void main(String[] args) {
            boolean wheel = true;
           Scanner scan = new Scanner(System.in);

            Doctor[] list = new Doctor[10];
            Patient[] list1 = new Patient[10]; // List of patients
            Storage[] list2 = new Storage[10]; // List of staff (Stuffs)

            // Initializing doctors and staff
            for (int i = 0; i < list.length; i++) {
                list[i] = new Doctor(genRand(3), genRandDeg()); // Create a new Doctor and assign to the array
            }

            // Initialize Stuffs
            for (int i = 0; i < list2.length; i++) {
                list2[i] = new Stuffs(genRand(3)); // Assuming Stuffs constructor takes a String
            }

            // Create the Scanner object once, before entering the loop
            Patient currentPatient = null;
            System.out.println("\t\tWelcome to UIU Healthcare and Service");

            while (wheel) {
                int choice, temp;
                System.out.println("[1] Patient");
                System.out.println("[2] Doctor");
                System.out.println("[3] Staff");
                System.out.println("[0] Quit");
                System.out.print("Enter your choice: ");
                choice = scan.nextInt();

                // Consume the remaining newline character after nextInt()
                scan.nextLine(); // This is necessary to handle the input correctly

                switch (choice) {
                    case 1:
                        System.out.println("[1] Registration");
                        System.out.println("[2] Sign in");
                        System.out.print("Enter your choice: ");
                        temp = scan.nextInt();
                        scan.nextLine(); // Consume the newline

                        switch (temp) {
                            case 1:
                                Home.sign_up();
                                String name = Home.Name, age = Home.Age, gender = Home.Gender;
                                list1[c] = new Patient(name, age, gender);
                                if (list1[c].setPassID()) {
                                    System.out.println("Registration completed successfully");
                                    c++;
                                } else {
                                    System.out.println("Registration failed!");
                                }
                                break;
                            case 2:
                                boolean loggedIn = false;
                                Home.login();

                                for(int i=0; i<c;i++){
                                    assert list1[i] != null;
                                    if(list1[i].checkPass()){
                                        currentPatient= list1[i];
                                        loggedIn = true;
                                        break;
                                    }
                                }


                                if (loggedIn) {
                                    System.out.println("Welcome back " + currentPatient.pName);
                                    System.out.println("[1] Get Medical Report");
                                    System.out.println("[2] Current Health status");
                                    System.out.println("[3] Change ID & Password");
                                    temp = scan.nextInt();
                                    scan.nextLine(); // Consume the newline

                                    if (temp == 1) {
                                        if (currentPatient != null) {
                                            Doctor randomDoctor = list[new Random().nextInt(10)];
                                            currentPatient.getReport(randomDoctor); // Get report from a random doctor
                                        } else {
                                            System.out.println("No report available.");
                                        }
                                    }else if (temp==2) {
                                        String []str = {"Healthy", "Healthy but not that much", "Its getting dark"};
                                        System.out.println("Current status is: "+str[new Random().nextInt(str.length)]);
                                    }else if(temp==3){
                                        currentPatient.changePass();
                                    }
                                    else{
                                        System.out.println("Try again");
                                    }
                                }
                                else {
                                    System.out.println("Wrong credentials, try again.");
                                }
                                break;
                            default:
                                System.out.println("Something went wrong!");
                        }
                        break;
                    case 2:
                        System.out.println("-------------------------------------------------");
                        System.out.println("-----------------List of Doctors-----------------");
                        System.out.println("-------------------------------------------------");
                        for (Doctor x : list) {
                            x.getDetails();
                        }
                        break;
                    case 3:
                        System.out.println("-------------------------------------------------");
                        System.out.println("------------------List of Staff------------------");
                        System.out.println("-------------------------------------------------");
                        for (Storage x : list2) {
                            ((Stuffs) x).getDetails();
                        }
                        break;
                    case 0:
                        System.out.println("Quitting...");
                        wheel = false;
                        break;
                    default:
                        System.out.println("Invalid input!");
                }
            }

            // Close the scanner only after exiting the loop
            scan.close();
        }
        static String genRand(int length) {
            String[] s = {"Abdur", "Rahman", "Muhammad", "Talha", "Tanzim", "Shihab", "Raihan", "Rubiyat", "Ohi", "Jubayer"};
            StringBuilder rand = new StringBuilder();
            for (int i = 0; i <= new Random().nextInt(length); i++) {
                rand.append(s[new Random().nextInt(10)]).append(" ");
            }
            return rand.toString();
        }
        static String genRandDeg() {
            String[] s = {"MBBS","MD", "DO", "DDS", "DMD", "DVM", "PharmD", "PsyD", "PhD", "EdD", "DrPH", "DC", "DNP", "DSW", "DPT", "OTD", "AuD", "OD", "LLD", "JD", "MDiv"};
            return s[new Random().nextInt(s.length)];
        }
    }

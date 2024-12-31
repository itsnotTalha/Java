public class Storage {
    public String pName, pAge, pGender, pSerial;
    public String sName, sGender;
    public String dName, dDegree;
    private String password, user_ID;

    public void setUser_ID(String user_ID) {
        this.user_ID = user_ID;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser_ID() {
        return user_ID;
    }

    public String getPassword() {
        return password;
    }


}

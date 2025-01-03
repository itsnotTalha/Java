public class Faculty {
    public int facultyId;
    public String facultyName, facultyPosition;

    Faculty(){}
    Faculty(int facultyId, String facultyName, String facultyPosition){
        this.facultyId=facultyId;
        this.facultyName=facultyName;
        this.facultyPosition=facultyPosition;
    }

    public String toString() {
        return "Faculty ID: " + facultyId + ", Name: " + facultyName + ", Position: " + facultyPosition;
    }
}

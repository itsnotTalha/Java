    public class Courses {
        public String courseId;
        public String courseTitle;
        public double credit;
        public Student[] studentList;
        public int numberOfStudents;
        public Faculty faculty;
        static int c=0;
        public Courses() {}

        public Courses(String courseId, String courseTitle, double credit) {
            this.courseId = courseId;
            this.courseTitle = courseTitle;
            this.credit = credit;
        }
        public String toString() {
            return "Course ID: " + courseId + ", Title: " + courseTitle + ", Credit: " + credit + ", Faculty: " + (faculty != null ? faculty.toString() : "Not assigned");
        }
        public int countOcc(){
        int occupiedCount = 0;

            for (int i = 0; i < studentList.length; i++) {
            if (studentList[i] != null) {
                occupiedCount++;
            }
        }
            return occupiedCount;
        }

        public void addStudent(Student s){
            this.studentList[countOcc()]=s;
        }
    public void dropStudent(int ds){
        for ( int i=0; i<studentList.length; i++){
            if(i>=ds){
                studentList[i]=studentList[i++];
            }
        }
    }
    public void addFaculty(Faculty f){
            faculty = f;
    }
    public void dropFaculty(){
            faculty = null;
    }
    public void printStudent(){
        System.out.println(toString());
    }
}

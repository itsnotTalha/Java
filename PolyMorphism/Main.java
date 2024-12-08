public class Main {
    public static void main(String[] args) {
        CEO s1 = new CEO();
        CEO s2 = new MANAGER();
        CEO s3 = new SLAVE();

        s1.parent();

        s2.parent();
        ((MANAGER) s2).child();

        s3.parent();
        ((MANAGER) s3).child();
        ((SLAVE) s3).grandchild();

        ((MANAGER)s1).child();
    }
}
public class Main {
    public static void main(String[] args) {
        String Original = "Nigga Shakib Khan";
        char[] str = Original.toCharArray();
        char[] newArr = new char[Original.length()];
        //Changing indexes
        for (int i = 0; i < Original.length(); i++) {
            newArr[i] = str[(Original.length() - 1) - i];
        }
        //converting char Array to string
        String nStr = new String(newArr);
        //Checking if new string is equal to the original
        if (nStr.equals(Original)) {
            System.out.println("Palindrome.");
        } else {
            System.out.println("Not Palindrome.");
        }
    }
}
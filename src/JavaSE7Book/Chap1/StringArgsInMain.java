/*
absolute file path javac FileName.java //This is for compilation
java MainClassName.java args if any
 */
package JavaSE7Book.Chap1;

public class StringArgsInMain {
    public static void main(String[] args) {
        System.out.println("Test main method with Main Method"+args[0]);
        System.out.println("Test main method with Main Method"+args[2]);
    }

    public static void main(String args) {
        System.out.println("Test main method with String Method"+args);
    }

    public static void main(int i) {
        System.out.println("Test main method with Integer"+i);
    }
}

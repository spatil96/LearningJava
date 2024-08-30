package Basics;

public class SwapTwoStringWithoutUsingThirdVariable {
    public static void main(String[] args) {
        String str1 = "One";
        String str2 = "Two";
        System.out.println(" str1->" + str1 + "-<str2->" + str2 + "-<");
        str1 = str2 + str1;
        System.out.println("STR!-> "+str1);
        str2 = str1.substring(str2.length());
//        str2 = str1;
        System.out.println("STR2-> "+str2);
        str1 = str1.substring(0, (str1.length() - str2.length()));
        System.out.println(" str1->" + str1 + "-<str2->" + str2 + "-<");
    }
}

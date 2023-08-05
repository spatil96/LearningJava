package Basics;

public class EqualsAndEqualOperator {
    public static void main(String[] args) {
        String s1 = "Sumeet";
        String s2 = "Sumeet";
        String s3 = "SUMEET";
        System.out.println(s1==s2);//true since it's pointing to the same mmemory location
        System.out.println(s1==s3);//False since it's different variable in itself
        System.out.println(s1.equals(s2));//True - Will be equals since it checks only the memory address
        System.out.println(s1.equals(s3));//False - Since both the variable are different
        String s4 = new String("Sumeet");
        System.out.println(s1==s4); //false since the mem location is different for both
        System.out.println(s1.equals(s4)); //True as the value is same

    }
}

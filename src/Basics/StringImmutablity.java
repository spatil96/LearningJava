package Basics;

import java.io.Serializable;
import java.sql.SQLOutput;

public class StringImmutablity {
    public static void main(String[] args) {
        String s = "Sumeet";
        System.out.println(s);
        String p = "sumeet";
        System.out.println(p);
        p="Patil";
        System.out.println(p); //Patil as p is different
        System.out.println(s); // Sumeet as it is the same
    }
}

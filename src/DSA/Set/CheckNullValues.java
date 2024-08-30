package DSA.Set;

import java.util.HashSet;
import java.util.Set;

public class CheckNullValues {
    public static void main(String[] args) {
        Set s= new HashSet();
        s.add("");
        s.add("");
        s.add("");
        s.add("Sumeet");
        System.out.println(s);
        System.out.println(s.size());

    }
}

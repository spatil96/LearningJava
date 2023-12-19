package Basics.Collections.ListInterface;
import java.util.*;

public class IterateOverList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
            list.add("Sumeet");
            list.add(0,"Index 0");
            list.add(1, "Index10");
        list.forEach((temp)->{System.out.println(temp+"iterationUsingLambda");});
    }

}

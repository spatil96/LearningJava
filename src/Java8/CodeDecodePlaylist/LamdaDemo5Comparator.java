package Java8.CodeDecodePlaylist;

import java.util.*;

public class LamdaDemo5Comparator {
    public static void main(String[] args) {
        ArrayList<Double> al = new ArrayList<>();
        al.add(5.0d);
        al.add(6d);
        al.add(6d);
        for(int i=0; i<4;i++){
            al.add((Math.random()));
        }
        System.out.println(al);
//        Collections.sort(al); //Asc order
        Collections.sort(al, (o1, o2) -> (o1 > o2) ? -1 :
                (o1 < o2) ? 1 : 0);
        System.out.println(al);
        System.out.println("*********TREESET BELOW*************");
        TreeSet<Integer> h =
                new TreeSet<Integer>((o1, o2) -> (o1 > o2) ?
                        -1 : (o1 < o2) ? 1 : 0);
        h.add(850);
        h.add(235);
        h.add(1080);
        h.add(15);
        h.add(5);
        System.out.println("Elements of the TreeSet after" +
                " sorting are: " + h);
        System.out.println("*********TREESMAP BELOW*************");
        TreeMap<Integer, String> m =
                new TreeMap<Integer, String>((o1, o2) -> (o1 > o2) ?
                        -1 : (o1 < o2) ? 1 : 0);
        m.put(1, "Apple");
        m.put(4, "Mango");
        m.put(5, "Orange");
        m.put(2, "Banana");
        m.put(3, "Grapes");
        System.out.println("Elements of the TreeMap " +
                "after sorting are : " + m);

        TreeSet<String> ts= new TreeSet<>(Comparator.reverseOrder());
//        TreeSet<String> ts=new TreeSet<String>((aStr,bStr) -> bStr.compareTo(aStr));
//        TreeSet<String> ts= new TreeSet<>(Comparator.naturalOrder());
        // Add elements to the Treeset
        ts.add("A");
        ts.add("B");
        ts.add("Z");
        ts.add("D");
        ts.add("E");
        ts.add("F");
        ts.add("G");

        //Display the elements .
        for(String element : ts)
            System.out.println(element + "");

        System.out.println();

        TreeMap<Integer, String> mV = new TreeMap<>();
        mV.put(2, "Apple");
        mV.put(4, "Mango");
        mV.put(9, "Orange");
        mV.put(1, "Banana");
        mV.put(3, "Grapes");

        List<Map.Entry<Integer, String>> list = new ArrayList<>(mV.entrySet());
        Collections.sort(list, Comparator.comparing(Map.Entry::getValue));

        TreeMap<Integer, String> sortedByValues = new TreeMap<>();
        for (Map.Entry<Integer, String> entry : list) {
            sortedByValues.put(entry.getKey(), entry.getValue());
        }

        System.out.println("Elements of the TreeMap after sorting based on values are : " + sortedByValues);

    }
}

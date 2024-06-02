package OOPS.DataHiding;

import javax.xml.crypto.Data;

class DataMembers{
    private int number;
     String name;
     int[] arr;

    public DataMembers(String name, int[] arr) {
        this.name = name;
        this.arr = arr;
    }
}
public class DataHidingIMPL extends DataMembers {
    public DataHidingIMPL(String name, int[] arr) {
        super(name, arr);
    }

    public static void main(String[] args) {
        DataMembers dm = new DataMembers("Sumeet", new int[]{10,20});
//        dm.number; // Not able to access as it's private
        System.out.println(dm.name);
    }
}

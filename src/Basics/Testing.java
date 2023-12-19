package Basics;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Testing {
    //    public static void main(String[] args) {
//        List list = new ArrayList();
//        list.add(0,"A");
//        list.add(1,"B");
//        list.add(1,"C");
//        for(Object object: list) {
//            System.out.println(" " + object);
//        }
//    }
    public static void main(String[] args) {
        LocalDate local = LocalDate.of(2020, 3, 30);
        local = local.minusWeeks(4L);// -- minus and (– )will become + 4 weeks, So
        //output would be 2020-04-17
        System.out.println(local);
    }

}
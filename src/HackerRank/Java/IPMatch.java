package HackerRank.Java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class IPMatch {
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        //while(in.hasNext()){
                /*
                000.12.12.034
121.234.12.12
23.45.12.56
00.12.123.123123.123
122.23
Hello.IP
                */

        String IP = "121.234.12.12";
        System.out.println(IP.matches(new MyRegex().pattern));
        //}

    }
}

class MyRegex {
    String pattern = "(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])";

}
package DSA.Recursion.Level1;

import java.util.ArrayList;

public class StairPath {
    public static void main(String[] args) {
//        System.out.println(getStairPath(5));
        printStairPath(5,"");
    }
    private static ArrayList<String> getStairPath(int n){
        ArrayList<String> res = new ArrayList<>();
        if(n==0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }else if(n<0){
            ArrayList<String> bres = new ArrayList<>();
//            bres.add("");
            return bres;
        }
        ArrayList<String> path1 = getStairPath(n-1);
        ArrayList<String> path2 = getStairPath(n-2);
        ArrayList<String> path3 = getStairPath(n-3);
        for(String s: path1){
            res.add(s+1);
        }
        for(String s: path2){
            res.add(s+2);
        }
        for(String s: path3){
            res.add(s+3);
        }
        System.out.println(res.size());
        return res;
    }
    private static void printStairPath(int n, String ans){
        if(n<0){
            return;
        }
        if(n==0){
            System.out.println(ans);
            return;
        }
        printStairPath(n-1, ans+"1");
        printStairPath(n-2, ans+"2");
        printStairPath(n-3, ans+"3");
    }
}

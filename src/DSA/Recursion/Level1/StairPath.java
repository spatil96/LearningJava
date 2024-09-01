package DSA.Recursion.Level1;

import java.util.ArrayList;

public class StairPath {
    public static void main(String[] args) {
        System.out.println(getStairPath(5));
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
        for(String s: path2){
            res.add(s+3);
        }
        System.out.println(res.size());
        return res;
    }
}

package DSA.Recursion.Level1;

import java.util.ArrayList;

public class GetMazePaths {
    public static void main(String[] args) {
        System.out.println(getMazePaths(1,1,3,3));
    }
    private static ArrayList<String> getMazePaths
            (int sr, int sc, int dr, int dc){
        if(sr == dr && sc == dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> res = new ArrayList<>();
        ArrayList<String> hPath = new ArrayList<>();
        ArrayList<String> vPath = new ArrayList<>();
        if(sc<dc) {
            hPath = getMazePaths(sr, sc + 1, dr, dc);
        }
        if(sr<dr) {
            vPath = getMazePaths(sr + 1, sc, dr, dc);
        }
        for(String path : vPath){
            res.add("v"+path);
        }
        for(String path : hPath){
            res.add("h"+path);
        }
        return res;
    }
}

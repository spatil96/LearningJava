package DSA.Recursion.Level1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GetMazePaths {
    public static void main(String[] args) {
        System.out.println(getMazePaths(1,1,3,3));
        System.out.println(getMazePathsBFS(1,1,3,3));
    }
    //DFS
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

    //BFS
    static class Pair {
        int row, col;
        String path;

        Pair(int row, int col, String path) {
            this.row = row;
            this.col = col;
            this.path = path;
        }
    }
    private static ArrayList<String> getMazePathsBFS(
            int sr, int sc, int dr, int dc) {
        ArrayList<String> result = new ArrayList<>();
        Queue<Pair> queue = new LinkedList<>();

        // Start from the initial position with an empty path
        queue.add(new Pair(sr, sc, ""));

        // BFS loop
        while (!queue.isEmpty()) {
            Pair current = queue.poll();

            int row = current.row;
            int col = current.col;
            String path = current.path;

            // If we reach the destination, add the path to the result
            if (row == dr && col == dc) {
                result.add(path);
                continue;
            }

            // Move horizontally (right)
            if (col < dc) {
                queue.add(new Pair(row, col + 1, path + "h"));
            }

            // Move vertically (down)
            if (row < dr) {
                queue.add(new Pair(row + 1, col, path + "v"));
            }
        }

        return result;
    }
}

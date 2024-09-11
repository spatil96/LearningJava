package DSA.Recursion.Level1;

public class GetMazePathWithJumps {
    public static void main(String[] args) {
        printMazePathJumps(1,1,3,3,"");
    }
    private static void printMazePathJumps(
            int sr, int sc, int dr, int dc, String psf
    ){
        if(sr>dr || sc>dc){
            return;
        }
        if(sr == dr && sc == dc){
            System.out.println(psf);
            return;
        }
        printMazePathJumps(sr,sc+1,dr,dc, "v"+psf);
        printMazePathJumps(sr+1,sc,dr,dc, "h"+psf);
    }
}

package DSA.Recursion;

public class ZigZag {
    public static void main(String[] args) {
        pzz(2);
    }

    private static void pzz(int i) {
        if(i ==0){return;}
        System.out.println("Pre "+i);
        pzz(i-1);
        System.out.println("IN "+i);
        pzz((i-1));
        System.out.println("Post "+i);
    }

}

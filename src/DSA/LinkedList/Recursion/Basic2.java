package DSA.LinkedList.Recursion;

public class Basic2 {
    public static void main(String[] args) {
        pdi(5);
    }
    public static void pdi(int x){
        if(x==0){return;}
        System.out.println(x);
        pdi(x-1);
        System.out.println(x);
    }
}

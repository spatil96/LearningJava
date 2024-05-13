package DSA.Recursion;

public class ArrayReversePrint {
    public static void main(String[] args) {
      printASC(new int[]{10,20,30},0);
        System.out.println("--------------------------");
        printDSC(new int[]{10,20,30},0);
    }
    static void printASC(int[] x, int idx){
        if(idx == x.length){return;}
        System.out.println(x[idx]);
        printASC(x,idx+1);
    }
    static void printDSC(int[] x,int idx){
        if(idx == x.length){return;}
        printDSC(x,idx+1);
        System.out.println(x[idx]);
    }
}

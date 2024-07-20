package DSA.Recursion.Level1;

public class PrintDecreasing {
    public static void main(String[] args) {
        printDecreasing(5);
        printIncreasing(5);
        printASCandDSC(5);
    }
    public static void printDecreasing(int i){
        if(i==0){return;}
        System.out.println(i);
        printDecreasing(i-1);
    }
    public static void printIncreasing(int i){
        if(i==0){return;}
        printIncreasing(i-1);
        System.out.println(i);
    }
    public static void printASCandDSC(int i){
        if(i==0){return;}
        System.out.println(i);
        printASCandDSC(i-1);
        System.out.println(i);

    }
}

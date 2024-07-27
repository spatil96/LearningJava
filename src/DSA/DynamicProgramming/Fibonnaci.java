package DSA.DynamicProgramming;

public class Fibonnaci {
    public static void main(String[] args) {
//        System.out.println(fib(100));
        System.out.println(FibMemoized(100, new int[101]));
    }
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        System.out.println("Hello"+n);
        int fib1 = fib(n-1);
        int fib2 = fib(n-2);
        int ans = fib1+fib2;
        return ans;
    }
    public static int FibMemoized(int n, int[] qb){
        if(n==0||n==1){
            return n;
        }
        if(qb[n]!=0){
            return qb[n];
        }
        System.out.println("Hello"+n);
        int fibnm1 = FibMemoized(n-1,qb);
        int fibnm2 = FibMemoized(n-2,qb);
        int fibn = fibnm1+fibnm2;
        qb[n] = fibn;
        return fibn;
    }
}

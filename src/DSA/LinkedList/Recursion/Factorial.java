package DSA.LinkedList.Recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
    public static int factorial(int num){
        if(num==1){return 1;}
        int fac = num* factorial(num-1);
        int res = num*fac;
        return fac;
    }
}

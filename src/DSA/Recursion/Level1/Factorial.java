package DSA.Recursion.Level1;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    public static int factorial(int i){
        if(i==1){return 1;}
        return  factorial(i-1)* i;
//        return  i* factorial(i-1);// Both return are same

    }
}

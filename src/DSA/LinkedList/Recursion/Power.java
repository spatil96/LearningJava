package DSA.LinkedList.Recursion;

public class Power {
    public static void main(String[] args) {
        System.out.println(power(2,3));
    }
    public static int power(int x, int y){
        if(y==0){return 1;}

        int pow= power(x,y/2);
        int xn = pow * pow;

        if(y%2==1){xn = xn*x;}
        return xn;
    }
}

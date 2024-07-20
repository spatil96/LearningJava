package DSA.Recursion.Level1;

public class PowerLogarithmic {
    public static void main(String[] args) {
        System.out.println(powerLog(2,4));
    }
    public static int powerLog(int x, int n){
        if(n==0){return 1;}
        int xpnb2= powerLog(x,n/2);
        int xn = xpnb2*xpnb2; // divide in two part to make it more efficient on stack
        if(n%2==1){xn=xn*x;}
        return xn;
    }
}

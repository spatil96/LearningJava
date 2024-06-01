package OOPS;

public class FinalVariableAndObjects {
    public static void main(String[] args) {
        int a=5;
        int b=6;
//        swap(a,b);
//        System.out.println(swap(a,b));
//        System.out.println("a="+a+" b="+b);
        final SwapVariables sw = new SwapVariables(100,200);
        sw.a=10;
        sw.b=20;
        swap(sw);
//        sw = new SwapVariables(3000,4000); //can not do as it's final
        System.out.println(sw.a+" "+sw.b);

    }
     public static void swap(SwapVariables sw){
        int temp = sw.b;
        sw.b=sw.a;
        sw.a=temp;
         System.out.println(sw.a+" ok"+sw.b);
    }
}
class SwapVariables{
    int a; int b;

    public SwapVariables(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public SwapVariables() {

    }
}

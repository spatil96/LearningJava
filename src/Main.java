public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        System.out.println(5+5+5*);
        System.out.println(myFunc(4));
    }
    public static int myFunc(int n){
        if(n==1){
            return 1;
        }else{
return n*myFunc(n-1);
        }
    }
    public static String a(String s){
        char length;
        return "";//s[0]+s[s.length/2]+ s[length-1];
    }

}
package DSA.Recursion.Level1;

public class TowerOfHanoi {
    public static void main(String[] args) {
        toh(3, 3, 2, 1);
    }
public static void toh(int n, int t1id, int t2id, int t3id){
        if(n==0){return;}
        toh(n-1, t1id,t3id,t2id);
    System.out.println(n+"["+t1id+" -> "+t2id+"]");
    toh(n-1, t3id,t2id,t1id);
}
}

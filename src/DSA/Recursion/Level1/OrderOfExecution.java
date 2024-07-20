package DSA.Recursion.Level1;

public class OrderOfExecution {
    public static void main(String[] args) {
        pzz(3);
    }
    public static void pzz(int i){
        if(i==0){return;}
        System.out.println("Pre "+i);
        pzz(i-1);
        System.out.println("In "+i);
        pzz(i-1);
        System.out.println("Post "+i);
    }
}
/* For 2
Pre 2
Pre 1
In 1
Post 1
In 2
Pre 1
In 1
Post 1
Post 2
 */
/* For 3
Pre 3
Pre 2
Pre 1
In 1
Post 1
In 2
Pre 1
In 1
Post 1
Post 2
In 3
Pre 2
Pre 1
In 1
Post 1
In 2
Pre 1
In 1
Post 1
Post 2
Post 3
 */

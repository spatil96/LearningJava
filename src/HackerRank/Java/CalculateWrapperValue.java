package HackerRank.Java;

public class CalculateWrapperValue {
    public static void main(String[] args) {
        Integer i=5; //Int will give error
        i*=(3+7);
        System.out.println(i);
    }
}

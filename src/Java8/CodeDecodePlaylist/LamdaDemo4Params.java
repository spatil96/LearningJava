package Java8.CodeDecodePlaylist;
interface Test2 {
    // The void type and the Integer type
    // is automatically inferred from here
    // and assigned to the lambda expression
    void print(Integer p);
}
interface Test3 {
    // The void type and the Integer type
    // is automatically inferred from here
    // and assigned to the lambda expression
    void print(Integer p1, Integer p2);
}interface NumericTest2{
    boolean test(int n, int d);
}
public class LamdaDemo4Params {
    // takes lambda expression and a variable of
    // Integer type as arguments
    static void fun(Test2 t, Integer p)
    {
        // calls the print function
        t.print(p);
    }static void fun(Test3 t, Integer p1, Integer p2)
    {
        // calls the print function
        t.print(p1, p2);
    }
    public static void main(String[] args)
    {
        // lambda expression is passed
        // with a single parameter
        // lambda expression is mapped to the
        // single argument abstract function in the
        // functional interface Test2
        fun(p -> System.out.println(p), 10);
        fun((p1, p2)
                        -> System.out.println(p1 + " " + p2),
                10, 20);
        NumericTest2 isFactor= (n,d) -> (n%d)==0;
        if(isFactor.test(10,2))
            System.out.println("2 is the factor of 10");

        if(!isFactor.test(10,3))
            System.out.println("3 is not a factor of 10");
    }
}

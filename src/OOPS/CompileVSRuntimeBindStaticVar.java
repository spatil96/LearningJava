package OOPS;
class A {
    int temp = 10;
    public void print()
    {
        System.out.println("In Class A");
    }
}
class B extends A {
    int temp = 20;
    public void print()
    {
        System.out.println("In Class B");
    }
}
class CompileVSRuntimeBindStaticVar {
    public static void main(String []args)
    {
        A a = new B();
        System.out.println(a.temp);
        a.print();
    }
}


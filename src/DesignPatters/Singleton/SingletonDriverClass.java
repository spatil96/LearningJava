package DesignPatters.Singleton;

public class SingletonDriverClass {
    public static void main(String[] args) {
        Singleton obj=  Singleton.getInstance();
        Singleton obj1=  Singleton.getInstance();
        Singleton obj2=  Singleton.getInstance();
        System.out.println("OBJ->"+obj);
        System.out.println("OBJ1->"+obj1);
        System.out.println("OBJ2->"+obj2);
        //They all refer to the same object in the memory
    }
}

package Basics;

interface MyInterface1{
    public static int num = 100;
    public default void  display() {
        System.out.println("display method of MyInterface1");
    }
}
interface MyInterface2{
    public static int num = 1000;
    public default void  display() {
        System.out.println("display method of MyInterface2");
    }
}

public class MultipleInheritanceInterfaceExample implements MyInterface1, MyInterface2{
    public void display() {
        System.out.println("This is the implementation of the display method");
    }
    public void show() {
        MyInterface1.super.display();
        MyInterface2.super.display();
    }

    public static void main(String[] args) {
        MultipleInheritanceInterfaceExample obj = new MultipleInheritanceInterfaceExample();
        obj.show();
        System.out.println(MyInterface2.num);//prints since this is static context
        //MyInterface1.display();//Not static context, so can be assessed with only non-static context
        // obj.display();
    }
}
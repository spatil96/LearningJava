package OOPS.Poly;

class Box{
    void area(){
        System.out.println("AREA->BOX class");
    }
}
class Circle extends Box{
    void area(){
        System.out.println("Circle class");
    }
}
class Reactangle extends Box{
    void area(){
        System.out.println("Rectangle class");
    }
}
public class PloyMain {
    public static void main(String[] args) {
        Box b1 = new Box();
        b1.area(); //Box
        Box b2 = new Circle();
        b2.area();//Circle
        Box b3 = new Reactangle();
        b3.area();//Reactangle
//        Reactangle r1 = new Box(); //Not Allowed
    }
}

package Java8.other;

public interface InterfaceJava8I {
  
    public abstract void div(int a, int b); 
  
public default void
    add(int a, int b) 
    { 
        System.out.print("Answer by Default method = "); 
        System.out.println(a + b); 
    } 
  
    public static void mul(int a, int b) 
    { 
        System.out.print("Answer by Static method = "); 
        System.out.println(a * b); 
    } 
} 
  
class InterfaceJava8 implements InterfaceJava8I {
  
    @Override
    public void div(int a, int b) 
    { 
        System.out.print("Answer by Abstract method = "); 
        System.out.println(a / b); 
    } 
  
    public static void main(String[] args) 
    { 
        InterfaceJava8 in = new InterfaceJava8();
        in.div(8, 2); 
        in.add(3, 1);
        InterfaceJava8I.mul(4, 1);
    } 
} 
package Basics;
interface Greeting {
    void greet();
}
public class OuterClass {
    private static String staticOuterField = "Static Outer Field";
    private String outerField = "Outer Field";

    // Static Nested Class
    static class StaticNestedClass {
        void display() {
            System.out.println("Static Nested Class accessing: " + staticOuterField);
        }
    }

    // Inner Class
    class InnerClass {
        void display() {
            System.out.println("Inner Class accessing: " + outerField);
        }
    }

    void display() {
        final String localVariable = "Local Variable";

        // Local Inner Class
        class LocalInnerClass {
            void show() {
                System.out.println("Local Inner Class accessing: " + localVariable);
            }
        }

        LocalInnerClass localInner = new LocalInnerClass();
        localInner.show();
    }

    void anonymousClassExample() {
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello from Anonymous Inner Class");
            }
        };
        greeting.greet();
    }

    public static void main(String[] args) {
        // Static Nested Class
        OuterClass.StaticNestedClass staticNested = new OuterClass.StaticNestedClass();
        staticNested.display();

        // Inner Class
        OuterClass outerObject = new OuterClass();
        OuterClass.InnerClass innerObject = outerObject.new InnerClass();
        innerObject.display();

        // Local Inner Class
        outerObject.display();

        // Anonymous Inner Class
        outerObject.anonymousClassExample();
    }
}

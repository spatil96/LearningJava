package Java8.CodeDecodePlaylist;

import java.util.function.BiConsumer;

public class LamdaDemo1 {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> biConsumer = (a,b) -> System.out.println(a+b);
        biConsumer.accept(10, 5);
    }
}

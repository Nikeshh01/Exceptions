package Consumers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
//        Consumer<String> consumer1 = (str) -> System.out::println(str);
      Consumer<String> consumer1 = System.out::println;
      Consumer<String> consumer2 = str -> System.out.println("length: " + str.length() );
    consumer1.accept("Hello");
    consumer1.accept("SARA");

    consumer2.accept("Sara");
    consumer2.accept("Rimmy");
    consumer2.accept("Nikesh");

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        Consumer<Integer> multiplyByTwo = n -> System.out.println(n*2);
        numbers.forEach(multiplyByTwo);
    }
}

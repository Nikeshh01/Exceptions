package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FirstStreamDemo {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Without Streams
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even numbers (with Streams): " + evenNumbers);


        // Using Predicate
        Predicate<Integer> evenPredicate = n -> n % 2 == 0;

        List<Integer> evenNumbers2 = numbers.stream()
                .filter(evenPredicate)
                .collect(Collectors.toList());

        System.out.println("Even numbers (Predicate): " + evenNumbers2);
    }
}

package PREDICATES;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n%2 ==0;
        System.out.println(isEven.test(10));
        System.out.println(isEven.test(27));

        System.out.println("------------------");
//        BiPredicate<Integer,Integer>  isOdd = (a, b )->  a % 2 != 0 &  b % 2 != 0;
//        System.out.println(isOdd.test(27,3));

        BiPredicate<Integer,Integer>  isSumOdd = (a, b ) ->  (a+b)%2 != 0;
        System.out.println(isSumOdd.test(27,4));
        System.out.println(isSumOdd.test(2,4));

    }
}

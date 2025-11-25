package Functional;

import java.util.function.Function;

public class functionalInterface {
    public static Function<Integer, Integer> addFunction = ( a) -> a +3;
 public static Function<Integer, Integer> subtractFunction = ( b) -> b -10;
 public static Function<Integer, Integer> multiply = (c) -> c *7;
 public static Function<Integer, Integer> divideFunction = ( d) -> d /5;

public static Function<Integer, Integer> combinedFunction = addFunction.andThen(subtractFunction).andThen(multiply).andThen(subtractFunction);

    public static void main(String[] args) {
        System.out.println(addFunction.apply(10));
        System.out.println(subtractFunction.apply(11));
        System.out.println(multiply.apply(11));
        System.out.println(divideFunction.apply(11));
        System.out.println(combinedFunction.apply(11));

    }
}

package BiFunctions;

import java.util.function.BiFunction;

public class BiFunctionDemo {

    public static BiFunction<Integer, Integer, Integer>  addFunction = Integer::sum;
    public static BiFunction<Integer, Integer, Integer>  substract = (a,b) -> a-b ;



    public static void main(String[] args) {
        System.out.println(addFunction.apply(150,20));
        System.out.println(substract.apply(15,20));
    }
}

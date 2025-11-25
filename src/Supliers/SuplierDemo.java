package Supliers;

import java.util.function.Supplier;

public class SuplierDemo {
    public static void main(String[] args) {
        Supplier<Double>  randomNum = Math::random;
        System.out.println(randomNum.get());
        System.out.println(randomNum.get());
        System.out.println(randomNum.get());
        System.out.println(randomNum.get());
    }

}

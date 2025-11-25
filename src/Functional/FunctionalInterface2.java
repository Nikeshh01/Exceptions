package Functional;

import org.w3c.dom.ls.LSOutput;


interface  Operation{

    int add(int a, int b);
}
public class FunctionalInterface2 {
    public static void main(String[] args) {


    Operation operation = (a, b) -> {
      return a+b;

    };
        System.out.println(operation.add(10, 20));

        //Thread Interface
        new Thread(() -> System.out.println("New Thread Created...")).start();

    }
}

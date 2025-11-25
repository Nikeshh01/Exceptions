package Functional;

//functional interface

interface BookAction {
    void perform();

}


public class FunctionalInterfaceDemo {

    public static void main(String[] args) {


//        BookAction action = new BookAction() {
//            @Override
//            public void perform() {
//                System.out.println("Action performed");
//            }
//        };
        BookAction action = () -> System.out.println("Action performed");
        action.perform();
    }
}
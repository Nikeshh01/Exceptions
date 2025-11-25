package References;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodReferencesDemo {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Rimy","Nikesh","Sara" );

        //1: using for Loop
        for(int i =0;i<names.size();i++){
       System.out.println(names.get(i));

   }
        System.out.println("--------------------");
//2: Using for enhanced for Loop
   for(String name : names){
       System.out.println(name);


       System.out.println("-----------------");
//       names.forEach(new Consumer<String>() {
//           @Override
//           public void accept(String name) {
//               System.out.println(name);
//           }
//       });


       names.forEach(System.out::println);
   }
    }
}

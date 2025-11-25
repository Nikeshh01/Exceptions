package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {
    // use cases
    //1 filtering
    //2 mapping
    //3 aggregation
    //4 searching
    // 5 iteration



    public static void main(String[] args) {
        //strems ==> assembly lines
        List<String> items = Arrays.asList("apple", "banana", "cherry","Date");

        for(String fruit : items){
//            System.out.println(fruit);

            //using streams
            Stream<String> stream = items.stream();
            stream.forEach(System.out::println);

            System.out.println("Filterd fruits...");
            Stream<String> stream1 = items.stream();
         Stream<String> filteredStream =   stream1.filter(name -> name.startsWith("b"));
         filteredStream.forEach(System.out::println);
        }
    }
}

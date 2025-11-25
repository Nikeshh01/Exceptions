import java.io.FileNotFoundException;
import java.io.FileReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        try{
            int a = 10;
            float result = 10/3f;
            System.out.println("Done "+result);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("ho rha he");
        try {
            int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
            System.out.println(a[61]);
        }
        catch (Exception e){
            System.out.println("Exception : "+e);
        }
        try {
            FileReader fileReader = new FileReader("Ishika.txt");
        } catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }
       
     }

}
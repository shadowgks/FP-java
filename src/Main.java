import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(2,3,4,5);
        List square = number.stream().map(x -> x*x).collect(Collectors.toList());
        System.out.println(square);


    }
}
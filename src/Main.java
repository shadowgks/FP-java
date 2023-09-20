import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        List<Integer> number = Arrays.asList(2,3,4,5);
//        List square = number.stream().map(x -> x*x).collect(Collectors.toList());
//        System.out.println(square);

//        List<Person> people = List.of(
//                new Person("Saad Moumou", Gender.Male , 23, Citys.Youssoufia),
//                new Person("ikram Moumou", Gender.Female , 15, Citys.Youssoufia),
//                new Person("Natalia Boursha", Gender.Male , 30, Citys.Casa)
//        );
//
//        people.stream()
//                .filter(x -> Gender.Female.equals(x.getGender()))
//                .map(x -> x.getFullName().toUpperCase())
//                .forEach(System.out::println);

        int increment1 = incrementNumberByOneDeclarative.apply(1);
        System.out.println(increment1);
        int increment2 = incrementNumberByOneImperative(1);
        System.out.println(increment2);

        //apply
        System.out.println(NumberBy10.apply(increment1));
        //addThen
        Function<Integer, Integer> AddThenFunc = incrementNumberByOneDeclarative.andThen(NumberBy10);
        System.out.println(AddThenFunc.apply(1));





    }

    static Function<Integer,Integer> incrementNumberByOneDeclarative = x -> ++x;
    static Function<Integer, Integer> NumberBy10 = x -> x * 10;
    static int incrementNumberByOneImperative(int x){
        return ++x;
    }

}
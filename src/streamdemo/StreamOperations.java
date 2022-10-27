package streamdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class StreamOperations {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Amit");
        names.add("Adam");
        names.add("Same");
        names.add("Sonm");
        names.add("Aman");
//        names.stream().filter(i -> i.startsWith("A"))
//                .forEach(System.out::println);
//        names.stream().filter(i -> i.startsWith("A"))
//                .map(String :: toUpperCase)
//                .forEach(System.out::println);
//        names.stream().filter(i -> i.startsWith("A"))
//                .map(String :: toUpperCase).sorted()
//                .forEach(System.out::println);
        List<String> list = names.stream().sorted().filter(i -> i.startsWith("A"))
                .map(String :: toUpperCase).collect(Collectors.toList());

        List<String> sortedList = names.stream().sorted().filter(i -> i.getGender() == Person.gender.Male).collect(Collectors.toList())

//        System.out.println(list);
        boolean matchResults = names.stream().anyMatch(i -> i.startsWith("a"));
        System.out.println(matchResults);

    }
}

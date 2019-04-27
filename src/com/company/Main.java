package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        //metoda moze wystepowac tylko w klasie
        //action to uchwyt to metody anonimowej
        //s argument z przyslonietej metody pochodzacej z interfacu
        //print out to cialo metody z interface a przyslonietej w klasie metodzie

        Action action = (s, y) -> System.out.println(s + y);

        Action action1 = new Action() {
            @Override
            public void doAction(String action, int action2) {
                System.out.println(action.length());
            }
        };

        action.doAction("doAction", 2);
        action1.doAction("doAction1", 3);

        List<String> names = Arrays.asList("Ytes", "tretrere4fer", "fsdfdsfds");
        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Overridden functional interface method");
            }
        });

//        List<String> names2 = Arrays.asList("Ytes", "tretrere4fer","fsdfdsfds");
//        names.forEach(s -> System.out.println("Overridden functional interface method"));

        System.out.println("Optional Java8");

//        Optional.ofNullable() method returns a Non-empty Optional if a value present in the given object. Otherwise returns empty Optional.
//        Optionaal.empty() method is useful to create an empty Optional object.

        String name = null;
        Optional<String> nameOptional1 = Optional.ofNullable(name);

        if (nameOptional1.isPresent()) {
            System.out.println("nameoptional is present" + nameOptional1.get());
        } else {
            System.out.println("nameOptional is not present");
        }
        System.out.println("---------------------------");

        nameOptional1.ifPresent(s -> System.out.println(s));

        System.out.println("---------------------------");
        List<String> namesStreams = Arrays.asList("Pawel", "Mike", "John", "Dorota", "John", "Paul", "John", "Eleanor", "Mike", "Mike");

        namesStreams = namesStreams.stream()
                //.filter(s -> s.endsWith("e"))
                //.map(s -> s.toUpperCase())
                //last string of s
                //.map(s -> s.substring(s.length() - 1))
                //.distinct()
                //zamaina ana stumien liczbowy , wczesnije byl obiektowy
                //.mapToInt(s-> s.length())

                //.reduce((s,s1)-> s + s1)
                //.ifPresent(s-> System.out.println(s));

                //.limit(3)
                //.forEach(s -> System.out.println(s));

                //.max((s,s1)-> Integer.compare(s.length()-s1.length()));
                        //Integer.compare(s.length()-s1.length()));
                .collect(Collectors.toList());

                //.max((s,s1)) -> Integer.compare(s.l)

                //.forEach(s -> System.out.println(s));

        Map<Integer, List<String>> grouped = namesStreams
                .stream()
                .collect(Collectors.groupingBy(s-> s.length()));

        System.out.println(grouped);
        System.out.print(namesStreams);
    }
}

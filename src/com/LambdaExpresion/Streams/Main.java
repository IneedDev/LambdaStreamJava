package com.LambdaExpresion.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<String> someBingoNumbers = Arrays.asList("N40","G20","g64","C20","G78","M20","g64");

        List<String> gNumbers = new ArrayList<>();

        someBingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s-> s.startsWith("G"))
                .sorted()
                .forEach(System.out::println);

        Stream<String> ioNumberStream = Stream.of("I26","I27","M08","N52", "M89","I26");
        Stream<String> inNumberStream = Stream.of("N52", "M89","I26","I27","M08");
        Stream<String> concatStream = Stream.concat(ioNumberStream,inNumberStream);
        System.out.println("-----------------");
        System.out.println(concatStream
                .distinct()
                .peek(System.out::println)
                .count());
        //System.out.println(concatStream.distinct().count());


//        someBingoNumbers.forEach(number ->{
//            if (number.toUpperCase().startsWith("G")){
//                gNumbers.add(number);
////                System.out.println(number);
//            }
//        });
//
//        gNumbers.sort((String s1,String s2)-> s1.compareTo(s2));
//        gNumbers.forEach((String s)-> System.out.println(s));

        System.out.println("New created classes Employee and Department");

        Employee john = new Employee("John", 45);
        Employee john2 = new Employee("John", 80);
        Employee john3 = new Employee("John", 90);
        Employee paul = new Employee("paul", 80);
        Employee mike = new Employee("mike", 90);

        Department hr = new Department("HR");
        hr.addEmployee(john);
        hr.addEmployee(john2);

        Department accounting = new Department("Accounting");
        accounting.addEmployee(john3);
        accounting.addEmployee(paul);
        accounting.addEmployee(mike);

        List<Department> departments = new ArrayList<>();
        departments.add(hr);
        departments.add(accounting);

        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .forEach(System.out::println);

//        List<String> sortedGNumbers = someBingoNumbers
//                .stream()
//                .map(String::toUpperCase)
//                .filter(s->s.startsWith("G"))
//                .sorted()
//                .collect(Collectors.toList());

        List<String> sortedGNumbers = someBingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s->s.startsWith("G"))
                .sorted()
                .collect(ArrayList::new,ArrayList::add,ArrayList::addAll);

        for (String sortedGNumber : sortedGNumbers) {
            System.out.println(sortedGNumber);
        }

    }
}

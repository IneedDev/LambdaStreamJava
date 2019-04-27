package com.SreamTasks;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {

    public static void main(String[] args) {

        Person person1 = new Person(65,"John", "Smith");
        Person person2 = new Person(40,"Mike", "Well");
        Person person3 = new Person(48,"Bob", "Foo");
        Person person4 = new Person(48,"Bob", "Foo");
        Person person5 = new Person(48,"Bob", "Foo");

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);

        // Write program to calculate average age for all persons
        personList
                .stream()
                .mapToInt(s-> s.getAge())
                .average()
                .ifPresent(s-> System.out.println("Average age is: " + s));
        //Create age list of persons (List<Integer>) based on person list
        List<Integer> intList = personList
                .stream()
                .map(s -> s.getAge())
                .collect(Collectors.toList());
        System.out.println("Age list abesd on person list: "+intList);
        //Delete duplicates and print out count of duplicates
        List<Integer> ageDuplicatesList = personList
                .stream()
                .map(s->s.getAge())
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Duplicate age list: " + ageDuplicatesList);


        // Count the empty strings
        List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
        long count = strList.stream()
                .filter(x->x.isEmpty())
                .count();
        //regex in printout
        System.out.printf("List %s has %d empty strings %n",strList,count);
        //Count string with length more than 3
        long num = strList.stream()
                .filter(x->x.length()>=3)
                .count();
        System.out.printf("List %s has %d strings of length more then 3 %n",strList,num);
        // Count number of String which startswith "a"
        long countA = strList.stream()
                .filter(x->x.startsWith("a"))
                .count();
        System.out.printf("List %s has %d strings which startsWith 'a' %n", strList, countA);
        //Remove empty string from the list
        List<String> filtered = strList.stream()
                .filter(x->!x.isEmpty())
                .collect(Collectors.toList());
        System.out.printf("Original list %s, filtered list: %s %n",strList,filtered);
        // Create a List with String more than 2 characters
        List<String> moreThanTwo = strList.stream()
                .filter(x->x.length()>2)
                .collect(Collectors.toList());
        System.out.printf("Original List : %s, filtered list : %s %n",strList,moreThanTwo);
        // Convert String to Uppercase and join them using coma
        String resultString =  strList.stream()
                .map(x->x.toUpperCase())
                .collect(Collectors.joining(","));
        System.out.printf("List %s after join returns following string: %s %n",strList,resultString);
        // Create List of square of all distinct numbers
        List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
        List<Integer> distinct = numbers.stream()
                .distinct()
                .map(i-> i*i)
                .collect(Collectors.toList());
        System.out.printf("Original list %s, square without duplicates: %s %n",numbers,distinct);
        //get count, sum, avr, min max for numbers
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        IntSummaryStatistics stats = primes.stream()
                .mapToInt(x->x)
                .summaryStatistics();
        System.out.println("Highest prime number in List : " + stats.getMax());
        System.out.println("Lowest prime number in List : " + stats.getMin());
        System.out.println("Sum of all prime numbers : " + stats.getSum());
        System.out.println("Average of all prime numbers : " + stats.getAverage());

    }
}

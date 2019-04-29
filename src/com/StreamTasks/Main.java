package com.StreamTasks;

import java.util.*;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {

        Person person1 = new Person(40,"John", "Smith");
        Person person2 = new Person(45,"Mike", "Well");
        Person person3 = new Person(68,"Bob", "Parks");
        Person person4 = new Person(49,"Leon", "Foo");
        Person person5 = new Person(30,"Christian", "Markus");

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);

        // 1 Write program to calculate average age for all persons
        personList
                .stream()
                .mapToInt(s-> s.getAge())
                .average()
                .ifPresent(s-> System.out.println("Average age is: " + s));

        // 5 Create age list of persons (List<Integer>) based on person list
        List<Integer> intList = personList
                .stream()
                .map(s -> s.getAge())
                .collect(Collectors.toList());
        System.out.println("Age list abesd on person list: "+intList);

        // 8a Delete duplicates
        System.out.println("---------------------------------------------- %n");
        System.out.println("Duplicates and number of them:");
        List<Integer> ageDuplicatesList = personList
                .stream()
                .map(s->s.getAge())
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Duplicate age list: " + ageDuplicatesList);

        // 8b Count number of duplicates
        personList
                .stream()
                .map(x-> x.getAge())
                .collect(Collectors.toList());
        System.out.printf("Number of duplicated elements in list: %d%n",personList.size()-ageDuplicatesList.size());

        // 8c Delete duplicates and count them
        System.out.printf("Number of duplicated elements in list: %d%n",personList.size() -
                personList
                        .stream()
                        .distinct()
                        .count());


        //6.  Find person where sum of age digits == sum of leters in name
        System.out.printf("---------------------------------------------- %n");
        System.out.println("Sum of age digits == length name:");
        personList
                .stream()
                .filter(x-> ((x.getAge()%10) + (x.getAge()/10))==x.getName().length())
                .forEach(x-> System.out.println(x));

        //9 Create Animal class with fields name and age, Based on list of persons create list od animals. Animal overtake name of joined person name and surname and age is divided by 10
        System.out.printf("---------------------------------------------- %n");
        System.out.println("Animal list where age is sum of person name and surname and ege is divided by 10:");
        List<Animal> animalList =  personList
                .stream()
                //change of stream content into Animal and field values
                .map(s-> new Animal(s.getName()+s.getSureName(),s.getAge()/10))
                .collect(Collectors.toList());
        System.out.println(animalList);

        //7a Sort persons by age from oldest to youngest
        System.out.printf("---------------------------------------------- %n");
        System.out.println("Sorted persons by age: ");
        List<Person> newpersonList = personList
                .stream()
                .sorted(Comparator.comparing(Person::getAge).reversed())
                .collect(Collectors.toList());
        System.out.println(newpersonList);

        //7b Sort persons by age from oldest to youngest
        System.out.println("Alternative solution with Integer.compare");
        personList
                .stream()
                .sorted((s,s1)-> Integer.compare(s.getAge(), s1.getAge())*-1)
                .forEach(s-> System.out.println(s));

        //11 Group persons where sum of name and surname is equal
        System.out.printf("---------------------------------------------- %n");
        System.out.println("Grouped persons by sum of string name == surname");
        Map<Integer, List<Person>> newPersonList=
        personList
                .stream()
                .collect(Collectors.groupingBy(s-> s.getName().length()+s.getSureName().length()));
        System.out.println(newPersonList);

        //10 Change peron age into animal age (n*6-2), print persons where age is beyond 50
        System.out.printf("---------------------------------------------- %n");
        System.out.println("Persons above age 50");
        personList
                .stream()
                //change stream type
                .map(s-> new Person((s.getAge()*6)-2,s.getName(),s.getName()))
                .filter(s-> s.getAge()>50)
                .forEach(s-> System.out.println(s));

        //3 Write program to find oldest persone and ad to this person name prefix Super
        System.out.printf("---------------------------------------------- %n");
        System.out.printf("Oldest person with prefix super %n");
        Person orderedPersonAge  = personList
                .stream()
                .sorted(Comparator.comparing(Person::getAge).reversed())
                .map(s-> new Person(s.getAge(),"Super"+s.getName(),s.getSureName()))
                .findFirst()
                .get();
        System.out.println(orderedPersonAge);
        System.out.printf("---------------------------------------------- %n");
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

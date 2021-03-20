package ru.oshkina.demo1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
    }
//
//    public static List<Person> getBabies(List<Person> persons) {
//        return persons.stream()
//                .filter(p -> p.getAge() < 5)
//                .collect(Collectors.toList());
//    }

    public static List<Person> getBabies(List<Person> persons) {
        List<Person> filtered = new ArrayList<>();
        for (Person p : persons) {
            if (p.getAge() < 5) {
                filtered.add(p);
            }
        }

        return filtered;
    }


}

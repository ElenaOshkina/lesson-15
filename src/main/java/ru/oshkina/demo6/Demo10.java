package ru.oshkina.demo6;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.UUID;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo10 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(UUID.randomUUID(), "Иван Иванов"));
        students.add(new Student(UUID.randomUUID(), "Анна Смирнова"));
        students.add(new Student(UUID.randomUUID(), "Николай Петров"));
        students.add(new Student(UUID.randomUUID(), "Иван Иванов"));

        final TreeMap<UUID, Student> idToPerson = students.stream().collect(
                Collectors.toMap(
                        Student::getId,
                        Function.identity(),
                        (existingValue, newValue) -> {
                            throw new IllegalStateException();
                        },
                        TreeMap::new
                )
        );

        System.out.println(idToPerson);
    }
}

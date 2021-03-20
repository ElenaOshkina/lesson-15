package ru.oshkina.demo6;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

public class Demo6 {

    public static void main(String[] args) {
        List<Student> persons = new ArrayList<>();
        persons.add(new Student(UUID.randomUUID(), "Иван Иванов"));
        persons.add(new Student(UUID.randomUUID(), "Анна Смирнова"));
        persons.add(new Student(UUID.randomUUID(), "Николай Петров"));
        persons.add(new Student(UUID.randomUUID(), "Иван Иванов"));

        final Map<UUID, String> idToStudent = persons
                .stream()
                .collect(Collectors.toMap(Student::getId, Student::getName));

        System.out.println(idToStudent);
    }
}

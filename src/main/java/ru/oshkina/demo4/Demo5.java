package ru.oshkina.demo4;

import java.util.Optional;

public class Demo5 {
    public static void main(String[] args) {
        Optional<String> s = Optional.of("input");
        System.out.println(s.map(Demo5::getOutput));
        System.out.println(s.flatMap(Demo5::getOutputOpt));
    }

    static String getOutput(String input) {
        return input == null ? null : "output for " + input;
    }

    static Optional<String> getOutputOpt(String input) {
        return input == null ? Optional.empty() : Optional.of("output for " + input);
    }
}



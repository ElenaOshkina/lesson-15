package ru.oshkina.demo2;

import java.util.Optional;

public class Demo2 {
    public static void main(String[] args) {
        Double y = 4.5;
        final Optional<Double> inverse = inverse(y);
        System.out.println(inverse.orElse(0.0));
    }

    public static Optional<Double> inverse(Double y) {
        return y == 0 ? Optional.empty() : Optional.of(1 / y);
    }

}

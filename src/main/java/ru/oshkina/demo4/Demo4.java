package ru.oshkina.demo4;

import ru.oshkina.demo2.Demo2;

import java.util.Optional;

import static ru.oshkina.demo2.Demo2.inverse;

public class Demo4 {
    public static void main(String[] args) {
        Double y = 9.0;
        inverse(y).flatMap(Demo4::squareRoot);

        //или можно так
        final Optional<Double> aDouble = Optional.of(-16.0)
                .flatMap(Demo2::inverse)//похож на flatMap из stream api, но работает только, если значение != null
                .flatMap(Demo4::squareRoot);

        //Если метод inverse() или squareRoot() вернут Optional.empty(), то итоговый результат будет пустым
    }

    /**
     * Метод для извлечения квадратного корня
     */
    public static Optional<Double> squareRoot(Double y) {
        return y < 0 ? Optional.empty() : Optional.of(Math.sqrt(y));
    }
}

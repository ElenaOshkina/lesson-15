package ru.oshkina.demo7;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo11 {
    public static void main(String[] args) {
        final Stream<Locale> availableLocales = Stream.of(Locale.getAvailableLocales());
        Map<String, List<Locale>> countryToLocales = availableLocales
                .filter(locale -> !locale.getDisplayCountry().isEmpty())
                .collect(Collectors.groupingBy(Locale::getCountry)); //Locale::getCountry - выполняет роль классификатора группирования

        System.out.println(countryToLocales);

        //Теперь мы можем получить все региональные настройки по коду страны
        List<Locale> swissLocales = countryToLocales.get("CH");
        System.out.println("swissLocales: " + swissLocales);
    }
}

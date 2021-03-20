package ru.oshkina.demo6;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Допустим, что нужно выяснить все языки для каждой страны
 * Нам потребуется отображение Map<String, Set<String>>
 * Для ключа "швейцария" будет множество ["немецкий", "французский", "итальянский"].
 */
public class Demo9 {
    public static void main(String[] args) {
        final Stream<Locale> availableLocales = Stream.of(Locale.getAvailableLocales());
        final Map<String, Set<String>> countryLanguagesSet = availableLocales
                .filter(locale -> !locale.getDisplayCountry().isEmpty())
                .collect(
                        Collectors.toMap(
                                Locale::getDisplayCountry,
                                l -> Collections.singleton(l.getDisplayLanguage()),
                                (existingValue, newValue) -> { //При обнаружении нового языка для заданной страны - выполняем объединение сущесвующего и нового множеств
                                    Set<String> union = new HashSet<>(existingValue);
                                    union.addAll(newValue);
                                    return union;
                                }
                        )
                );
        System.out.println(countryLanguagesSet);
    }
}

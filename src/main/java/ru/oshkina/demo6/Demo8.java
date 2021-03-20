package ru.oshkina.demo6;

import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Инфо про локаль:
 * @link http://tutorials.jenkov.com/java-internationalization/locale.html
 */
public class Demo8 {
    public static void main(String[] args) {
        final Stream<Locale> availableLocales = Stream.of(Locale.getAvailableLocales());
        final Map<String, String> languageNames = availableLocales.collect(
                Collectors.toMap(
                        Locale::getDisplayLanguage,
                        Locale::getLanguage,
                        (existingValue, newValue) -> existingValue
                )
        );
        System.out.println(languageNames);
    }
}

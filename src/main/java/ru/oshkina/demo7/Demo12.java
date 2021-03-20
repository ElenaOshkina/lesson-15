package ru.oshkina.demo7;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo12 {
    public static void main(String[] args) {
        final Stream<Locale> availableLocales = Stream.of(Locale.getAvailableLocales());

        //Разделяем все региональные настройки на те, что описывают английский язык и все остальные
        final Map<Boolean, List<Locale>> englishAndOtherLocale = availableLocales
                .filter(locale -> !locale.getDisplayCountry().isEmpty())
                .collect(Collectors.partitioningBy(l -> l.getLanguage().equals("en")));

        //Достаем настройки для английского
        List<Locale> englishLocales = englishAndOtherLocale.get(true);

        System.out.println(englishLocales);
    }
}

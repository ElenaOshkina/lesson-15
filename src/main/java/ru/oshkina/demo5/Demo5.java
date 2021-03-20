package ru.oshkina.demo5;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo5 {

    public static void main(String[] args) {
        final Stream<String> stream = Stream.of(
                ("В первой декаде апреля в Москве возможно выпадение снега, заявил научный руководитель " +
                        "Гидрометцентра Роман Вильфанд. \"В апреле ещё снежок будет, в первой декаде\""
                ).split("\\PL+")
        );

        final IntSummaryStatistics summary = stream
                .collect(Collectors.summarizingInt(String::length));

        final double average = summary.getAverage();
        final double maxWorldLength = summary.getMax();

        System.out.println("avg:" + average);
        System.out.println("max:" + maxWorldLength);
    }
}

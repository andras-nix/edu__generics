package com.nixsolutions.ppp.generics.section_2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Raw use of parameterized class 'List'... that works.
 */
public class BetaTextAnalytics {

  public static void main(String[] args) {
    String input = "\nFirst line was blank.\nSecond and third are not.";
    List statistics = calculateWordPerLine(input);
    printWordPerLineStatistics(statistics);
  }

  public static void printWordPerLineStatistics(List statistics) {
    for (int i = 0; i < statistics.size(); i++) {
      System.out.printf("The %d. line contains %d word(s).%n", i + 1, (long) statistics.get(i));
    }
  }

  public static List calculateWordPerLine(String input) {
    return input.lines()
        .map(line -> line.isBlank() ? 0 : Stream.of(line.split("\\s")).count())
        .collect(Collectors.toList());
  }
}

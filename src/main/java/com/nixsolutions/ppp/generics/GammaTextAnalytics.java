package com.nixsolutions.ppp.generics;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * List of Integers, simple and convenient.
 */
public class GammaTextAnalytics {

  public static void main(String[] args) {
    String input = "\nFirst line was blank.\nSecond and third are not.";
    List<Integer> statistics = calculateWordPerLine(input);
    printWordPerLineStatistics(statistics);
  }

  public static void printWordPerLineStatistics(List<Integer> statistics) {
    for (int i = 0; i < statistics.size(); i++) {
      System.out.printf("The %d. line contains %d word(s).%n", i + 1, statistics.get(i));
    }
  }

  public static List<Integer> calculateWordPerLine(String input) {
    return input.lines()
        .map(line -> line.isBlank() ? 0 : (int) Stream.of(line.split("\\s")).count())
        .collect(Collectors.toList());
  }
}

package com.nixsolutions.ppp.generics.third;

import java.util.Collection;
import java.util.List;

public class ListPrinting {

  public static final List THINGS = List.of(0, 'A', .2);
  public static final List<Integer> INTEGERS = List.of(1, 2, 3);
  public static final List<String> STRINGS = List.of("A", "B", "C");


  public static void main(String[] args) {
    printA(THINGS);
    printA(INTEGERS);
    printA(STRINGS);

//    printB(THINGS);
//    printB(INTEGERS);
//    printB(STRINGS);

//    printC(THINGS);
//    printC(INTEGERS);
//    printC(STRINGS);
  }

  public static void printA(Collection collection) {
    for (Object e : collection) {
      System.out.print(e);
    }
    System.out.println();
  }

  public static void printB(Collection<Object> collection) {
    for (Object e : collection) {
      System.out.print(e);
    }
    System.out.println();
  }

  public static void printC(Collection<?> collection) {
    for (Object e : collection) {
      System.out.print(e);
    }
    System.out.println();
  }
}

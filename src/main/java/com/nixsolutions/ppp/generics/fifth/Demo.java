package com.nixsolutions.ppp.generics.fifth;

import java.util.List;

public class Demo {

  public static void main(String[] args) {
    List<RandomSource<?>> sources = List.of(new RandomIntSource(), new RandomDoubleSource());

    for (var source : sources) {
      System.out.println(source.get());
    }
  }
}

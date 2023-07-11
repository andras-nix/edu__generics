package com.nixsolutions.ppp.generics.section_6;

import java.util.Random;

public class RandomDoubleSource implements RandomSource<Double> {

  private static final Random random = new Random();

  @Override
  public Double get() {
    return random.nextDouble();
  }
}

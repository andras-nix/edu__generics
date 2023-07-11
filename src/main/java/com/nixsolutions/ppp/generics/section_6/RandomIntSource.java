package com.nixsolutions.ppp.generics.section_6;

import java.util.Random;

public class RandomIntSource implements RandomSource<Integer> {

  private static final Random random = new Random();

  @Override
  public Integer get() {
    return random.nextInt();
  }
}

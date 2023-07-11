package com.nixsolutions.ppp.generics.section_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RawCollection {

  public static void main(String[] args) {
    System.out.println("Init a collection as a raw type");
    List list = new ArrayList();

    System.out.println("Add some elements");
    addSomeElements(list);

    System.out.println("Print the collection");
    System.out.println(list);

    System.out.println("Print the sum");
    int result = 0;
    for (int i = 0; i < 10; i++) {
      result += (int) list.get(i);
    }
    System.out.println(result);
  }

  private static void addSomeElements(List list) {
    Random random = new Random();
    for (int i = 0; i < 10; i++) {
      list.add(random.nextInt());
    }
  }

  private static void addSomeElements(ArrayList list) {
    for (int i = 0; i < 10; i++) {
      list.add(Character.toString('A' + i));
    }
  }
}

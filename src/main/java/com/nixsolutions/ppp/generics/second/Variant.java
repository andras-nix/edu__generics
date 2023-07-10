package com.nixsolutions.ppp.generics.second;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.nixsolutions.ppp.generics.second.entity.Drink;
import com.nixsolutions.ppp.generics.second.entity.Food;
import com.nixsolutions.ppp.generics.second.entity.Product;

public class Variant {

  public static void main(String[] args) throws InterruptedException {

    try (var scanner = new Scanner(System.in)) {
      for (int i = 0; i < 3; i++) {
        try {
          System.out.printf("%n%nExample '%c', press enter to start%n", 'A' + i);
          scanner.nextLine();
          chooseExample(i);
        } catch (Exception e) {
          e.printStackTrace();
          Thread.sleep(100);
        }
      }
    }
  }

  private static void chooseExample(int ordinal) {
    switch (ordinal) {
      case 0:
        arraysAreCovariant_A();
        break;
      case 1:
        arraysAreCovariant_B();
        break;
      case 2:
        arraysAreCovariant_C();
        break;
      case 3:
      default:
        genericsAreInvariant();
    }
  }

  private static void arraysAreCovariant_A() {
    Product[] products = new Food[10];
    printClassOfArray(products);

    System.out.println("Add a Food instance...");
    products[0] = new Food();

    checkFirstElement(products);
  }

  private static void printClassOfArray(Product[] products) {
    System.out.printf("Type of the array: %s%n", products.getClass());
  }

  private static void checkFirstElement(Product[] products) {
    System.out.println("Check the first element of the array:");
    System.out.println(products[0]);
  }

  private static void arraysAreCovariant_B() {
    Product[] products = new Food[10];
    printClassOfArray(products);

    System.out.println("Add a Drink instance...");
    products[0] = new Drink();

    checkFirstElement(products);
  }

  private static void arraysAreCovariant_C() {
    Product[] products = new Food[10];
    printClassOfArray(products);

    System.out.println("Add a Product instance...");
    products[0] = new Product();

    checkFirstElement(products);
  }

  private static void genericsAreInvariant() {
//    List<Product> products = new ArrayList<Food>();
//
//    products.add(new Food());
//    products.add(new Drink());
//    products.add(new Product());
//
//    products.forEach(System.out::println);
  }
}

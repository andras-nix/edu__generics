package com.nixsolutions.ppp.generics.section_1;

public class Box<T> {

  private T content;

  public Box(T content) {
    this.content = content;
  }

  public T getContent() {
    return content;
  }

  public void setContent(T content) {
    this.content = content;
  }

  public static void main(String[] args) {
    var instance = new Box<>("some");

    System.out.println("that's a " + instance.getContent());

    instance.setContent("thing");
    System.out.println("that's a " + instance.getContent());
  }
}

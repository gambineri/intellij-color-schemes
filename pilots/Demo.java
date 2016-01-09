package com.instaclimb.app;

/**
 * Created by massimo on 06/01/16.
 */


public class Demo {
  private static final String CONSTANT = "String";
  private Object o;
  /**
   * Creates a new demo.
   * @param o The object to demonstrate.
   */
  public Demo(Object o) {
    String  s      = CONSTANT + "Other";
    int     i      = 123;
    long    unused = 123456789;

    this.o = o;
  }

  public void run() {
  }

  public static void main(String[] args) {
    Demo demo = new Demo(null);
    demo.run();
  }
}


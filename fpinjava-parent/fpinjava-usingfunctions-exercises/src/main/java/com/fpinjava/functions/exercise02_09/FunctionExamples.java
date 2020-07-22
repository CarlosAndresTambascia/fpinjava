package com.fpinjava.functions.exercise02_09;

public class FunctionExamples {

  private static String format = "%s, %s, %s, %s";

  public static <A, B, C, D> Function<A, Function<B, Function<C, Function<D, String>>>> f() {
    return f1 -> f2 -> f3 -> f4 -> String.format(format, f1, f2, f3, f4);
  }
}

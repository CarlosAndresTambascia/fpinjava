package com.fpinjava.functions.exercise02_10;

public class FunctionExamples {

  public static <A, B, C> Function<A, Function<B, C>> curry(Function<Tuple<A, B>, C> f) {
    return f1 -> f2 -> f.apply(new Tuple<>(f1, f2));
  }
}

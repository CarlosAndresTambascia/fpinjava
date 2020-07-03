package com.fpinjava.functions.exercise02_03;


public class FunctionExamples {

  public static final Function<Integer, Function<Integer, Integer>> add = firstInteger -> secondInteger -> firstInteger + secondInteger;

  public static final BinaryOperator add2 =  firstInteger -> secondInteger -> firstInteger + secondInteger;

  public static final BinaryOperator mult =  firstInteger -> secondInteger -> firstInteger * secondInteger;
}

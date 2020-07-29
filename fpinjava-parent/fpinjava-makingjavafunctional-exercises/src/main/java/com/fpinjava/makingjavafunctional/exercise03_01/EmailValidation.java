package com.fpinjava.makingjavafunctional.exercise03_01;

import com.fpinjava.common.Function;

import java.util.regex.Pattern;

/*
EXERCISE 3.1 (HARD)
Try to decouple the validation from the effects applied.
 */

public class EmailValidation {

  static Pattern emailPattern =
      Pattern.compile("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$");

  static Function<String, Result<String>> emailChecker = s -> {
    if (s == null) {
      return Result.failure("email must not be null");
    } else if (s.length() == 0) {
      return Result.failure("email must not be empty");
    } else if (emailPattern.matcher(s).matches()) {
      return Result.success(s);
    } else {
      return Result.failure("email " + s + " is invalid.");
    }
  };

  public static void main(String... args) {
    emailChecker.apply("this.is@my.email").bind(success, failure);
    emailChecker.apply(null).bind(success, failure);
    emailChecker.apply("").bind(success, failure);
    emailChecker.apply("john.doe@acme.com").bind(success, failure);
  }

  static Effect<String> success = EmailValidation::send; // To be implemented

  private static void send(String s) {
    System.out.println("mail sent to" +s);
  }

  static Effect<String> failure = EmailValidation::error; // To be implemented

  private static void error(String s) {
    System.out.println("error logged " + s);
  }
}
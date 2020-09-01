package com.fpinjava.makingjavafunctional.exercise03_11;

import static com.fpinjava.makingjavafunctional.exercise03_10.CollectionUtilities.list;

import com.fpinjava.makingjavafunctional.exercise03_10.CollectionUtilities;

import java.util.List;


public class Range {

  public static List<Integer> range(int start, int end) {
    List<Integer> result = list();
    int temp = start;
    while(temp < end){
      result = CollectionUtilities.append(result, temp);
      temp = temp +1;
    }
    return result;
  }
}

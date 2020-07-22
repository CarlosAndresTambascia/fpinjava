package com.fpinjava.functions;

import com.fpinjava.common.List;

public class FunctionalIfElse {
    public <T> T ifElse(List<Boolean> conditions, List<T> ifTrue, T ifFalse) {
        return conditions.zip(ifTrue).flatMap(x -> x.first(y -> y._1))
                .map(x -> x._2).getOrElse(ifFalse);
    }
}

package com.bridgelab.maximum;

public class MaximumProblem {
    public Integer getMaxInteger(Integer num1 , Integer num2 , Integer num3) {
        Integer max = num1; // assume x is initially the largest

        if (num2.compareTo(max) > 0)
            max = num2; // num2 is the largest so far

        if (num3.compareTo(max) > 0)
            max = num3; // num3 is the largest

        return max; // returns the largest object
    }
}

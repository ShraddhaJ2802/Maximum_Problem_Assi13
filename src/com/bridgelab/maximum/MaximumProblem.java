package com.bridgelab.maximum;

public class MaximumProblem {
  /*  public Integer getMaxInteger(Integer num1 , Integer num2 , Integer num3) {
        Integer max = num1; // assume x is initially the largest

        if (num2.compareTo(max) > 0)
            max = num2; // num2 is the largest so far

        if (num3.compareTo(max) > 0)
            max = num3; // num3 is the largest

        return max; // returns the largest object
    }*/
    public Float getMaxFloat(Float num1 , Float num2 , Float num3) {
        Float max = num1; // assume x is initially the largest

        if (num2.compareTo(max) > 0)
            max = num2; // num2 is the largest so far

        if (num3.compareTo(max) > 0)
            max = num3; // num3 is the largest

        return max; // returns the largest object
    }
    public String getMaxString(String s1 , String s2 , String s3) {
        String max = s1; // assume x is initially the largest

        if (s2.compareTo(max) > 0)
            max = s2; // num2 is the largest so far

        if (s3.compareTo(max) > 0)
            max = s3; // num3 is the largest

        return max; // returns the largest object
    }
}

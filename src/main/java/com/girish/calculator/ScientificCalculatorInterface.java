package com.girish.calculator;

/**
 * Created by GirishKumarReddy on 1/29/2017.
 */
public interface ScientificCalculatorInterface extends SimpleCalculatorInterface {
    int square(int num);
    double squareRoot(int num);
    double power(double base, double exponent);
}

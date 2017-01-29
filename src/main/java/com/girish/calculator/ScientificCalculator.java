package com.girish.calculator;

/**
 * Created by GirishKumarReddy on 1/29/2017.
 */
public class ScientificCalculator implements ScientificCalculatorInterface {

    /** Square of a number.
     *
     * @param num
     * @return
     */
    public int square(int num) {
        return (num * num);
    }

    /** Squareroot of a number
     *
     * @param num
     * @return
     */
    public double squareRoot(int num) {
        return (Math.sqrt(num));
    }

    /** Power of a number.
     *
     * @param base
     * @param exponent
     * @return
     */
    public double power(double base, double exponent) {
        return (Math.pow(base, exponent));
    }

}

package com.girish.calculator;

import com.girish.calculator.interfaces.ScientificCalculatorInterface;

/**
 * Created by GirishKumarReddy on 1/29/2017.
 */
public class ScientificCalculator extends SimpleCalculator implements ScientificCalculatorInterface {

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

    /** Sin function
     *
     * @param num
     * @return
     */
    public double sin(double num){

        return (Math.sin(Math.toRadians(num)));
    }

    /** cosine function
     *
     * @param num
     * @return
     */
    public double cosine(double num){
        return (Math.cos(Math.toRadians(num)));
    }

    /** tangent function
     *
     * @param num
     * @return
     */
    public double tan(double num){

        return (Math.tan(Math.toRadians(num)));
    }

    /** Logarithmic function
     *
     * @param num
     * @return
     */
    public double log(double num){

        return (Math.log10(num));
    }
}

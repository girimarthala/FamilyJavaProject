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

    /** Sin function
     *
     * @param num
     * @return
     */
    public double sin(double num){
        return (Math.sin(num));
    }

    /** cosine function
     *
     * @param num
     * @return
     */
    public double cosine(double num){
        return (Math.cos(num));
    }

    /** tangent function
     *
     * @param num
     * @return
     */
    public double tan(double num){
        return (Math.tan(num));
    }

    /** Logarithmic function
     *
     * @param num
     * @return
     */
    public double log(double num){
        return (Math.log(num));
    }


    /** Adding two numbers.
     *
     * @param num1
     * @param num2
     * @return add result
     */
    public int add(int num1, int num2) {
        return (num1 + num2);
    }

    /** Subtract two numbers.
     *
     * @param num1
     * @param num2
     * @return subtract result
     */
    public int subtract(int num1, int num2) {
        return (num1 - num2);
    }

    /** Multiply two numbers
     *
     * @param num1
     * @param num2
     * @return Multiply result
     */
    public int multiply(int num1, int num2) {
        return (num1 * num2);
    }

    /** Divide two numbers.
     *
     * @param num1
     * @param num2
     * @return Divide result
     */
    public int divide(int num1, int num2) {
        return (num1/num2);
    }
}

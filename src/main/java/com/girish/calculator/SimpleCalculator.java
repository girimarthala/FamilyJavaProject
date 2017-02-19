package com.girish.calculator;

import com.girish.calculator.interfaces.SimpleCalculatorInterface;

/**
 * Created by GirishKumarReddy on 1/29/2017.
 */
public class SimpleCalculator implements SimpleCalculatorInterface {

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
        int result = 0;
        try{
            result =  (num1/num2);
        } catch (Exception e){
            System.out.println(e);
        }
        return result;
    }
}

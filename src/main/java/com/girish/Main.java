package com.girish;

import com.girish.calculator.ScientificCalculator;
import com.girish.calculator.SimpleCalculator;

/**
 * Created by GirishKumarReddy on 1/22/2017.
 */
public class Main {
    public static void main(String[] args) {
        /*
         * Call student class
         */
        Student student = new Student(1,"Girish");
        System.out.println("Student Name:"+ student.name);

        /*
         * Call add numbers class
         */
        AddNumbers addNumbers = new AddNumbers(10, 20);
        System.out.println("Add Numbers:"+ addNumbers.result);

        /*
         * Call calculator class.
         */
        SimpleCalculator calc = new SimpleCalculator();
        int addResult = calc.add(1,2);
        System.out.println("Add Result:"+ addResult);
        int subtractResult = calc.subtract(20,13);
        System.out.println("Subtract Result:"+ subtractResult);
        int multiplyResult = calc.multiply(2,5);
        System.out.println("Multiply Result:"+ multiplyResult);
        int divideResult = calc.divide(20,5);
        System.out.println("Divide Result:"+ divideResult);

        /*
         * Call scientific calculator class.
         */
        ScientificCalculator sciCalc = new ScientificCalculator();
        int squareResult = sciCalc.square(5);
        System.out.println("Square Result:"+ squareResult);
        double squareRootResult = sciCalc.squareRoot(25);
        System.out.println("Square Root Result:"+ squareRootResult);
        double powerResult = sciCalc.power(5, 2);
        System.out.println("Power Result:"+ powerResult);

        int addResultFromSciCalc = sciCalc.add(1,2);
        System.out.println("Add Result from SciCalc:"+ addResultFromSciCalc);
        int subtractResultFromSciCalc = sciCalc.subtract(20,13);
        System.out.println("Subtract Result from SciCalc:"+ subtractResultFromSciCalc);
        int multiplyResultFromSciCalc = sciCalc.multiply(2,5);
        System.out.println("Multiply Result from SciCalc:"+ multiplyResultFromSciCalc);
        int divideResultFromSciCalc = sciCalc.divide(20,5);
        System.out.println("Divide Result from SciCalc:"+ divideResultFromSciCalc);
    }
}

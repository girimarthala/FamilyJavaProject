package com.girish;

import com.girish.calculator.ScientificCalculator;
import com.girish.calculator.SimpleCalculator;

import java.util.Scanner;

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

        System.out.println("Select the type of calculator");
        System.out.println("1. Simple Calculator");
        System.out.println("2. Scientific Calculator");
        System.out.print("Enter Choice:");
        Scanner calculatorScan = new Scanner(System.in);
        int calculatorSelection = calculatorScan.nextInt();
        switch (calculatorSelection){
            case 1:
                SimpleCalculator calc = new SimpleCalculator();
                System.out.println("Select the operation.\n1. Add\n2. Subtract\n3. Multiply\n4. Divide");
                System.out.print("Enter Choice:");
                Scanner operationScan1 = new Scanner(System.in);
                Scanner typeNumbersScan = new Scanner(System.in);
                int operationSelection1 = operationScan1.nextInt();
                switch (operationSelection1){
                    case 1:
                        System.out.print("Type first number:");
                        int addNum1 = typeNumbersScan.nextInt();
                        System.out.print("Type second number:");
                        int addNum2 = typeNumbersScan.nextInt();
                        int addResult = calc.add(addNum1, addNum2);
                        System.out.print("Add Result:"+ addResult);
                        break;

                    case 2:
                        System.out.print("Type first number:");
                        int subNum1 = typeNumbersScan.nextInt();
                        System.out.print("Type second number:");
                        int subNum2 = typeNumbersScan.nextInt();
                        int subResult = calc.subtract(subNum1, subNum2);
                        System.out.print("Subtract Result:"+ subResult);
                        break;
                    case 3:
                        System.out.print("Type first number:");
                        int mulNum1 = typeNumbersScan.nextInt();
                        System.out.print("Type second number:");
                        int mulNum2 = typeNumbersScan.nextInt();
                        int mulResult = calc.multiply(mulNum1, mulNum2);
                        System.out.print("Multiply Result:"+ mulResult);
                        break;

                    case 4:
                        System.out.print("Type first number:");
                        int divNum1 = typeNumbersScan.nextInt();
                        System.out.print("Type second number:");
                        int divNum2 = typeNumbersScan.nextInt();
                        int divResult = calc.divide(divNum1, divNum2);
                        System.out.print("Multiply Result:"+ divResult);
                        break;
                    default:
                        System.out.print("Improper selection");
                        break;
                }
                break;
            case 2:
                ScientificCalculator sciCalc = new ScientificCalculator();
                System.out.println("Select the operation.\n1. Square\n2. Squareroot\n3. Power\n4. Sin\n5. Cosine\n6. Tangent");
                System.out.print("Enter Choice:");
                Scanner operationScan2 = new Scanner(System.in);
                Scanner typeNumbersScan2 = new Scanner(System.in);
                int operationSelection2 = operationScan2.nextInt();
                switch (operationSelection2){
                    case 1:
                        System.out.print("Type number:");
                        int squareNum = typeNumbersScan2.nextInt();
                        int squareResult = sciCalc.square(squareNum);
                        System.out.print("Square Result:"+ squareResult);
                        break;

                    case 2:
                        System.out.print("Type number:");
                        int squareRootNum = typeNumbersScan2.nextInt();
                        double squareRootResult = sciCalc.squareRoot(squareRootNum);
                        System.out.print("Square root Result:"+ squareRootResult);
                        break;
                    case 3:
                        System.out.print("Type base number:");
                        double powBase = typeNumbersScan2.nextDouble();
                        System.out.print("Type exponent number:");
                        double powExp = typeNumbersScan2.nextDouble();
                        double mulResult = sciCalc.power(powBase, powExp);
                        System.out.print("Power Result:"+ mulResult);
                        break;

                    case 4:
                        System.out.print("Type number:");
                        double sinNum = typeNumbersScan2.nextDouble();
                        double sinResult = sciCalc.sin(sinNum);
                        System.out.print("Sine Result:"+ sinResult);
                        break;

                    case 5:
                        System.out.print("Type number:");
                        double cosineNum = typeNumbersScan2.nextDouble();
                        double cosineResult = sciCalc.cosine(cosineNum);
                        System.out.print("Cosine Result:"+ cosineResult);
                        break;

                    case 6:
                        System.out.print("Type number:");
                        double tanNum = typeNumbersScan2.nextDouble();
                        double tanResult = sciCalc.tan(tanNum);
                        System.out.print("Tan Result:"+ tanResult);
                        break;
                    default:
                        System.out.println("Improper selection");
                        break;


                }

        }
        /*
         * Call calculator class.
         */
//        SimpleCalculator calc = new SimpleCalculator();
//        int addResult = calc.add(1,2);
//        System.out.println("Add Result:"+ addResult);
//        int subtractResult = calc.subtract(20,13);
//        System.out.println("Subtract Result:"+ subtractResult);
//        int multiplyResult = calc.multiply(2,5);
//        System.out.println("Multiply Result:"+ multiplyResult);
//        int divideResult = calc.divide(20,5);
//        System.out.println("Divide Result:"+ divideResult);

        /*
         * Call scientific calculator class.
         */
//        ScientificCalculator sciCalc = new ScientificCalculator();
//        int squareResult = sciCalc.square(5);
//        System.out.println("Square Result:"+ squareResult);
//        double squareRootResult = sciCalc.squareRoot(25);
//        System.out.println("Square Root Result:"+ squareRootResult);
//        double powerResult = sciCalc.power(5, 2);
//        System.out.println("Power Result:"+ powerResult);
//        double sinResult = sciCalc.sin(90);
//        System.out.println("Sin Result:"+ sinResult);
//        double cosineResult = sciCalc.cosine(90);
//        System.out.println("cosine Result:"+ cosineResult);
//        double tanResult = sciCalc.tan(90);
//        System.out.println("Tan Result:"+ tanResult);
//        double logResult = sciCalc.log(0);
//        System.out.println("Log Result:"+ logResult);
//
//        int addResultFromSciCalc = sciCalc.add(1,2);
//        System.out.println("Add Result from SciCalc:"+ addResultFromSciCalc);
//        int subtractResultFromSciCalc = sciCalc.subtract(20,13);
//        System.out.println("Subtract Result from SciCalc:"+ subtractResultFromSciCalc);
//        int multiplyResultFromSciCalc = sciCalc.multiply(2,5);
//        System.out.println("Multiply Result from SciCalc:"+ multiplyResultFromSciCalc);
//        int divideResultFromSciCalc = sciCalc.divide(20,5);
//        System.out.println("Divide Result from SciCalc:"+ divideResultFromSciCalc);
    }
}

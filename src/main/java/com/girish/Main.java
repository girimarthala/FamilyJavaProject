package com.girish;

/**
 * Created by GirishKumarReddy on 1/22/2017.
 */
public class Main {
    public static void main(String[] args) {
        Student student = new Student(1,"Girish");
        System.out.println(student.name);

        AddNumbers addNumbers = new AddNumbers(10, 20);
        System.out.println("Add Numbers:"+ addNumbers.result);

    }
}

package com.employeewagecomputation;
public class EmployeeWageComputation {
    //default constructor
    public EmployeeWageComputation() {
        System.out.println("Welcome to Employee Wage Computation!");
    }

    public static void main(String[] args) {
        //initialize the constructor by creating a object of a class
        EmployeeWageComputation employee =new EmployeeWageComputation();
        //Declaring the varibles.
        double isPresent = 1;
        double randomCheck = (double) Math.floor((Math.random() * 10) % 2);

        //Checking if the Employee is present!!!
        if (randomCheck == isPresent) {
            System.out.println("Employee is present");
        } else {
             System.out.println("Employee is absent");
        }

    }
}

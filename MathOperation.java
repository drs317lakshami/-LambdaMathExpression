package com.bridgelabz.lambda;

@FunctionalInterface
interface IMathFunction {
    int calculate(int a, int b);
}

public class MathOperation {

    public static void main(String[] args) {
        IMathFunction add = Integer::sum;
        IMathFunction multiply = (int a, int b) -> a * b;
        IMathFunction divide = (int a, int b) -> a / b;

        System.out.println("Addition is: " + add.calculate(6, 3));
        System.out.println("Multiplication is: " + multiply.calculate(6, 3));
        System.out.println("Division is: " + divide.calculate(6, 3));
    }
}

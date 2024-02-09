package java2;

import java.util.Scanner;

public class Calculator extends Extend1 {
    public static void main(String[] args) {

        char operator;
        double number1, number2, result;

        // create an object of Scanner class
        Scanner input = new Scanner(System.in);

        // ask users to enter operator
        System.out.println("Choose an operator: +, -, *, /, M, X, A, S, L, E");
        operator = input.next().charAt(0);

        // ask users to enter numbers
        System.out.println("Enter first number");
        number1 = input.nextDouble();

        System.out.println("Enter second number");
        number2 = input.nextDouble();

        switch (operator) {
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

            case '/':
                if (number2 != 0) {
                    result = number1 / number2;
                    System.out.println(number1 + " / " + number2 + " = " + result);
                } else {
                    System.out.println("Division by zero is not allowed!");
                }
                break;

            case 'M':
                result = Min((int) number1, (int) number2);
                System.out.println("Minimum of " + number1 + " and " + number2 + " is " + result);
                break;

            case 'X':
                result = Max((int) number1, (int) number2);
                System.out.println("Maximum of " + number1 + " and " + number2 + " is " + result);
                break;

            case 'A':
                result = Absolute((int) number1);
                System.out.println("Absolute value of " + number1 + " is " + result);
                break;

            case 'S':
                if (number1 >= 0) {
                    result = SquareRoot(number1);
                    System.out.println("Square root of " + number1 + " is " + result);
                } else {
                    System.out.println("Square root of a negative number is not defined.");
                }
                break;

            case 'L':
                if (number1 > 0) {
                    result = Logarithm(number1);
                    System.out.println("Logarithm of " + number1 + " is " + result);
                } else {
                    System.out.println("Logarithm of a non-positive number is not defined.");
                }
                break;

            case 'E':
                result = Exponential(number1);
                System.out.println("Exponential function of " + number1 + " is " + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }
    }
}

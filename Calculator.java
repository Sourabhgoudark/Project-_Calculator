package java2;
import java.util.Scanner;

public class Calculator extends Extend1 {
    public static void main(String[] args) {

        char operator;
        Double number1, number2, result;

        // create an object of Scanner class
        Scanner input = new Scanner(System.in);

        // ask users to enter operator
        System.out.println("Choose an operator: +, -, *, or /");
        System.out.println("M:module\tP:power\t S:square");
        operator = input.next().charAt(0);
        // ask users to enter numbers
        System.out.println("Enter first number");
        number1 = input.nextDouble();

        System.out.println("Enter second number");
        number2 = input.nextDouble();

        switch (operator) {

            // performs addition between numbers
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            // performs subtraction between numbers
            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            // performs multiplication between numbers
            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

            // performs division between numbers
            case '/':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;
            case 'S':
                System.out.println("The square of "+number1+" is: " + Extend1.Square(number1));
                System.out.println("The square of "+number2+" is: " + Extend1.Square(number2));
                break;
            case 'P':
                System.out.println(number1 + " ^ " + number2 + " = " + Extend1.Power(number1, number1));
                break;
            case 'M':
                System.out.println(number1 + " % " + number2 + " = "  + Extend1.Modulo(number1.intValue(), number2.intValue()));
                break;
            default:
                System.out.println("Invalid operator!");
                break;
        }
    }
}

package burns.chris.calculator;
import java.util.Scanner;

public class Display {

    Scanner input = new Scanner(System.in);

    public void calculate () {
        double result;
        double number1;
        double number2;
        BasicMath expression = new BasicMath();
        ScientificCalc scientificCalc = new ScientificCalc();
        System.out.println("please enter an operation");
        String userInput = input.nextLine();
        System.out.println("please enter a number");
        number1 = input.nextDouble();
        System.out.println("please enter another number");
        number2 = input.nextDouble();

        switch (userInput) {
            case "+":
                result = expression.add(number1,number2);
                break;
            case "-":
                result = expression.subtract(number1, number2);
                break;
            case "*":
                result = expression.multiply(number1, number2);
                break;
            case "/":
                result = expression.divide(number1, number2);
                break;
            case "2":
                result = expression.square(number1);
                break;
            case "2/": expression.squareRoot(number1);
                break;
            case "^":
                result = expression.exponent(number1);
                break;
            case "neg":
                result = expression.inverse();
                break;
            case "sn":
                result = scientificCalc.sine();
                break;
////          case "csn":
////            result =
            default:
                System.out.println("good work idiot");
                result = 0;
        }
        System.out.println(result);
    }

}

import java.util.Scanner;

public class Regnemaskine {

    public static void main(String[] args) {
        System.out.println("Enter two numbers:");
        Scanner input = new Scanner(System.in);

        double first = input.nextDouble();
        double secound = input.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = input.next().charAt(0);

        double result;

        switch(operator){

            case '+':
                result = first * secound;
                break;
            case '-':
                result = first - secound;
                break;
            case '*':
                result = first * secound;
                break;
            case '/':
                result = first / secound;
                break;


            default:
                System.out.printf("Error! Operator is not correct");
                return;
        }
        System.out.printf("%.1f %c %.1f = %.1f", first, operator, secound, result);
    }

}

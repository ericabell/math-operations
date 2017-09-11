import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number:");
        String firstString = scanner.nextLine();
        Double operand1 = Double.parseDouble(firstString);

        String secondString = "0";
        while( Double.parseDouble(secondString) == 0.0 ) {
            System.out.println("Please enter a number:");
            secondString = scanner.nextLine();
        }

        Double operand2 = Double.parseDouble(secondString);

        Double sum = operand1 + operand2;
        Double difference = operand1 - operand2;
        Double division = operand1 / operand2;
        Double multiplication = operand1 * operand2;
        Double remainder = operand1 % operand2;

        showResults(sum, difference, multiplication, division, remainder);

        // Other operators
        System.out.println("Extra Operators");
        // postfix
        operand2++;
        System.out.println(operand2);
        operand2--;
        System.out.println(operand2);
        // unary
        ++operand2;
        System.out.println(operand2);
        // shift
        byte result1 = 0b101010 >> 3;
        System.out.println(result1);
        // relational
        if( operand1 >= operand2 ) {
            System.out.println("Operand1 greater than or equal to operand2");
        }
        // bitwise
        byte result2 = 0b0110 & 0b0101;
        System.out.println("Result of AND: " + result2);



    }

    public static void showResults(Double sum,
                                   Double difference,
                                   Double multiplication,
                                   Double division,
                                   Double remainder) {

        System.out.println("Operand1 <operator> Operand2");
        System.out.println("The sum is: " + sum);
        System.out.println("The difference is: " + difference);
        System.out.println("The product is: " + multiplication);
        System.out.println("The quotient is: " + division);
        System.out.println("The remainder is: " + remainder);
    }
}

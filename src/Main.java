import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // grab a string and convert to a double
        System.out.println("Please enter a number:");
        String firstString = scanner.nextLine();
        Double operand1 = Double.parseDouble(firstString);


        // be sure the second number isn't zero
        String secondString = "0";
        while( Double.parseDouble(secondString) == 0.0 ) {
            System.out.println("Please enter a number:");
            secondString = scanner.nextLine();
        }
        Double operand2 = Double.parseDouble(secondString);

        // perform some basic operations on those inputs
        Double sum = operand1 + operand2;
        Double difference = operand1 - operand2;
        Double division = operand1 / operand2;
        Double multiplication = operand1 * operand2;
        Double remainder = operand1 % operand2;

        // print the results to the console
        showResults(sum, difference, multiplication, division, remainder);

        // Other operators -- EXTRA
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
        byte result3 = 0b1 | 0b0;
        System.out.println("Result of OR: " + result3);
        // logical
        if( true && false ) {
            System.out.println("This will never print!");
        } else {
            System.out.println("This will always print");
        }
        // ternary
        Double minVal = (operand1 < operand2) ? operand1 : operand2;
        System.out.println("min of operand1 and operand2 is: " + minVal);
        // assignment
        operand2 += 4;
        operand2 *= 5;
        System.out.println(operand2);

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

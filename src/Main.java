import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number:");
        String firstString = scanner.nextLine();
        System.out.println("Please enter a number:");
        String secondString = scanner.nextLine();

        Double operand1 = Double.parseDouble(firstString);
        Double operand2 = Double.parseDouble(secondString);

        Double sum = operand1 + operand2;
        Double difference = operand1 - operand2;
        Double division = operand1 / operand2;
        Double multiplication = operand1 * operand2;
        Double remainder = operand1 % operand2;

        showResults(sum, difference, multiplication, division, remainder);
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

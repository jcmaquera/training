package ActivityThreeNum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create a Scanner object to read input

        System.out.println("Enter three numbers:");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();


        System.out.println("Choose an operation (add, subtract, multiply):");
        String operation = input.next();

        double result = 0;
        if (operation.equals("add")) {
            result = num1 + num2 + num3;
        } else if (operation.equals("subtract")) {
            result = num1 - num2 - num3;
        } else if (operation.equals("multiply")) {
            result = num1 * num2 * num3;
        }
        System.out.println("Result: " + result);
    }
}
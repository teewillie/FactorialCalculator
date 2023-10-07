/**
 * @class: FactorialCalculator
 * @author: Fuaineaitee Willie
 * @version: 1.0
 * @written on: October 6, 2023
 * @course:  ITEC 2140 - 13 , Fall 2023
 *
 * Description:
 */

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer to calculate its factorial: ");
        int number = scanner.nextInt();

        scanner.close();

        long factorial = 1; // Initialize the factorial to 1
        int i = 1; // Initialize a counter to 1

        while (i <= number) {
            factorial *= i; // Multiply factorial by the current value of i
            i++;
        }

        System.out.println(number + "! = " + factorial);
    }
}



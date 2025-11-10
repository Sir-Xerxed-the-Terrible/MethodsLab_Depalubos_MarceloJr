/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodslab;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class MethodsLab {

    public static void userGreet() {
        System.out.println("Hello, Welcome to the Math Program.");
    }

    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int subtract(int a, int b) {
        int diff = a - b;
        return diff;
    }

    public static int multiply(int a, int b) {
        int mult = a * b;
        return mult;
    }

    public static int divide(int a, int b) {
        int quo = a / b;
        return quo;
    }

    public static int factorial(int c) {
        int result = 1;
        for (int i = c; i > 1; i--) {
            result *= i;
        }
        return result;
    }

    public static int sumArray(int[] arr) {
        int[] numbers = {0, 1, 2, 3, 4};

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;

    }
    public static boolean isPrime(int n) {
        if (n<=1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0) {
                return false;
            }           
        }
        return true;
    }    
    public static void main(String[] args) {
        userGreet();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println("Sum: " + add(a, b));
        System.out.println("Difference: " + subtract(a, b));
        System.out.println("Product: " + multiply(a, b));
        System.out.println("Quotient: " + divide(a, b));

        System.out.println("\nEnter a number for Factorial: ");
        int c = input.nextInt();

        System.out.println("\nFactorial: " + factorial(c));

        System.out.println("\nSum of Array of elements: " + sumArray(new int[]{0, 1, 2, 3, 4}));

        System.out.println("\nEnter a number to check prime: ");
        int n = input.nextInt();

        if (isPrime(n)) {
            System.out.println(n + " is a prime.");
        }
        else{
            System.out.println(n + " is not a prime.");
        }
    }
}


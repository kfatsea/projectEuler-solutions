/*
Author: Kona Fatsea
Date: 11/02/2025

Solve problem-001 of Euler Project to find sum of multiples of 3 or 5 below 
a given number n using the formula for the sum of an arithmetic series.  
*/ 

import java.util.Scanner;

public class ArithmeticProgression {

    /**
     * Entry point of the program. Handles user interaction and boundary checks.
     * Calls the sumMultiples method to calculate and display the sum of multiples 
     * of 3 or 5.
     * 
     * @param args Command-line arguments (not used in this program).
     */
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        if (n<=0){
            System.out.println("Please enter a positive integer.");
        } else {
            long result = sumMultiples(n);
            System.out.printf("The sum of multiples of 3 or 5 below %d is: %d\n", n, result);
        }

        scanner.close();
    }

    /**
     * Calculates the sum of multiples of 3 or 5 below a given number n. 
     * Uses the formula for the sum of an arithmetic progression. 
     * 
     * @param n The upper limit (exclusive) for the multiples. 
     * @return The sum of multiples of 3 or 5 below n. 
     */
    static long sumMultiples(int n){
        long count3 = (n-1)/3;
        long count5 = (n-1)/5;
        long count15 = (n-1)/15;

        long sum3 = sumArithmeticSeries(count3, 3);
        long sum5 = sumArithmeticSeries(count5, 5);
        long sum15 = sumArithmeticSeries(count15, 15);

        return sum3 + sum5 - sum15; // Include multiples of 3 and 5, subtract those of 15
        
    }
    
    /**	
     * Calculates the sum of an arithmetic sequence.
     * 
     * @param count Number of terms in the sequence.
     * @param d Common difference between terms.
     * 
     * @return The sum of the arithmetic sequence.
     */
    static long sumArithmeticSeries(long count, int d){ // @OverflowIssue: if `int`
        return count * (count + 1) / 2 * d;
    }

}
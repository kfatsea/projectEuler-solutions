/*
Author: Kona Fatsea
Date: 11/02/2025

Solve problem-001 of Euler Project to find sum of multiples of 3 or 5 below 
a given number n using the formula for the sum of an arithmetic series.  
*/ 

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;


public class ArithmeticProgression {
    // Create a Logger Instance
    private static final Logger logger = Logger.getLogger(ArithmeticProgression.class.getName());
    private static final int MULTIPLE_3 = 3;
    private static final int MULTIPLE_5 = 5;
    private static final int MULTIPLE_15 = 15; // LCM of 3 and 5


    /**
     * Entry point of the program. Handles user interaction and boundary checks.
     * Calls the sumMultiples method to calculate and display the sum of multiples 
     * of 3 or 5.
     * 
     * @param args Command-line arguments (not used in this program).
     */
    public static void main (String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter a positive integer: ");
            int n = scanner.nextInt();

            if (n <= 0) {
                logger.warning("User entered a non-poitive integer.");
                throw new IllegalArgumentException("The number is not a positive integer.");
            }
            
            logger.info("User entered a valid positive integer: " + n);
        	long result = sumMultiples(n);
            System.out.printf("The sum of multiples of 3 or 5 below %d is: %d%n", n, result);
        } catch (InputMismatchException e) {
            logger.warning("Invalid input. Please enter a positive integer.");
        } catch (IllegalArgumentException e) {
            logger.warning(e.getMessage());
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            logger.severe("An unexpected error occured: " + e.getMessage());
            System.out.println("An unexpected error ocurred. Please try again.");
        }
       
    }

    /**
     * Calculates the sum of multiples of 3 or 5 below a given number n. 
     * Uses the formula for the sum of an arithmetic progression. 
     * 
     * @param n The upper limit (exclusive) for the multiples. 
     * @return The sum of multiples of 3 or 5 below n. 
     */
    static long sumMultiples(int n){
        long sum3 = sumArithmeticSeries((n-1) / MULTIPLE_3, MULTIPLE_3);
        long sum5 = sumArithmeticSeries((n-1) / MULTIPLE_5, MULTIPLE_5);
        long sum15 = sumArithmeticSeries((n-1) / MULTIPLE_15, MULTIPLE_15);

        // Include multiples of 3 and 5, subtract those of 15 (to avoid double counting)
        return sum3 + sum5 - sum15;     
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
        // Claculate sum using arithmetic series formula: n/2 * (first_term + last_term)
        return count * (count + 1) / 2 * d;
    }

}
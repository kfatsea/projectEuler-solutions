/* 
Author: Kona Fatsea
Date: 11/02/2025

Solve problem-001 of Euler Project to find the sum of all multiples of 3 and 5
below a given number n brute force (iteration) in Java.
*/

import java.util.Scanner;                         

public class BruteForce { 

    /**
     * Entry point of the program. Manages user interaction by promptin
     * g for input and validating it. Calls the sumMultiples method to calculate and
     * display the sum of multiples of 3 or 5 below the provided integer. 
     * 
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter a positive integer: "); 
        int n = scanner.nextInt();    
        
        if (n<=0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int result = sumMultiples(n);
            System.out.printf("The sum of multiples of 3 or 5 below %d is: %d\n", n, result); 
        }
        
        scanner.close(); 
    }

    /**
     * Calculates the sum of all multiples of 3 or 5 below given n.
     * This method uses brute force iteration, iterating over every number below n,
     * and checking if it is a multiple of 3 or 5.
     * 
     * @param n The upper limit (exclusive)
     * @return The sum of all multiples of 3 and 5 below n
     */
    static int sumMultiples(int n){
        int iterations = 0;
        int totalSum = 0;

        for (int i = 1; i < n; i++){
            if (i % 3 == 0 || i % 5 == 0) {
            totalSum += i;
            }
        iterations++;
        }
    
       
        System.out.println("Number of Iterations: " + iterations);
        return totalSum; 
    }
}
"""
Author: Kona Fatsea
Date: 07/02/2025

Efficient Iteration (Inclusion - Exclusion) solution for problem-001 of Euler Project.

Problem Statement:
Find the sum of all multiples of 3 and 5 below a given number n.

The solutions include:
1) Brute Force Iteration <------
2) Efficient Iteration (Inclusion-Exclusion Set Theory)
3) Arithmetic Sequence
"""


# Good practice to seperate calculation logic into its own function. Helps with
# testing and maintenance. Main function typically handles user input and output in Python.
def sum_multiples(n):
    """
    Calculate the sum of multiples of 3 and 5 below n.

    Args:
    n (int): Upper limit (exclusive) for considering multiples.

    Returns:
    int: Sum of all multiples of 3 or 5 below n.
    """
    total_sum = 0
    iterations = 0  # To compare iterations of different methods
    for i in range(1, n):  # Iterates until n-1
        iterations += 1
        if i % 3 == 0 or i % 5 == 0:
            total_sum += i
    print(f"Number of Iterations: {iterations}")
    return total_sum


def main():
    """
    Main function to handle user input and calculate the sum of multiples

    Returns:
    tuple: A tuple containing the result and input number.
    """
    n = int(input("Enter an integer: "))
    result = sum_multiples(n)
    print(f"The sum of multiples of 3 or 5 below {n} is: {result}")
    return result, n

# Ensures the code within the main block runs when the script is run directly and
# not when imported as a module
if __name__ == "__main__":
    sum_of_multiples, upper_bound = main()

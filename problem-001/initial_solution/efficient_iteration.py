"""
Author: Kona Fatsea
Date: 07/02/2025

Efficient Iteration (Inclusion - Exclusion) solution for problem-001 of Euler Project.

Problem Statement:
Find the sum of all multiples of 3 and 5 below a given number n.

The solutions include:
1) Brute Force Iteration
2) Efficient Iteration (Inclusion-Exclusion Set Theory) <------
3) Arithmetic Sequence
"""


def sum_multiples(n):
    """
    Calculate the sum of multiples of 3 and 5 below n.

    Args:
    n (int): Upper limit (exclusive) for considering multiples.

    Returns:
    int: Sum of all multiples of 3 or 5 below n.
    """
    iterations = 0  # To compare iterations of different methods
    total_sum = 0
    for i in range(0, n, 3):
        total_sum += i
        iterations += 1
    for i in range(0, n, 5):
        total_sum += i
        iterations += 1
    for i in range(0, n, 15):
        total_sum -= i
        iterations += 1
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


if __name__ == "__main__":
    sum_of_multiples, upper_bound = main()

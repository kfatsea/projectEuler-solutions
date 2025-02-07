"""
Author: Kona Fatsea
Date: 07/02/2025

Arithmetic Sequence solution for problem-001 of Euler Project.

Problem Statement:
Find the sum of all multiples of 3 and 5 below a given number n. 

The solutions include:
1) Brute Force Iteration
2) Efficient Iteration (Inclusion-Exclusion Set Theory) 
3) Arithmetic Sequence <------
"""

def arithmetic_sum(count, d):
    """
    Calculate the sum of an arithmetic sequence.

    Args:
    count (int): Number of terms in the sequence.
    d (int): Common difference between terms. 

    Returns:
    int: Sum of the arithmetic sequence.
    """
    return count * (count + 1) // 2 * d     # Use // for integer division to ensure the result is always an integer


def sum_multiples(n):
    """
    Calculate the sum of multiples of 3 and 5 below n.

    Args: 
    n (int): Upper limit (exclusive) for considering multiples.

    Returns:
    int: Sum of all multiples of 3 or 5 below n. 
    """
    # Calculate the number of multiples for 3, 5, and 15 below n
    # This approach is used to calculate the number of terms in a sequence or progression WITHOUT using loops
    # We use (n - 1) to exclude n itself from the calculation
    mult3 = (n - 1) // 3
    mult5 = (n - 1) // 5
    mult15 = (n - 1) // 15

    # Calculate sums for each multiple
    sum_mult3 = arithmetic_sum(mult3, 3)
    sum_mult5 = arithmetic_sum(mult5, 5)
    sum_mult15 = arithmetic_sum(mult15, 15)

    # Calculate and return total sum - Inclusion/Exclusion principle: Counted mult15 twice.
    total_sum = sum_mult3 + sum_mult5 - sum_mult15
    return total_sum

def main():
    """
    Main function to handle user input and calculate the sum of multiples

    Returns: 
    tuple: A tuple containing the result and input number, or (None, None)
    if an error occurs.
    """
    try:
        n = int(input("Enter an integer: "))
        if n <= 0:
            raise ValueError("The number must be positive.")
        result = sum_multiples(n)
        print(f"The sum of multiples of 3 or 5 below {n} is: {result}")
        return result, n
    except ValueError as e:
        print(f"Invalid Input: {e}")
        return None, None # Maintains consistency, signals invalid input, and maintaind program flow. 

if __name__ == "__main__":
    result, n = main()

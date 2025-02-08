"""
Author: Kona Fatsea
Date: 07/02/2025

Solve problem-001 of Euler Project to find the sum of all multiples of 3 and 5
below a given number n using efficient iteration in Python.
"""


def sum_multiples(n):
    """
    Calculate the sum of multiples of 3 and 5 below n.

    Efficient Iteration:
    Iterate through multiples of 3 and 5 below the given number n
    and sums them while subtracting duplicate multiples of 15.

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

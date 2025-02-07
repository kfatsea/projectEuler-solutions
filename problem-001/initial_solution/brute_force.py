'''
Algorithm: SumMultiplesOf3And5 - Brute Force
Input: An integer `n`
Output: The sum of all multiples of 3 and 5 below `n`

1. Initialize sum to 0
2. For each number from 1 to `n-1`:
    2.1. If number is divisible by 3 or 5:
       2.1.1. Add number to sum

3. Return sum
'''

# Good practice to seperate calculation logic into its own function. Helps with testing and maintenance.
# Main function typically handles user input and output in Python. 
def sum_multiples(n):
    total_sum = 0
    for i in range(1, n): #Iterates until n-1
        if i % 3 == 0 or i % 5 == 0:
            total_sum += i
    return total_sum

def main():
    n = int(input("Enter an integer: "))
    result = sum_multiples(n)
    print(f"The sum of multiples of 3 or 5 below {n} is: {result}")
    return result, n
        
# Ensures the code within the main block runs when the script is run directly and
# not when imported as a module
if __name__ == "__main__":
    result, n = main()

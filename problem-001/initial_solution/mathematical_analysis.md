# Problem 001

## Problem Statement 
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.

## Mathematical Analysis 
### Problem Definition
Let $S$ be the set of all natural numbers less than $m$ that are multiples of $3$ or $5$:

$$S = \{x \in \mathbb{N} : x < m \text{ and } (x \mod 3 = 0 \text{ or } x\mod 5 = 0)\}$$

### Goal 
For a given $m$ I need a program that calculates the sum below: 
$$\text {Sum} = \sum_{x \in S} x$$

Or using an indicator function:

$$\text {Sum} = \sum_{x=1}^{m-1} x \cdot I(x \mod 3 = 0 \text{ or } x \mod 5 = 0)$$ 

### Key Observations 
- The set $S$ is finite. 
- Elements in $S$ are multiples of $3$, multiples of $5$, or both. 
- The largest possible element in $S$ is $m-1$.

### Potential Initial Approaches
1) **Brute** **Force Approach**  
    - **Methodology**  
    Iterate through all numbers  from $1$ to $m-1$, check if they are multiples of $3$ or $5$ and if so, add them to the sum. 
    - **Complexity**  
        - *Linear time complexity* $O(m)$ because for a given $m$, it performs $\approx m$ iterations.
        - *Constant space complexity* $O(1)$ because it only uses a single variable to store the running sum, regardless of input size. 
    - **Notes:**  
        - Works well with small values of $m$. 


2) **Mathematical Arithmetic Progression**  
    - **Methodology**  
    Use formulas for sum of arithmetic progressions of multiples of 3 and 5, then subtract overlaps (multiples of 15).
    - **Complexity**  
        - *Linear time complexity* $O(1)$ because it performs a constant number of operations regardless of $m$.
        - *Constant space complexity* $O(1)$.
    - **Notes:**        
        - More efficient, especially for large $m$.
        - Requires understanding of arithmetic series. 
        - Floating point issues -> integer division

3) **Efficient Iteration** 
    - **Methodology**  
    Iterate through multiples of $3$ and $5$ up to $m-1$, add them to the sum and avoid double-counting multiples of $15$.
    - **Complexity**  
        - *Linear Time Complexity* $O(m/3 + m/5 - m/15) \approx O(m/3) \approx O(m)$.  
        *For the full mathematical proof, consider number of multipliers below given m, shift and scale floor function, cut some terms*

        - *Constant space complexity* $O(1)$.
    - **Notes:**  
       - Fewer iterations than brute force. 
       - Still linear time complexity. 
       - Can be expressed mathematically with **Set Theory** using the inclusion-exclusion principle: $S = S(3) + S(5) - S(15)$ where $S(k)$ is the sum of multiples of $k$ less than $m$. Useful for generalizing the problem to more divisors. 


### Comparative Table
| Method | Time Complexity | Space Complexity | 
|--------|-----------------|-------------------|
| Direct Summation | $O(m)$ | $O(1)$ | 
| Mathematical Arithmetic Progression | $O(1)$ | $O(1)$ |
| Efficient Iteration | $O(m/3) \approx O(m)$ | $O(1)$ |

### Generalization:  
Can be generalized to find the sum of multiples of any set of numbers less than a given limit. 


# Developer Guide
Challenges faced while working on the project.

## 1. Integer Overflow in Java vs. Python
Java can experience integer overflow with large numbers, unlike Python. 
### Why Java overflows
- **Fixed-size Integers**: Java's `int` type is 32-bit, limited to values between -2^31 to 2^31 - 1.
- **Overflow**: Exceeding this range leads to incorrect results due to wrap-around.

### Code Reference
- **File**: `ArithmeticProgression.java`
- **Method**: `sumArithmeticSeries`
- **Note**: Look for `@OverflowIssue` tag in the code comments to identify potential overflow. 
```java
int sum = (n * (n+1)) / 2; // Check for @OverflowIssue tag
```

### Python's Advantage
- **Dynamic Integers**: Python integers automatically resize, preventing overflow.

### Java Solutions
- **Use `long`**: Opt for 64-bit `long` for larger numbers. 
- **Libraries**: Use `BigInteger` for very large ranges beyond `long` capacity.
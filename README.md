# DSA Prep

## Complexity
    - Time  : Number of Operations  : Big(O)
    - Space : Variables

## Time Complexity
    - O(1)
    - O(N)
    - O(n^2)
    - O(log n)

    Calculation for Number of operation based on input size:
         log2(10)                               ~ 3.3
         log2(100)  = log2(10^2) = 2*log2(10)   ~ 2 * 3.3   ~ 6.6
         log2(1000) = log2(10^3) = 3*log2(10)   ~ 3 * 3.3   ~ 10

## Solutions Accepted on coding platforms:
    - ALWAYS ACCEPTED   :         Number of Operations  < 10^7
    - MOSTLY ACCEPTED   : 10^7 <  Number of Operations  < 10^8
    - NEVER ACCEPTED    :         Number of Operations  > 10^8

## Based on input constraint we can decide on the approach of solution:
      - 0 <= N <= 20     : Exponential Complexity is expected    : Backtracking
      - 0 <= N <= 10^12  : Complexity in log(N) range            : Binary Search or DnC

## Rules for Calculation Big(O) from NOO
    - Calculate NOO
    - Ignore number multiplying the highest term
    - Ignore lower terms

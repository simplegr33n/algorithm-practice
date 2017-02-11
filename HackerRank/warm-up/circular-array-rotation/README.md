https://www.hackerrank.com/challenges/time-conversion

Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.

Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.

## Input Format

A single string containing a time in 12-hour clock format (i.e.: `hh:mm:ssAM` or `hh:mm:ssPM`), where `01 <= hh <= 12` and `00 <= mm, ss <= 59`.

## Output Format

Convert and print the given time in 24-hour format, where `00 <= hh <= 23`.

## Sample Input
```
07:05:45PM
```
## Sample Output
```
19:05:45
```

///

John Watson performs an operation called a right circular rotation on an array of integers, `[a0,a1,...a(n-1)]` . After performing one right circular rotation operation, the array is transformed from `[a0,a1,...a(n-1)]` to `[a(n-1),a0,...a(n-2)]`.

Watson performs this operation `k`  times. To test Sherlock's ability to identify the current element at a particular position in the rotated array, Watson asks `q` queries, where each query consists of a single integer, `m`, for which you must print the element at index `m` in the rotated array (i.e., the value of `a(m)`).

## Input Format

The first line contains `3` space-separated integers, `n`, `k`, and `q`, respectively. 
The second line contains `n` space-separated integers, where each integer `i` describes array element `a(i)` (where `0 <= i <= n`). 
Each of the  subsequent lines contains a single integer denoting `m`.

## Constraints

`1 <= n <= 10^5`
`1 <= a(i) <= 10^5`
`1 <= k <= 10^5`
`1 <= q <= 500`
`0 <= m <= n-1`

## Output Format

For each query, print the value of the element at index `m`  of the rotated array on a new line.

## Sample Input 0
```
3 2 3
1 2 3
0
1
2
```
## Sample Output 0
```
2
3
1
```
## Explanation 0

After the first rotation, the array becomes `[3,1,2]`. 
After the second (and final) rotation, the array becomes `[2,3,1]`.

Let's refer to the array's final state as array `b`. For each query, we just have to print the value of `b(m)` on a new line:

1. `m=0`, so we print `2` on a new line.
2. `m=1`, so we print `3` on a new line.
3. `m=2`, so we print `1` on a new line.
https://www.hackerrank.com/challenges/bon-appetit

Anna and Brian order `n` items at a restaurant, but Anna declines to eat any of the `kth` item (where `0 <= k <= n`) due to an allergy. When the check comes, they decide to split the cost of all the items they shared; however, Brian may have forgotten that they didn't split the `kth` item and accidentally charged Anna for it.

You are given `n`, `k`, the cost of each of the `n` items, and the total amount of money that Brian charged Anna for her portion of the bill. If the bill is fairly split, print `Bon Appetit`; otherwise, print the amount of money that Brian must refund to Anna.

### Input Format

The first line contains two space-separated integers denoting the respective values of `n` (the number of items ordered) and `k` (the 0-based index of the item that Anna did not eat). 
The second line contains `n` space-separated integers where each integer `i` denotes the cost, `c[i]`, of item `i` (where `0<= i <= n`). 
The third line contains an integer, `b(charged)`, denoting the amount of money that Brian charged Anna for her share of the bill.

### Output Format

If Brian did not overcharge Anna, print Bon Appetit on a new line; otherwise, print the difference (i.e., ) that Brian must refund to Anna (it is guaranteed that this will always be an integer).

### Sample Input 0
```
4 1
3 10 2 9
12
```
### Sample Output 0
```
5
```
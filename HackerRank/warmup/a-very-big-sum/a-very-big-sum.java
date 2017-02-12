import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in = new Scanner(System.in);
        
        long sum = 0;
        
        int arrLength = in.nextInt();
        
        for (int i = 0; i < arrLength; i++) {
            long add = Long.valueOf(in.next());
            sum += add;
        }
        
        System.out.println(sum);
        
    }
}
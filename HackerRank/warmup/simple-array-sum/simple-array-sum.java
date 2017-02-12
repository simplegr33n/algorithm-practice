import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in = new Scanner(System.in);
       
        int sum = 0;
        
        int a = in.nextInt();
        
        for (int i = 0; i < a; i++) {
            int add = Integer.valueOf(in.next());
            sum += add;
        }
        
        System.out.println(sum);
        
    }
}
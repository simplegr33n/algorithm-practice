import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in = new Scanner(System.in);
        
        int diff = 0;
        
        int a = in.nextInt();
        
        int rightToLeft = 0;
        int leftToRight = 0;
        
        for (int i = 0; i < a*a; i++) {
            
            int square = in.nextInt();
            
            int divd = i / a;
            
            if (i == a * divd + divd) {
                leftToRight += square;
            }
            
                    
            if (i == a * (divd + 1) - (divd + 1)) {
                rightToLeft += square;
            }
    
            
            
        }
        
        diff = leftToRight - rightToLeft;
        
        if (diff < 0) {
            diff *= -1;
        }
        
        System.out.println(diff);
        
        
    }
}
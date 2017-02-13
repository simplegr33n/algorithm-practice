import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        int validPairs = 0;
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        for(int count = 0; count < n; count++){
            int iTest = a[count];
            
            for(int bount = count + 1; bount < n; bount++) {
                int jTest = a[bount];
                
                if (((iTest + jTest) % k) == 0) {
                    validPairs++;
                }            
            }
        }
        
        System.out.println(validPairs);
    }
}

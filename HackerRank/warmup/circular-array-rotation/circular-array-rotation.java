import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        
        // Get array a[]  
        List<Integer> a = new ArrayList<Integer>();
        
        for(int a_i=0; a_i < n; a_i++){
            a.add(in.nextInt());
        }
        
        // Rotate array k times
        for(int a_k=0; a_k < k; a_k ++) {
            
            a.add(0, a.get(n-1));  
            a.remove(n);
        
        }
        
        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();
            System.out.println(a.get(m));
        }
    }
}
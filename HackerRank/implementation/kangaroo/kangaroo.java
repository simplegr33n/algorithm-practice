import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        
        boolean sameSpot = false;
        
        for (int i = 0; i < 10000; i++) {
            int dist1 = (v1 * i) + x1;
            int dist2 = (v2 * i) + x2;
            
            if (dist1 == dist2) {
                sameSpot = true;
            }   
        }
        
        if (sameSpot) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

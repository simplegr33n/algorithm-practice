import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
           
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        
        double positiveFrac = 0;
        double negativeFrac = 0;
        double zeroFrac = 0;
        
        for (int i = 0; i < a; i++) {
            
            int it = in.nextInt();
            
            if (it > 0) {
                positiveFrac++;
            }
            
            if (it < 0) {
                negativeFrac++;
            }
            
            if (it == 0) {
                zeroFrac++;
            }
        }
        
        positiveFrac = positiveFrac / a;
        negativeFrac = negativeFrac / a;
        zeroFrac = zeroFrac / a;
        
        System.out.println(positiveFrac);
        System.out.println(negativeFrac);
        System.out.println(zeroFrac);
        
    }
}
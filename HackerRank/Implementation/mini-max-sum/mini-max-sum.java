
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
  
        List longValues = new ArrayList();
        
        longValues.add(in.nextLong());
        longValues.add(in.nextLong());
        longValues.add(in.nextLong());
        longValues.add(in.nextLong());
        longValues.add(in.nextLong());
        
        long minimumValue = (long) Collections.min(longValues);
        long maximumValue = (long) Collections.max(longValues);
        
        long sumValue = 0;
        
        for (int i = 0; i < longValues.size(); i++) {
            sumValue += (long) longValues.get(i);
        }
        
        long minSum = sumValue - minimumValue;
        long maxSum = sumValue - maximumValue;
        
        System.out.println(maxSum + " " + minSum);
    }
}
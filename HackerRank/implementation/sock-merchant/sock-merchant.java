import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList c = new ArrayList<Integer>();
        
        int totalPairs = 0;
        
        int c_i = 0;
        
        for(c_i = 0; c_i < n; c_i++){
            
            c.add(in.nextInt());  
            
            for (int sock = 0; sock < c.size(); sock++) {
            
                if (c.get(sock) == c.get(c_i) && (sock != c_i)) {
              
                    c.remove(c_i);
                    c.remove(sock);
                    
                    c_i -= 2;
                    n -= 2;

                    totalPairs++;
                }  
            }
        }
      
        System.out.println(totalPairs);
        
    }
}
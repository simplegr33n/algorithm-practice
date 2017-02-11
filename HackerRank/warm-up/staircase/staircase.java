import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in = new Scanner(System.in);
        
        int a = in.nextInt();
        
        int above = 0;
        
        String send = "";
        
        for (int i = 0; i <= a; i++) {
            
            for (int e = 0; e < (a - i); e++) {             
                send += " ";     
            }
            
            for (int j = 0; j < i; j++) { 
                send += "#";      
            }
         
            if (send.contains("#")) {
                System.out.println(send);
            }
            
            send = "";

        }
    }  
}
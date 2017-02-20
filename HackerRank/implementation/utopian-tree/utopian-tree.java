import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt();
        
        for (int i = 0; i < T; i++) {
            int cycles = scanner.nextInt();
            
            int start = 1;
            
            for(int cycle = 0; cycle < cycles; cycle++) {
                if (cycle % 2 == 0 || (cycle == 0)) {
                    start *= 2;
                 
                } else {
                    start +=1;
                }
            }
            
            System.out.println(""+start);
        }
    }
}
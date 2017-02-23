import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int cases = scanner.nextInt();
        
        for (int currentCase = 0; currentCase < cases; currentCase++) {
            
            int students = scanner.nextInt();
            int threshold = scanner.nextInt();
            
            int onTime = 0;
            
            for (int student = 0; student < students; student++){
                if(scanner.nextInt() <= 0) {
                    onTime++;
                }   
            }
            
            if (onTime >= threshold) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
            
        }    
    }
}
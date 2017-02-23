import java.io.*;
import java.util.*;


public class Solution {
    
    public static void main(String[] args) {
     
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
       
        ArrayList a = new ArrayList<Integer>();
        for(int a_i=0; a_i < n; a_i++){
            a.add(in.nextInt());
        }
        
        ArrayList b = new ArrayList<Integer>();
        for(int b_i=0; b_i < m; b_i++){
            b.add(in.nextInt());
        }
        
        int betweenCount = 0; 
        
        for(int tryit = 1; tryit <= 100; tryit++) {
            
            int aFactorX = 0; 
            int bFactorX = 0;
            
            
            for(int afact = 0; afact < n; afact++) {
                
                int tempA = (int) a.get(afact);
  
                if ((tryit % tempA) == 0) {    
                    if(aFactorX == 0) {
                        aFactorX = 1;
                    }
                } else {
                    aFactorX = -1;
                }
            } 
            
            for(int bfact = 0; bfact < m; bfact++) {
                
                int tempB = (int) b.get(bfact);
                
                if ((tempB % tryit) == 0) {    
                    if(bFactorX == 0) {
                        bFactorX = 1;
                    }
                } else {
                    bFactorX = -1;
                }
            }
            
            if ((aFactorX == 1) && (bFactorX == 1)) {
                
                betweenCount++;
            }
            
        }

        System.out.println(betweenCount);
    
    }
}
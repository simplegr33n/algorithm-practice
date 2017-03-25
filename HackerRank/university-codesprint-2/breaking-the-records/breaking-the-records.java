import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int recLow = -1;
        int recHigh = -1;
        
        int breakLow = 0;
        int breakHigh = 0;
        
        int n = in.nextInt();
        int[] score = new int[n];
        for(int score_i=0; score_i < n; score_i++){
            if (score_i == 0) {
                int tempScore = in.nextInt();
                
                recLow = tempScore;
                recHigh = tempScore;
            } else {
                int tempScore = in.nextInt();
                
                if (tempScore > recHigh) {
                    recHigh = tempScore;
                    breakHigh++;
                } 
                if (tempScore < recLow) {
                    recLow = tempScore;
                    breakLow++;
                }      
            }
        }
        
        System.out.print(breakHigh + " " + breakLow);

    }
}
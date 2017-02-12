import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i=0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        
        // Start at 1 as all letters at least 1 tall
        // Increase if a letter in the word is found to be taller
        int tallestLetterHeight = 1;
        
        for (int i = 0; i < word.length(); i++) {
            
            // if the value from letter in the height array excedes current tallest letter, update tallestLetterHeight
            if (h[alphabet.indexOf(word.charAt(i))] > tallestLetterHeight) {
            
                
                tallestLetterHeight = h[alphabet.indexOf(word.charAt(i))];   
                
            }
        }
        
        int area = word.length() * tallestLetterHeight;
        
        System.out.println(area);
        
        
    }
}
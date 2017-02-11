import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */     
        
        Scanner in = new Scanner(System.in);
       
        String a0 = in.next();
        
        String charAtter = String.valueOf(a0.charAt(8));
        String charSeven = String.valueOf(a0.charAt(7));
        
      
        if (charAtter.equals("P")) {
            
            String hours = "" + a0.charAt(0) + a0.charAt(1);
            
            int hoursInt = Integer.valueOf(hours) + 12;
            
            if (hoursInt == 24) {
                hours = "12";
            } else {
                hours = String.valueOf(hoursInt);
            }
            
            
            System.out.println("" + hours + a0.charAt(2)+ a0.charAt(3)+ a0.charAt(4)+ a0.charAt(5)+ a0.charAt(6)+ a0.charAt(7));
            
            
       
        } else if (charSeven.equals("P")) {
            
            String hours = "" + a0.charAt(0);
            
            int hoursInt = Integer.valueOf(hours) + 12;
            
            if (hoursInt == 24) {
                hours = "12";
            } else {
                hours = String.valueOf(hoursInt);
            }           
            
            System.out.println("" + hours + a0.charAt(1) + a0.charAt(2)+ a0.charAt(3)+ a0.charAt(4)+ a0.charAt(5)+ a0.charAt(6));
            
        
        } else {
            
            
            String hours = "" + a0.charAt(0) + a0.charAt(1);
            
            if (hours.equals("12")) {
                  System.out.println("0" + "0" + a0.charAt(2)+ a0.charAt(3)+ a0.charAt(4)+ a0.charAt(5)+ a0.charAt(6) +a0.charAt(7)); 
                
            }   else {
            
            
                String isSemiColon = String.valueOf(a0.charAt(1));

                if (isSemiColon.equals(":")) {
                    System.out.println("0" + a0.charAt(0) + a0.charAt(1) + a0.charAt(2)+ a0.charAt(3)+ a0.charAt(4)+ a0.charAt(5)+ a0.charAt(6)); 
                } else {
                    System.out.println("" + a0.charAt(0) + a0.charAt(1) + a0.charAt(2)+ a0.charAt(3)+ a0.charAt(4)+ a0.charAt(5)+ a0.charAt(6)+ a0.charAt(7)); 
                }
            
            }
        }
        
    }
}
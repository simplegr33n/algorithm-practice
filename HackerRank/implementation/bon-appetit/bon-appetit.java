import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        
        List itemPrices = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {  
               itemPrices.add(scanner.nextInt());
        }
        
        int charged = scanner.nextInt();
        
        itemPrices.remove(k);
        
        int sharedTotal = 0;
        
        for (int item = 0; item < n-1; item++) {
            int current = (int) itemPrices.get(item);
            sharedTotal += current;
        }
            
        
        int splitShared = sharedTotal / 2;
        
        if (charged > splitShared) {
            int difference = charged - splitShared;
            System.out.println(String.valueOf(difference));
        } else {
            System.out.println("Bon Appetit");
        }     
        
    }
}
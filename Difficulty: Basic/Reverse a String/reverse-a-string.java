//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Driver {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String str = read.readLine();
            System.out.println(new Solution().reverseString(str));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        
        // class Solution {
   
        char[] charArray = s.toCharArray();
        int left = 0, right = charArray.length - 1;
        
        while (left < right) {
            // Swap characters
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            
            // Move pointers
            left++;
            right--;
        }
        
        return new String(charArray);
    }
    
    public static void main(String[] args) {
        System.out.println(reverseString("Geeks")); // Output: "skeeG"
        System.out.println(reverseString("for"));   // Output: "rof"
        System.out.println(reverseString("a"));     // Output: "a"
    }
}

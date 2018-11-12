package lee.code.code_479__Largest_Palindrome_Product;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C479_MainClass {
public static String testCase = "1";
/*
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);
            
            int ret = new Solution().largestPalindrome(n);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}

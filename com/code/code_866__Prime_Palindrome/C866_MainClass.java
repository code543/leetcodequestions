package lee.code.code_866__Prime_Palindrome;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C866_MainClass {
public static String testCase = "6";
/*
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int N = Integer.parseInt(line);
            
            int ret = new Solution().primePalindrome(N);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}

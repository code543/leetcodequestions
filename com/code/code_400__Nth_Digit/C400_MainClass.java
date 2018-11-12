package lee.code.code_400__Nth_Digit;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C400_MainClass {
public static String testCase = "3";
/*
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);
            
            int ret = new Solution().findNthDigit(n);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}

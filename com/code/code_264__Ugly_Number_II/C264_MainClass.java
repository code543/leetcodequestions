package lee.code.code_264__Ugly_Number_II;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C264_MainClass {
public static String testCase = "10";
/*
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);
            
            int ret = new Solution().nthUglyNumber(n);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}

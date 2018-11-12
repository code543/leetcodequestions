package lee.code.code_29__Divide_Two_Integers;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C29_MainClass {
public static String testCase = "10\n3";
/*
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int dividend = Integer.parseInt(line);
            line = in.readLine();
            int divisor = Integer.parseInt(line);
            
            int ret = new Solution().divide(dividend, divisor);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}

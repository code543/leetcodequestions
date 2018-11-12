package lee.code.code_788__Rotated_Digits;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C788_MainClass {
public static String testCase = "10";
/*
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int N = Integer.parseInt(line);
            
            int ret = new Solution().rotatedDigits(N);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}

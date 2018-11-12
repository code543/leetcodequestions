package lee.code.code_357__Count_Numbers_with_Unique_Digits;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C357_MainClass {
public static String testCase = "2";
/*
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);
            
            int ret = new Solution().countNumbersWithUniqueDigits(n);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}

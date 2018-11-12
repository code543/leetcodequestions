package lee.code.code_343__Integer_Break;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C343_MainClass {
public static String testCase = "2";
/*
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);
            
            int ret = new Solution().integerBreak(n);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}

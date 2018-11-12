package lee.code.code_397__Integer_Replacement;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C397_MainClass {
public static String testCase = "8";
/*
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);
            
            int ret = new Solution().integerReplacement(n);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}

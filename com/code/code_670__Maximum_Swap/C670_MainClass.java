package lee.code.code_670__Maximum_Swap;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C670_MainClass {
public static String testCase = "2736";
/*
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int num = Integer.parseInt(line);
            
            int ret = new Solution().maximumSwap(num);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}

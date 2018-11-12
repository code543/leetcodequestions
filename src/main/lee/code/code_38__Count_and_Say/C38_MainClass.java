package lee.code.code_38__Count_and_Say;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C38_MainClass {
public static String testCase = "1";
/*
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);
            
            String ret = new Solution().countAndSay(n);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}

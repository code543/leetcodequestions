package lee.code.code_7__Reverse_Integer;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C7_MainClass {
public static String testCase = "123";
/*
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int x = Integer.parseInt(line);
            
            int ret = new Solution().reverse(x);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}

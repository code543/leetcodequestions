package lee.code.code_69__Sqrt_x_;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C69_MainClass {
public static String testCase = "4";
/*
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int x = Integer.parseInt(line);
            
            int ret = new Solution().mySqrt(x);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}

package lee.code.code_70__Climbing_Stairs;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C70_MainClass {
public static String testCase = "2";
/*
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);
            
            int ret = new Solution().climbStairs(n);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}

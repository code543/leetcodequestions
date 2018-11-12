package lee.code.code_201__Bitwise_AND_of_Numbers_Range;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C201_MainClass {
public static String testCase = "5\n7";
/*
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int m = Integer.parseInt(line);
            line = in.readLine();
            int n = Integer.parseInt(line);
            
            int ret = new Solution().rangeBitwiseAnd(m, n);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}

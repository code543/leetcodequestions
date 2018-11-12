package lee.code.code_600__Non_negative_Integers_without_Consecutive_Ones;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C600_MainClass {
public static String testCase = "1";
/*
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int num = Integer.parseInt(line);
            
            int ret = new Solution().findIntegers(num);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}

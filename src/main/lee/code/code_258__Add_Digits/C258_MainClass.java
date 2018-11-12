package lee.code.code_258__Add_Digits;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C258_MainClass {
public static String testCase = "38";
/*
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int num = Integer.parseInt(line);
            
            int ret = new Solution().addDigits(num);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}

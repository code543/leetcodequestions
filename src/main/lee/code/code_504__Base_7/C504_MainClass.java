package lee.code.code_504__Base_7;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C504_MainClass {
public static String testCase = "100";
/*
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int num = Integer.parseInt(line);
            
            String ret = new Solution().convertToBase7(num);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}

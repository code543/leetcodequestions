package lee.code.code_12__Integer_to_Roman;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C12_MainClass {
public static String testCase = "3";
/*
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int num = Integer.parseInt(line);
            
            String ret = new Solution().intToRoman(num);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}

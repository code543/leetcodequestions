package lee.code.code_273__Integer_to_English_Words;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C273_MainClass {
public static String testCase = "123";
/*
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int num = Integer.parseInt(line);
            
            String ret = new Solution().numberToWords(num);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}

package lee.code.code_556__Next_Greater_Element_III;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C556_MainClass {
public static String testCase = "12";
/*
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);
            
            int ret = new Solution().nextGreaterElement(n);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}

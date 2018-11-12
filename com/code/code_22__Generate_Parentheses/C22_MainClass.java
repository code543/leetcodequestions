package lee.code.code_22__Generate_Parentheses;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C22_MainClass {
public static String testCase = "3";
/*
    public static String Utils.stringListToString(List<String> stringList) {
        StringBuilder sb = new StringBuilder("[");
        for (String item : stringList) {
            sb.append(item);
            sb.append(",");
        }
    
        sb.setCharAt(sb.length() - 1, ']');
        return sb.toString();
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);
            
            List<String> ret = new Solution().generateParenthesis(n);
            
            String out = Utils.stringListToString(ret);
            
            System.out.print(out);
        }
    }
}

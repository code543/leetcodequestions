package lee.code.code_592__Fraction_Addition_and_Subtraction;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C592_MainClass {
public static String testCase = "\"-1/2+1/2\"";
/*
    public static String Utils.stringToString(String input) {
        return JsonArray.readFrom("[" + input + "]").get(0).asString();
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            String expression = Utils.stringToString(line);
            
            String ret = new Solution().fractionAddition(expression);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}

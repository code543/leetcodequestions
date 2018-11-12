package lee.code.code_537__Complex_Number_Multiplication;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C537_MainClass {
public static String testCase = "\"1+1i\"\n\"1+1i\"";
/*
    public static String Utils.stringToString(String input) {
        return JsonArray.readFrom("[" + input + "]").get(0).asString();
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            String a = Utils.stringToString(line);
            line = in.readLine();
            String b = Utils.stringToString(line);
            
            String ret = new Solution().complexNumberMultiply(a, b);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}

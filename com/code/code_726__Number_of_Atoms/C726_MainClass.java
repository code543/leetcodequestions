package lee.code.code_726__Number_of_Atoms;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C726_MainClass {
public static String testCase = "\"H2O\"";
/*
    public static String Utils.stringToString(String input) {
        return JsonArray.readFrom("[" + input + "]").get(0).asString();
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            String formula = Utils.stringToString(line);
            
            String ret = new Solution().countOfAtoms(formula);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}

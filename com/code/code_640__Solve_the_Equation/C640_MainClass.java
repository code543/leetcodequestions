package lee.code.code_640__Solve_the_Equation;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C640_MainClass {
public static String testCase = "\"x+5-3+x=6+x-2\"";
/*
    public static String Utils.stringToString(String input) {
        return JsonArray.readFrom("[" + input + "]").get(0).asString();
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            String equation = Utils.stringToString(line);
            
            String ret = new Solution().solveEquation(equation);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}

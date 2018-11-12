package lee.code.code_838__Push_Dominoes;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C838_MainClass {
public static String testCase = "\".L.R...LR..L..\"";
/*
    public static String Utils.stringToString(String input) {
        return JsonArray.readFrom("[" + input + "]").get(0).asString();
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            String dominoes = Utils.stringToString(line);
            
            String ret = new Solution().pushDominoes(dominoes);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}

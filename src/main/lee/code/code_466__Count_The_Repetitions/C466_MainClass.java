package lee.code.code_466__Count_The_Repetitions;


import java.util.*;
import lee.util.*;
import java.io.*;
import com.eclipsesource.json.*;
import java.text.*;

public class C466_MainClass {
public static String testCase = "\"acb\"\n4\n\"ab\"\n2";
/*
    public static String Utils.stringToString(String input) {
        return JsonArray.readFrom("[" + input + "]").get(0).asString();
    }
    
*/
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(testCase));
        String line;
        while ((line = in.readLine()) != null) {
            String s1 = Utils.stringToString(line);
            line = in.readLine();
            int n1 = Integer.parseInt(line);
            line = in.readLine();
            String s2 = Utils.stringToString(line);
            line = in.readLine();
            int n2 = Integer.parseInt(line);
            
            int ret = new Solution().getMaxRepetitions(s1, n1, s2, n2);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
